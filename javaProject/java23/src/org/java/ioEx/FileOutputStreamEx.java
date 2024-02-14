package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		System.out.println("FileOutputStream");
		// ����(�ؽ�Ʈ+����)�� �����Ѵ�. (���ϻ���)

		FileOutputStream foutput = null; // finally�� �ֱ� ����
		String fileName = "C:\\sample\\test2.out";
		
		FileInputStream fStream = null;

		try {
			// ���� ���� //
			// �Է��� �޾Ƽ� ���� ��Ų��. -> Write() ->
			foutput = new FileOutputStream(fileName);

			// 10 ~ 1 ���ڸ� ���� ->
			for (int i = 0; i < 10; i++) {
				int num = 10 - i; // 10 9 8 ..... 1
				System.out.println(num + "<--");
				foutput.write(num); // ���� �б�
			}
			// ���� ���� //

			// ���� �о����.
			fStream = new FileInputStream(fileName);
			int inData = 0;

			// file�� data�� �ϳ��� -> ������ ������ -1
			while ((inData = fStream.read()) != -1) {
				// �ϳ��� ��� -> ���� �� ���� ����
				System.out.print((char) inData);

			}

		} catch (FileNotFoundException e) {
			System.out.println("���Ͼ���");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� �б� ����");
			e.printStackTrace();
		} finally {
			try {
//				if (foutput != null)
				foutput.close();
			} catch (IOException e) {
				System.out.println("����");
				e.printStackTrace();
			}
		}

	}

}
