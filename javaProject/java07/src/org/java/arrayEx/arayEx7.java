package org.java.arrayEx;

public class arayEx7 {
	public static void main(String[] args) {
		System.out.println("char�� �迭 -> String���� ����");
		// 'C','A','F','E'�� String ��ȯ -> ��ȯ�ڵ带 �̿��ؼ� ���

		char[] arrCh = new char[] { 'C', 'A', 'F', 'E' };
		String[] binnery = { 
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" 
				};

		String result = "";
		// 4�� ���� C,A,F,E
		for (int i = 0; i < arrCh.length; i++) {
			if (arrCh[i] >= '0' && arrCh[i] <= '9') {
				// ���� ���� ���� �ʴ´�.
				result += binnery[arrCh[i] - 'A' + 10];
			} else {
				// ���� ���� �Ǵ� ���๮
				result += binnery[arrCh[i] - 'A' + 10];
			}
		}

		System.out.println("��ȯ�� ���ڿ� �迭");
		System.out.println(new String(arrCh));

		System.out.println("��ȯ�� String�� �迭");
		System.out.println(result);

	}

}
