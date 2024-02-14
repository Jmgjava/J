package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// 파일(텍스트+이진)을 읽어들인다.

		FileInputStream fStream = null;
		String fileName = "C:\\sample\\test1.txt";

		try {
			fStream = new FileInputStream(fileName);

			int inData = 0;

			// file의 data를 하나씩 -> 파일의 마지막 -1
			while ((inData = fStream.read()) != -1) {
				// 하나씩 출력 -> 공백 및 엔터 포함
				System.out.print((char) inData);

			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
			e.printStackTrace();
		}
	}

}
