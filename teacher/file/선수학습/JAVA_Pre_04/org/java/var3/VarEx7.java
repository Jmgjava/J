package org.java.var3;

public class VarEx7 {

	public static void main(String[] args) {
		System.out.println("������ �ڷ���");
		
		String str1=new String("���ڿ�1");
		String str2=new String("���ڿ�1");
		String str3="���ڿ�1";
		// 1. �ּҰ��� ��
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		// 2. ���� �� -> �α��� , ȸ�����Խ� 
		System.out.println(str1.equals(str2));
		
		
		
	}
}
