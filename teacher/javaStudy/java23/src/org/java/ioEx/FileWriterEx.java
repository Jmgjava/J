package org.java.ioEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		System.out.println("IO");

		// 1. 콘솔에 데이터 입력 -> 하나씩
		InputStreamReader inReader = null;

		// 3. 생성된 파일의 URL -> 웹상의 자원(resource)의 경로 -> 위치
		String fileName = "c:\\test4.txt";

		// 2. File객체 생성 -> 텍스트 파일 만드는 것
		File file = new File(fileName);
		FileWriter fWriter = null;

		try {
			fWriter = new FileWriter(file);
			inReader = new InputStreamReader(System.in);

			int inData = 0;
			// ctr+z (-1) 입력시까지
			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData); // 하나씩 저장
			}

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
