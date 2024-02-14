package org.java.ioEx;

import java.io.IOException;
import java.io.InputStream;

public class IoBasicEx1 {

	public static void main(String[] args) {
		System.out.println("IO");
		//입력 -> 출력 
		InputStream inStream=System.in;// 시스템 입력객체
		
		try {
			int inData=inStream.read();// byte -> int
			System.out.println("입력 데이터: "+inData);
			System.out.println("출력(문자) 데이터: "+(char)inData);			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				inStream.close(); // 입출력 예외와 상관없이 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
