package org.java.ioEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		System.out.println("IO");

		// File 객체 없이 사용
		FileReader fReader = null;
		String fileName = "C:\\test3.txt";

		try {
			fReader = new FileReader(fileName);

			int inData = 0;
			while ((inData = fReader.read()) != -1) {
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 Fail!");
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
