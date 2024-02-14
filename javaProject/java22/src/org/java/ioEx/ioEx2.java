package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ioEx2 {

	public static void main(String[] args) {
		System.out.println("IO2");
		// ����
		InputStreamReader inputReader = null;

		try {
			System.out.println("�̸��� �Է� �ϼ���: ");
			inputReader = new InputStreamReader(System.in);

			BufferedReader reader = new BufferedReader(inputReader);

			String name = reader.readLine();

			System.out.println("�̸�: " + name);

			// ����, ����, ���� ���� �Է� -> ����, ��� ���

			System.out.println("��������: ");
			String kor = reader.readLine();
			System.out.println("��������: ");
			String eng = reader.readLine();
			System.out.println("��������: ");
			String math = reader.readLine();

			int sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math); // String -> int
//			String sum = (kor+eng+math);

			double avg = (double) sum / 3;

			String.format("%.2f", avg); // �Ҽ� 2° �ڸ�

			System.out.println("����: " + sum + " ���: " + String.format("%.2f", avg));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
