package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutoutStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// 파일(텍스트+이진)을 저장한다.(파일만들기)

		FileOutputStream outputStream = null;
//		String fileName = "C:\\test1.out";
		String fileName = "E:\\saveFiles\\test1.out";
		
		FileInputStream fiStream = null;

		try {
			//// 파일 저장 ////
			// 입력을 받아서 저장을 시킨다. -> write() ->
			outputStream = new FileOutputStream(fileName);
			// 10~1숫자를 저장 -> outputStream
			for (int i = 0; i < 10; i++) {
				int num = 10 - i;// 10 9 8 7,,,,1
				System.out.println(num+" <<-");
				outputStream.write(num);
			}
			//// 파일 저장 ////
			
			// 파일 읽어드린다.
			fiStream=new FileInputStream(fileName);			
			int inData = 0;
			// 파일의 데이터를 하나씩 -> 파일의 마지막 -1
			while ((inData = fiStream.read()) != -1) {
				// 하나씩 출력 -> 공백, 엔터 포함
				System.out.print((char) inData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 Fail!");
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
				fiStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
