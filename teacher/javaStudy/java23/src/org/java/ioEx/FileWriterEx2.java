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

		// 1. �ֿܼ� ������ �Է� -> �ϳ���
		InputStreamReader inReader = null;

		// 3. ������ ������ URL -> ������ �ڿ�(resource)�� ��� -> ��ġ
		String fileName = "c:\\test51.txt";

		// 2. FileWriter��ü ���� -> �ؽ�Ʈ ���� ����� ��
		FileWriter fWriter = null;

		// 4. �ҷ��� ���� (�ؽ�Ʈ)
		FileReader fReader = null;

		try {
			fWriter = new FileWriter(fileName);
			inReader = new InputStreamReader(System.in);

			int inData = 0;
			// ctr+z (-1) �Է½ñ���1
			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData); // �ϳ��� ����
			}

			//=======================================
			// �ؽ�Ʈ ���� �ҷ��ͼ� �����͸� �ֿܼ� ���
			fReader = new FileReader(fileName);

			int inData2 = 0;
			while ((inData2 = fReader.read()) != -1) {
				System.out.print((char) inData2);
			}
			//=======================================

		} catch (IOException e) {
			System.out.println("����� Fail!");
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
