package org.java.var;

public class VarEx3 {

	public static void main(String[] args) {
		
		System.out.println("����");
		System.out.println("������(��ü��,Objec��)");
		
		int i=10;
		byte b=10;
		
		System.out.println(b);
		
		//String -> ���ڿ� ""
		String str1;// StringŸ�� ���� str1����
		str1=new String("���ڿ�1");
		System.out.println(str1);
		
		// ��ü��������.  -> ��ü����������  .��ü�ɹ�
		System.out.println(str1.charAt(2));// ���ڿ� �ε���(0���ͽ���) 
		System.out.println(str1.length()); //���ڿ� ����
		
		// new -> ��ü ���� ������, �޸𸮿� �Ҵ�,�ּҰ� ����
		// str2 -> ��ü ��������, ������ ��ü�� �ּҰ��� ���� 
		String str2=new String("���ڿ�2");		
		System.out.println(str2.charAt(0));
		System.out.println(str2.length());
		
		System.out.println("===========================");
		
		// String new�� ���� �Ҽ� �ִ�. ��. new�� ������ ���ڿ��� �޸� ��ġ�� �ٸ���
		String str3="���ڿ�3";
		System.out.println(str3.charAt(0));
		System.out.println(str3.length());
		
		String str4= new String("���ڿ�3");
		
		System.out.println(str4.charAt(0));
		System.out.println(str4.length());
		
		// �׵����   str3==str4 ������?
		System.out.println(str3==str4);
		
		
		
		
		
		
		
		
		
		
		
	}
}
