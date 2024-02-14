package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// ����(�ؽ�Ʈ���ϸ�) �о���δ�.

		String fileName = "C:\\sample\\test3.txt";
		// 1. ������ �ҷ��;� �Ѵ�.
		File file = new File(fileName); // ( File ��ü�� )�������� ���� ���� �Է�(�ʱ�ȭ)

		// 2. ���� ������ �о���δ�.
		FileReader fReader = null;
		try {
			fReader = new FileReader(file);

			int inData = 0;
			while ((inData = fReader.read()) != -1) {
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
			e.printStackTrace();
		} finally {
			try {
				if (fReader != null)
					fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
