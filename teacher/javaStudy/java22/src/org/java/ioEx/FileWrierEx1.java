package org.java.ioEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrierEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");
		
		//1. 입력		
		InputStreamReader iReader= new InputStreamReader(System.in);
		
		//2. 파일로 출력
		FileWriter fWriter=null;//  텍스트 파일로 저장
		
		String fileName="E:\\saveFiles\\test0125.txt";
//		String fileName="C:\\saveFiles\\test0125.txt";
//		String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test0125.txt";
		
		FileReader fReader=null;
		
		try {
			// 텍스트 파일로 저장
			fWriter=new FileWriter(fileName);
			
			int inData=0;
			//입력시 -1 ->ctr+z, 파일을 읽어드릴 때 -1-> 파일의 끝
			while((inData=iReader.read() ) !=-1) {
				fWriter.write(inData);
			}
			
			// 파일 불러오기
			fReader=new FileReader(fileName);
			
			int inData2 = 0;
			// 파일의 끝 -1
			while ((inData2 = fReader.read()) != -1) {

				System.out.print((char)inData2);
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				iReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
