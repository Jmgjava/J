package org.java.basicApi;

public class StringEx4 {

	public static void main(String[] args) {
		System.out.println("String");
		System.out.println("substring -> Ư�� ���ڿ� ����");

		// 1.substring(�ε���) -> �ε������� ���ڿ� ����
		String str1 = "java 2024 project";

		System.out.println(str1.substring(10));// 10�������� ����
		// ���� -> ��ü���ڿ� ���� - ������ ���ڿ�(�����ڿ�)
		// -> ������ ���۹���
		// substring(���۹���)
		String str2="124356789";
		
		int size=str2.length();
		System.out.println(size);
		
		int num=3;// ������ ������ ���ڿ� ���� (789)
		int index1=size-num; // ���ڿ����� ������ �ε���(����)
		//���ڿ��� �ε������� �����Ͷ�
		System.out.println(str2.substring(index1));
		
		String str3="member_.do";
		int str3Index=str3.length()-3;// ��ü���̿��� - ������ ���ڿ�����(������)
		
		System.out.println(str3.substring(str3Index));
		
		//2. substring(���۹���, ������) -> ���ڿ��� ���۹������� ������-1 ���ڿ��� ����
		String str4="java oracle project";		
		System.out.println(str4.substring(0,4));
		System.out.println(str4.substring(5, 11));
		System.out.println(str4.substring(12, 19));
		
		
		String insert="/member_insert.do";
		
		System.out.println(".do�� ������ ���ڿ��� �����Ͽ� �ֿܼ� ���");
		// 1.substring(�ε���) -> �ε������� ���ڿ� ����
		
		// 2. substring(���۹���, ������) -> ���ڿ��� ���۹������� ������-1 ���ڿ��� ����
		//  Ư�����ڿ�����  �����ڿ��� �����ϰ� ������ ���ڿ��� ���� �ϰ� ���� ��
		// ***Ư�����ڿ�.substring(0, ); // 0���� ���� ���ڿ��� ������ ���� (0, ������ ���ڿ�����)
		// ��ü ���ڿ����� - ������ ���ڿ��� ���� -> 14
		// 3-> .do
		
		// 0���� 14�� ���ڿ��� ����
		System.out.println(insert.substring(0, insert.length() -3 ));	
		
		int num2=insert.length()-3;
		System.out.println(num2);
		System.out.println(insert.substring(num2));
		
		// Ư�����ڿ����� 0�������� ���ڿ��� ���� �� ��(������ ���ڿ��� �����ϰ�)
		// ������ ���ڿ� ����-> ��ü���ڿ� ���� - ���������ܹ��ڿ� ���� 
		//Ư�����ڿ�.substring(0,�����ù��ڿ�����) -> ������ ���ڿ�(������) �̿ܿ�
		// 0�������� ���ڿ��� ����
		
		// ���� -> ".do" �����ϰ� �ֿܼ� ���ڿ��� ǥ�� �ϼ���
		// Ư�����ڿ�.substring(0,�����ù��ڿ�����)
		String s1="/index.do";
		// "/index"		
		System.out.println(s1.substring(0, s1.length()-3));
		System.out.println(s1.substring(s1.length()-3)); // Ư�����ڿ��� ������ ���ڿ�(3)
		
		String s2="/memberUpdate.do";		
		// "/memberUpdate"
		System.out.println(s2.substring(0, s2.length()-3));
		System.out.println(s2.substring(s2.length()-3));
		
		String s3="/modify.do";
		// "/modify"
		System.out.println(s3.substring(0, s3.length()-3));
		System.out.println(s3.substring(s3.length()-3));
		
		String s4="/admin_shop.do";
		// "/admin_shop"
		System.out.println(s4.substring(0, s4.length()-3));
		System.out.println(s4.substring(s4.length()-3));
		
		
		// ".do"������ ���ڿ� 
		//s4.substring(��ü����-3);// ������ 3���� .do
		
		
		

	}
}