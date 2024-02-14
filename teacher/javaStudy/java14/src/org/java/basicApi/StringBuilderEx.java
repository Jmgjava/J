package org.java.basicApi;

public class StringBuilderEx {

	public static void main(String[] args) {
		// StringBuffer -> ���� ���� 
		// OpenAPI -> �����͸� �ҷ��� �� ���  StringBuilder, StringBuffer
		// OpenAPI ����ó���� ���� �����ڿ��� ���� ���� 		
		System.out.println("StringBuilder");
//		StringBuffer sf1 = new StringBuffer("java");
		StringBuilder sf1= new StringBuilder("java");
		System.out.println(sf1);
		
		sf1.append("2024");
		System.out.println(sf1);
		

		// ���ڿ� ���� (���۹���,������) -> ���۹������� ������ �ձ��� ����
//		sf1.delete(3, 4); //0<= <4 
		sf1.delete(0, 4); // 0<= <4 -> 0123
		System.out.println(sf1);
		// Ư����ġ�� ���ڿ� �߰�
		sf1.insert(0, "JAVA");// 0������ "JAVA"�߰�
		System.out.println(sf1);
		// 2024�ڿ� PROJECT�� �߰� �غ�����
//		sf1.append("PROJECT");
		sf1.insert(8, "PROJECT");
		System.out.println(sf1);

		// ���� -> ���� ���ڿ� �ݴ�� ����
		sf1.reverse();
		System.out.println(sf1);
		sf1.reverse();
		System.out.println(sf1);

		// Ư�����ڿ��� -> ��ȯ �ض�
		sf1.replace(0, 4, "ORACLE");// 0~3���� �ٲٰ��� �ϸ� 0,4
		System.out.println(sf1);

		// 2024-> 2025 �ٲ㺸����
		sf1.replace(6, 10, "2025");
		System.out.println(sf1);

		// substring -> Ư�� ���ڿ� ����
		int size = sf1.length();
		int pSize = "PROJECT".length();
		int startIdx = size - pSize;

		// ���� �ջ� ����
		System.out.println(sf1.substring(startIdx));
		System.out.println(sf1);
		// ó������ Ư�� ��ġ���� ����
		System.out.println(sf1.substring(0, startIdx));

		// StringBuffer -> String
		StringBuilder sf3 = new StringBuilder("String ����");
		// String.valueOf(sf3);// -> Ư����ü�� String���� ��ȯ

		String sf3ToSt = sf3.toString();
		System.out.println(sf3ToSt + " << String");
		
	}
}
