package org.java.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoBasicEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		// �ֿܼ��� �Է��� �ް� -1(ctrl+z)�� �Է��� �ϸ� ����

		InputStreamReader iReader = new InputStreamReader(System.in);

		try {

			while (true) {
				int inData = iReader.read(); // �Է°���(byte -> int)
				System.out.println("�Է� ������: " + inData);
				// ctrl+z -> -1
				if (inData == -1) {
					System.out.println("while�� ����");
					break; // while�� ����

				}
				System.out.println("��� ������: " + (char) inData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				iReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
