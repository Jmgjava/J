package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// ����(�ؽ�Ʈ+����)�� �о���δ�.

		FileInputStream fStream = null;
		String fileName = "C:\\sample\\test1.txt";

		try {
			fStream = new FileInputStream(fileName);

			int inData = 0;

			// file�� data�� �ϳ��� -> ������ ������ -1
			while ((inData = fStream.read()) != -1) {
				// �ϳ��� ��� -> ���� �� ���� ����
				System.out.print((char) inData);

			}

		} catch (FileNotFoundException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
			e.printStackTrace();
		}
	}

}
