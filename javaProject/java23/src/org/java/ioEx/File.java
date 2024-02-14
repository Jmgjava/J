package org.java.ioEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {

	public static void main(String[] args) {
		System.out.println("IO");

		InputStreamReader iReader = new InputStreamReader(System.in);

		try {
			FileWriter fWriter = new FileWriter(new java.io.File("C:\\sample\\test4.txt"));

//			FileReader fReader = new FileReader(new java.io.File("C:\\sample\\test4.txt"));

			int inData = 0;

			while ((inData = iReader.read()) != -1) {
				fWriter.write(inData);
			}

		} catch (IOException e) {
			System.out.println("파일 입출력 실패");
			e.printStackTrace();
		} finally {
			try {
				if (iReader != null)
					iReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
