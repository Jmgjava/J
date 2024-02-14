package org.java.basicApi;

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println("Wrapper");

		// �ڽ� -> �⺻�ڷ��� -> ��ü��

		int i = 10;
		Integer i1 = i;

		new Integer(10);
		// �ڵ��ڽ�
		Integer i2 = 10;
		Character ch = 'c';
		Boolean bool = false; // new Boolean(false);

		// ��ڽ� -> ��ü�� -> �⺻�ڷ���
		Integer i4 = new Integer(10);
		int i3 = i4.intValue();
		// �ڵ���ڽ�
		int i5 = new Integer(10);
		int i6 = i4;

		// 2������ ��ȯ���� �� 1�� ����
		System.out.println(Integer.bitCount(i6));
		// ���ڿ��� ����(int)�� �ٲ���
		System.out.println(Integer.parseInt("111"));
		// ���ڿ� ���ڸ� -> ���������� �ٲ��� ,2(2������ �ٲ���), 4(4������ �ٲ���)
		System.out.println(Integer.parseInt("10", 2));
		// ������ -> ���ڿ��������� ��ȯ
		System.out.println(Integer.toBinaryString(10));
		// 16���� -> 123456789abcdef -> CSS���� ���
		System.out.println(Integer.toHexString(10));
		// 8����
		System.out.println(Integer.toOctalString(10));

	}

}
