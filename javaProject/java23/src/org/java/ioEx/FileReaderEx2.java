package org.java.ioEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		System.out.println("IO");

		FileReader fReader = null;
		String fileName = "C:\\sample\\test3.txt";

		try {
			fReader = new FileReader(fileName);

			int inData = 0;
			while ((inData = fReader.read()) != -1) {
				System.out.println(inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 실패");
			e.printStackTrace();
		} finally {
			try {
				if (fReader != null)
					fReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
