package org.java.arayEx;

public class arayEx2 {

	public static void main(String[] args) {
		System.out.println("�迭");

		// int�� �����͸� ������ �� �ִ� �迭 arrInt ����
		int[] arrInt = new int[5];

		System.out.println(arrInt.length);
		// 10~50
		// �迭�� �ε����� ��ü �迭�� ���̺��� -1 �۴�. (�ε��� < ��ü�迭)
		// 5
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 10; // �ʱ�ȭ
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println();

		// char�� �迭 -> ���ĺ� ������ �� -> �ƽ�Ű�ڵ� Ȱ��

		char[] arrCh = new char[5];

		arrCh[0] = 'a';

		for (int i = 0; i < arrCh.length; i++) {
			arrCh[i] = (char) (i + 97); // 'a', 'b', 'c', 'd', 'e'
			System.out.println("arrCh[" + i + "]=" + arrCh[i]);
		}

		// String
		String[] arrStr = new String[5];

		arrStr[0] = "�ѱ�";

		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i]="<li>��ǰ���"+i+"</li>";
			System.out.println("arrStr[" + i + "]=" + arrStr[i]);
		}

	}

}
