package org.java.exceptionEx2;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx10 {
											// SQL ���� ���� -> DB����
											// ������ DAO���� ��� �޼ҵ忡 ����
											// ���� ������ü -> �������̽�
	public static void main(String[] args) throws SQLException {

		System.out.println("Exception");

		Scanner input = new Scanner(System.in);
		System.out.println("������ �� �Է�: ");

		double avg = 0.0;

		try {
			int num = input.nextInt();
//			avg = (double) 10 / num;
			avg = (double) (10 / num);

			// ���� �߻��� ���� �ȵ�
			System.out.println("���� ����");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
			e.printStackTrace();
			// catch(error)���� "error"��� ������ ���� �ʴ´ٸ� �� ������ ������� ����.
		} catch (InputMismatchException e) {
			System.out.println("Ÿ���� ���� ����");
			e.printStackTrace();
		} catch (NumberFormatException e) { // "111", "ffgwe"
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// **�Է¹��� ����(�Ű�����)�� Ʋ�� ���
			// ��й�ȣ ����, �˻��� , ȭ���̺�...
			e.printStackTrace();
		} finally {
			System.out.println("���ܿ� ������� ������ ����");
		}

		System.out.println("���: " + avg);
		System.out.println("���α׷� �Ϸ�");

		input.close();
	}

}
