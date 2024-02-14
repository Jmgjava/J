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

			while ((inData = fileInputStream.read()) != -1) { // ������ ���������� �ϳ��� ����

				System.out.print(inData);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� Fail");
			e.printStackTrace();
		}
	}

}
