package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoEx5 {

	public static void main(String[] args) {
		
		System.out.println("IO");
		
		String fileName="‪‪C:\\Windows\\system.ini";
		
		FileInputStream fileInputStream=null;
		
		try {
			
			fileInputStream=new FileInputStream(fileName);
			
			int inData=0;
			
			while( (inData=fileInputStream.read())!=-1){ // 파일에 마지막까지 
				
				System.out.print((char)inData);				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력Fail!!");
			e.printStackTrace();
		}		
	}
}
