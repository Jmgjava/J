package org.java.oopEx;

public class OverLoadingEx {

	// �����ε� -> �޼ҵ�, ����
	public void m1() {
		System.out.println("m1 �޼ҵ�");
	}
	// ��ȯŸ�� X
//	public int m1() {}

	public void m1(int num1) {
		System.out.println("m1(int num1) �����ε�, �Ű����� ����");
	}
	
	public void m1(String num1) {
		System.out.println("m1(String num1) �����ε�, �Ű����� Ÿ��");
	}
	
	//�Ű����� �̸� X
//	public void m1(String num2) {}
	
	

}
