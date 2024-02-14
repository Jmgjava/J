package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		System.out.println("IO");

		// 1. �ֿܼ� ������ �Է�
		InputStreamReader inReader = null;
		// 2. ������ ������ URL -> ������ �ڿ�(resource)�� ��� -> ��ġ
		String fileName = "C:\\sample\\test4.txt"; // URL
		// 3. file ��ü ���� -> �ؽ�Ʈ ���� ����� ��
		File file = new File(fileName);
		FileWriter fWriter = null;

		try {

			fWriter = new FileWriter(file);
			inReader = new InputStreamReader(System.in);

			int inData = 0;
			// ctrl+z (-1) �Է½ñ���
			while ((inData = inReader.read()) != -1) {
				fWriter.write(inData); // �ϳ��� fWriter�� ����
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
