package org.java.interfaceEx;

public interface InterfaceEx1 {

	// �������̽� ��� -> static ���, �߻�޼ҵ�, default �޼ҵ�

//	int num1; // �Ϲ� ��� X
	public static final int NUM1 = 100; // static ���
	int NUM2 = 100;

	public abstract void ab1(); // �߻� �޼ҵ�

	public static void staticMethod() {
		System.out.println("static �޼ҵ�");
	}

	// ��ӿ� ���� 0
	default void defaultmethod() {
		System.out.println("default �޼ҵ�");
	}

//	public void m1() {//�Ϲ� ��� X
//		System.out.println("�Ϲ� �޼ҵ�");
//	}

}
