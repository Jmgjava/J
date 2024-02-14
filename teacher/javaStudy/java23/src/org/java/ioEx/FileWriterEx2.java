package org.java.ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx2 {

	public static void main(String[] args) {
		
		System.out.println("IO");

		// 1. 콘솔에 데이터 입력 -> 하나씩
		InputStreamReader inReader = null;

		// 3. 생성된 파일의 URL -> 웹상의 자원(resource)의 경로 -> 위치
		String fileName = "c:\\test51.txt";

		// 2. FileWriter객체 생성 -> 텍스트 파일 만드는 것
		FileWriter fWriter = null;

		// 4. 불러올 파일 (텍스트)
		FileReader fReader = null;

		try {
			fWriter = new FileWriter(fileName);
			inReader = new InputStreamReader(System.in);

			int inData = 0;
			// ctr+z (-1) 입력시까지1
			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData); // 하나씩 저장
			}

			//=======================================
			// 텍스트 파일 불러와서 데이터를 콘솔에 출력
			fReader = new FileReader(fileName);

			int inData2 = 0;
			while ((inData2 = fReader.read()) != -1) {
				System.out.print((char) inData2);
			}
			//=======================================

		} catch (IOException e) {
			System.out.println("입출력 Fail!");
			e.printStackTrace();
		} finally {
			try {
				if (fWriter != null)
					fWriter.close();
				if (inReader != null)
					inReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
