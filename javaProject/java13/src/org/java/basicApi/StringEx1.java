package org.java.basicApi;

public class StringEx1 {

	public static void main(String[] args) {

		System.out.println("String");

		// �������
		String str1 = new String("String"); // new ��ü
		String str2 = "String"; // ���ͷ� *** ���� �ʿ�

		// char[] �̿��ؼ� ����
		char[] ch = { 'S', 't', 'r', 'i', 'n', 'g' };
		String str3 = new String(ch);

		System.out.println(str1 + "," + str2 + "," + str3);

		System.out.println("�ּ� ��");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);

		System.out.println("������");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));

	}

}
