package org.java.oopEx;

public class ClassBasic5Main {
	
	public static int num1;
	public static int num2;
	public void m1() {
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		//�ν��Ͻ� �ɹ� ���
		ClassBasic5Main cM1=new ClassBasic5Main();
		cM1.m1();
		//Ŭ����(static)�ɹ� ���
		ClassBasic5Main.num2=100;
		ClassBasic5Main.num1=10;
		
//		 m1();
		 int num3;
		 
		 //new ��ü ���� ������
		 //c1 ��ü ���� ������, ��ü,�ν��Ͻ�
		 // ClassBasic5 Ÿ�� c1;
		 // c1. -> . ��ü ���� ������
		 // �ν��Ͻ�ȭ, ��üȭ
	 ClassBasic5 c1= new ClassBasic5();
	
	 c1.age=10;
	 c1.instanceMathod1();
	 
	 String[] str2= {"1","2","3"};
	 String[] str3= new String[] {"1","2","2"};
	 
	 c1.m1(new String[] {"1","2","2"});
	 
	 //�ʵ尡 private 
	 c1.setUserId("m1");
	 c1.setUserPw("11");
	 c1.getUserId();
	 c1.getUserPw();
		 
	 //Ŭ���� �ɹ�
	 ClassBasic5.projectName="PROJECT NAME";
	 ClassBasic5.classMethode();
		 
		 	 
		 
	}
}
