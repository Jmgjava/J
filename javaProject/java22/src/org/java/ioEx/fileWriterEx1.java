package org.java.ioEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileWriterEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");

		// 1. 입력

		InputStreamReader iReader = new InputStreamReader(System.in);

		// 2. 파일로 출력

		FileWriter fWriter = null; // 텍스트 파일로 저장

		String fileName = "C:\\sample\\test1.txt";

		FileReader fReader = null;

		try {
			fWriter = new FileWriter(fileName);// 텍스트 파일로 저장

			int inData = 0;
			// 입력시 -1 -> ctrl+z, 파일을 읽어들일 때 -1 -> 파일의 끝
			while ((inData = iReader.read()) != -1) {
				fWriter.write(inData);
			}

			fReader = new FileReader(fileName);

			int inData2 = 0;
			// 파일 불러오기
			while ((inData2 = fReader.read()) != -1) {
				System.out.println((char)inData2);
			}

		} catch (IOException e) {
			System.out.println("파일 생성 실패");
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
