package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioEx5 {

	public static void main(String[] args) {

		System.out.println("IO5");

		String fileName = "C:\\Windows\\system.ini";

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(fileName);

			int inData = 0;

			while ((inData = fileInputStream.read()) != -1) { // 파일의 마지막까지 하나씩 읽음

				System.out.print(inData);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 Fail");
			e.printStackTrace();
		}
	}

}
