package org.java.var2;

public class VarEx6 {

	public static void main(String[] args) {
		System.out.println("����");
		System.out.println("���(final ���)");
		// �ѹ��� �ʱ�ȭ, ������ �ʴ�, const, final~
		
		int i=10;//����,�ʱ�ȭ
		i=100;i=200;
		System.out.println(i);
		
		//final ��� -> ������ �ʴ� ��(������Ʈ ����������,config ������)
		final int NUM=1000;
//		num=2000;// �ѹ��� �ʱ�ȭ
		System.out.println(NUM);
		
		final String PROJECTNAME="Shopping Mall";
		
		int i2=100;
		char ch='a';
		
		int i3=10;
		byte b=(byte) i3;// (��ȯŸ��)
		
		
		
	}
}
