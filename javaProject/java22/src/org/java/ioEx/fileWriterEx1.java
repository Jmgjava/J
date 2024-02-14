package org.java.ioEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileWriterEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");

		// 1. �Է�

		InputStreamReader iReader = new InputStreamReader(System.in);

		// 2. ���Ϸ� ���

		FileWriter fWriter = null; // �ؽ�Ʈ ���Ϸ� ����

		String fileName = "C:\\sample\\test1.txt";

		FileReader fReader = null;

		try {
			fWriter = new FileWriter(fileName);// �ؽ�Ʈ ���Ϸ� ����

			int inData = 0;
			// �Է½� -1 -> ctrl+z, ������ �о���� �� -1 -> ������ ��
			while ((inData = iReader.read()) != -1) {
				fWriter.write(inData);
			}

			fReader = new FileReader(fileName);

			int inData2 = 0;
			// ���� �ҷ�����
			while ((inData2 = fReader.read()) != -1) {
				System.out.println((char)inData2);
			}

		} catch (IOException e) {
			System.out.println("���� ���� ����");
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
