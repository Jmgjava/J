package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {

		System.out.println("Exception");

		Scanner input = new Scanner(System.in);
		System.out.println("10 / ������ �� �Է�(����,0����): ");
		int i = 10;

		try {
			// ���ܰ� �߻� �� ���� �ڵ� ��ġ try{}
			// 1.
			double d = i / input.nextInt(); // ArithmeticException -> 0���� �������� �� ����
			// ���� �߻� ��ġ ������ ��ɹ��� ���� ���� �ʴ´�. try{}��
			// 2.
			System.out.println(d);
			System.out.println("���ܰ� �߻������ʰ� ���� ����");

		} catch (ArithmeticException e) {
			// 3. ���ܰ� �߻� �� -> ���ܰ� �߻��� �ȵǸ� catch�� ����ȵ�
			e.printStackTrace(); // �ֿܼ� ���� �������
			System.out.println("���ܳ���: " + e.getMessage()); // ���������� ���ڿ��� ���
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {

			// 4.
			System.out.println("���� ������ ������� ������ ����");
		}
		// 5.
		System.out.println("���α׷� ��������");
	}

}
