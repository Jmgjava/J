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
//			new InputStreamReader(fileInputStream,"UTF-8"); // ���ڿ� ó�� ��� ������Ʈ �⺻
//			new InputStreamReader(fileInputStream,"MS949"); // ���ڿ� ó����� ��Ŭ���� �⺻

			int inData = 0;

			while ((inData = fileReader.read()) != -1) {
				System.out.println((char)inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� Fail");
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
