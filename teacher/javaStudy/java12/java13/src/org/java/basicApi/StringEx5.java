package org.java.basicApi;

public class StringEx5 {

	public static void main(String[] args) {

		// .do ������ ���ڿ��� ���� -> �ϳ��� �ż��� substring(),substring(��,��)
		String query1 = "/register.do";// -> /register" , .do
		String query2 = "/list.do";// " -> "/list" , .do
		String query3 = "/modify.do";// -> "/modify" , .do
		String query4 = "/memberDelete.do";// -> "/memberDelete , .do

		// ***Ư�����ڿ�.substring(0, ������ ���ڿ�����);
		// 0���� ���� ���ڿ��� ������ ���� (0, ������ ���ڿ�����)
		System.out.println(query1.substring(0, query1.length() - 3));
		System.out.println(query2.substring(0, query2.length() - 3));
		System.out.println(query3.substring(0, query3.length() - 3));
		System.out.println(query4.substring(0, query4.length() - 3));

		// Ư�� ���ڿ� �����ڿ�(���ڼ�3��) .do -> �ֿܼ� ǥ�� substring(�����ý��۹���)
		// ������ ���۹��� -> ��ü���ڿ� ���� - �����ù��ڿ� ����
		System.out.println(query1.substring(query1.length() - 3));
		System.out.println(query2.substring(query2.length() - 3));
		System.out.println(query3.substring(query3.length() - 3));
		System.out.println(query4.substring(query4.length() - 3));

	}
}
