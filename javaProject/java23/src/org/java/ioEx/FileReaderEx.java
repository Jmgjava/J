package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// 파일(텍스트파일만) 읽어들인다.

		String fileName = "C:\\sample\\test3.txt";
		// 1. 파일을 불러와야 한다.
		File file = new File(fileName); // ( File 객체는 )생성하자 마자 값을 입력(초기화)

		// 2. 파일 내용을 읽어들인다.
		FileReader fReader = null;
		try {
			fReader = new FileReader(file);

			int inData = 0;
			while ((inData = fReader.read()) != -1) {
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 실패");
			e.printStackTrace();
		} finally {
			try {
				if (fReader != null)
					fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
