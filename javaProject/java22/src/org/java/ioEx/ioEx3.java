package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ioEx3 {

	public static void main(String[] args) {
		System.out.println("IO3");

		InputStreamReader reader = null;

		int rs = 0;

		try {
			reader = new InputStreamReader(System.in);
			BufferedReader bReader = new BufferedReader(reader);

			while (true) {
				System.out.println("���� �Է�: ");
				rs = bReader.read();// ���� -> -1����
				if (rs == -1)
					break;
			}
			System.out.println("�����հ�: " + rs);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
