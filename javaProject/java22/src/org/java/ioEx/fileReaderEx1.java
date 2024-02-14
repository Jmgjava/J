package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileReaderEx1 {

	public static void main(String[] args) {
		System.out.println("FileReader");

		String fileName = "C:\\sample\\pl.txt";

		File file = new File(fileName);

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(file);
			
//			FileInputStream fileInputStream = new FileInputStream(fileName);
//			new InputStreamReader(fileInputStream,"UTF-8"); // 문자열 처리 방법 프로젝트 기본
//			new InputStreamReader(fileInputStream,"MS949"); // 문자열 처리방법 이클립스 기본

			int inData = 0;

			while ((inData = fileReader.read()) != -1) {
				System.out.println((char)inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 Fail");
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
