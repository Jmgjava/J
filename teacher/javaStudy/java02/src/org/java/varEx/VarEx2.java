package org.java.varEx;

public class VarEx2 {

	public static void main(String[] args) {
		System.out.println("����");
		System.out.println("��ü��(Objcet),������ ����");
		
		
//		"���ڿ�1"="���ڿ�		
		// ���ͷ� -> �� �� ��ü -> ���� ���� �Ҽ� ���� -> const
		// "���ڿ�1", 10, 1.1, 'a'
		int i=10;
		double d=1.1;
		
		// ��ü�� �ּҰ��� ����
		// str1(��ü��������) // new -> ��ü ���� ������
		// str1 -> �ν��Ͻ�,��ü
		String str1=new String("���ڿ�1");// �ν��Ͻ�ȭ(��üȭ)
		String str2=new String("���ڿ�1");
		String str3="���ڿ�1";
		String str4="���ڿ�1";
		// ���ڿ� ��ü�� �ּҰ��� ��
		System.out.println(str1==str2);// ������?
		System.out.println(str1==str3);// ������?
		System.out.println(str3==str4);// ������?
		System.out.println("============");
		// ���� �������� ��
		// ��ü.  -> ��ü���� ������
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println("============");
		
		String userId="m1111";
		
		System.out.println(userId.equals("m1111"));
		
		
	}
}
