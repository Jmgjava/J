package org.java.oopEx;

public class OverLoadingEx {

	//�����ε� -> �ż���, ����
	public void m1() {
		System.out.println("m1 �ż���");
	}
	//��ȯŸ�� X
//	public int m1() {}
	public void m1(int num1) {
		System.out.println("m1() �����ε�, �Ű���������");
	}
	public void m1(String num1) {
		System.out.println("m1() �����ε�, �Ű����� Ÿ��");
	}
	//�Ű����� �̸�X
//	public void m1(String num2) {}
	
	
}
