package org.java.arrayEx;

public class arayEx6 {
	public static void main(String[] args) {
		System.out.println("�迭");
		// char -> String

		char[] arrCh1 = new char[5];

		// 'A','B','C','D','E' �� arrCh1�� �߰�
		// 0 1 2 3 4

		int alpha = 65;
		for (int i = 0; i < arrCh1.length; i++) {
			arrCh1[i] = (char) (alpha + i);
			System.out.print(arrCh1[i] + " ");
		}
		System.out.println();
		// ���ڿ��迭 -> String
		String chStr = new String(arrCh1);
		System.out.println(chStr);
		
		// �������迭 -> String
		// ������ -. ������ -> char�� �迭
		char[] arrCh2 = new char[] { 'C', 'A', 'F', 'E' };
		String chStr2 = new String(arrCh2);
		System.out.println(chStr2);
		
		// int�� �Ʒ�(char, short, byte)�� ����� �ڵ����� int������ ��ȯ
		
		System.out.println((char)('C'+2));
		System.out.println('a'>'A');
	}
}
