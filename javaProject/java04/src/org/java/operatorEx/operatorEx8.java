package org.java.operatorEx;

public class operatorEx8 {

	public static void main(String[] args) {
		System.out.println("���� ������");

		int i = 10;

		System.out.println(i++); // �� ó�� �� ���� 10
		System.out.println(i);// 11
		System.out.println(++i); // �� ó�� �� ����
		System.out.println(i);// 12

		System.out.println(i--); // �� ó�� �� ���� 12
		System.out.println(i);// 11
		System.out.println(--i); // �� ó�� �� ���� 10
		System.out.println(i);// 10

		System.out.println("-----------------------------");

		// 1���� 10���� �ֿܼ� ���

		// ���� for���� 0���� ���� -> �迭�� ������ 0�������� ����
		for (int ii = 0; ii < 10; ii++) {
			// ���ǽ��� true�� ��ɹ� �����ϰ�
			// 1 ���� (ii++)
			// 1���� 10����

			int iii = ii + 1;
			System.out.println(iii + " ");
		}

	}

}
