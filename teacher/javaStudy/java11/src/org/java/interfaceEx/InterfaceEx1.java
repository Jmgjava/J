package org.java.interfaceEx;

public interface InterfaceEx1 {

	// �������̽� �ɹ� -> static�ɹ�, �߻�ż���,default�ż���
	
//	int num1; //�Ϲ� �ɹ�X
	public static final int NUM1=100; //static �ɹ�
	int NUM2=100; //static �ɹ�  public static final
	
	public abstract void ab1(); //�߻�ż���
	
	public static void staticMethod() {
		System.out.println("static�ż���");
	}
	// ��ӿ� ����0
	default void defaultMethod() {
		System.out.println("defaul�ż���");
	}	
//	public void m1() {//�Ϲ� �ɹ�X
//		System.out.println("�Ϲݸż���");
//	}
}
