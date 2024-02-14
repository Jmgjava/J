package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileWriterEx2 {

	public static void main(String[] args) {
		System.out.println("IO");

		// 1. �ֿܼ� ������ �Է�
		InputStreamReader inReader = null;
		// 2. ������ ������ URL -> ������ �ڿ�(resource)�� ��� -> ��ġ
		String fileName = "C:\\sample\\test4.txt"; // URL
		// 3. file ��ü ���� -> �ؽ�Ʈ ���� ����� ��
		FileWriter fWriter = null;
		FileReader fReader = null;

		try {
			fWriter = new FileWriter(fileName);
			inReader = new InputStreamReader(System.in);

			int inData = 0;
			// ctrl+z (-1) �Է½ñ���
			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData); // �ϳ��� fWriter�� ����
			}

			// �ؽ�Ʈ ���� �ҷ��ͼ� �����͸� �ֿܼ� ���
			fReader = new FileReader(fileName);

			int inData2 = 0;
			while ((inData2 = fReader.read()) != -1) {
				System.out.println((char) inData2);
			}

		} catch (IOException e) {
			System.out.println("���� ����� ����");
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
