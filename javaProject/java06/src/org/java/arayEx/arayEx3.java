package org.java.arayEx;

public class arayEx3 {

	public static void main(String[] args) {
		System.out.println("�迭");
		// for-each�� -> ���õ� ��ü(�迭)�� ����Ʈ�� ��� ��Ҹ� ��ȸ
		// �ݺ��� -> ��ü�� �ݺ���

		int[] arrInt = new int[5];
		for (int i = 0; i < arrInt.length; i++) {
//			if(i==5) break;
//			System.out.println(i);
			arrInt[i] = i;// 0~4
			if (arrInt[i] % 2 == 0)
				System.out.println(arrInt[i]);
		}
		System.out.println("==============================================");
		// for-each -> ��ü�� �ݺ���
		// ��ü �迭�� ��Ҹ� ��ȸ
		for (int el : arrInt) {
			// ¦���� 2�� ����̴�
			// if(el%2==0) System.out.println(el);
			// ¦���� �ڿ��� �߿��� 2�� ������ �������� ��
			if (el % 2 == 0) {
				if (el != 0)
					System.out.println(el);
			}
		}

	}

}
