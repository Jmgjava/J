package org.java.scannerEx;

public class VarEx6 {
	
	public static void main(String[] args) {
		System.out.println("������ �ڷ���");
		
	/*
	 	1. �ڹ��� �⺻�� (Primitive Type) -> �ϳ��� ���� ����
				1		2		4		8
		������	byte	short	int*	long
		�Ǽ���					float	double*
		������			char
		������	boolean
		
		2. �ڹ��� ��ü�� (Object)
		class, interface, �迭, String
			//�ּ�(��ü�� �ּ�)
		Ÿ�� ����=new ()
	*/
		
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2); //int�� �Ʒ� ����� �ڵ����� int����ȯ
		int i1=b1+b2; //int�� �Ʒ� ����� �ڵ����� int����ȯ
		
		int i2=b1; // �ڵ����� byte -> int
		
		double d1=10+1.1; // int+double->double+double ������+ū�� -> ū��+ū�� 
		int i=10+(int)1.1; // ������+(������)ū�� -> ���� ����ȯ �ս� 
		
		String str1=new String("���ڿ�1");
		String str2=new String("���ڿ�1");
		String str3="���ڿ�1";
		String str4="���ڿ�1";
		
		// ��ü�� �ּҰ� ��
		System.out.println(str1==str2); //false
		System.out.println(str1==str3); //false
		System.out.println(str3==str4); //ture
		//���� �� -> �α���,  ȸ������..
		System.out.println(str1.equals(str2));
		
					// new ��ü���� ������
		ClassBasic c1=new ClassBasic();
			// c1 -> ��ü ���� ����
		System.out.println(c1);
		
		c1.age=10;
		c1.name="�̸�1";
		c1.instanceMethod();
		
		
	}	
}