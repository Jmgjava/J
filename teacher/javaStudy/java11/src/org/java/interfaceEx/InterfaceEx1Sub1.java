package org.java.interfaceEx;

// Ŭ���� implements  �������̽� , Ŭ���� -> �����̽�
public class InterfaceEx1Sub1 implements InterfaceEx1, InterfaceEx2{

	@Override
	public void ab1() {
		System.out.println("�߻�ż��� ����");
	}
	@Override
	public void defaultMethod() {
		System.out.println("���� �ż��� ->default");
	}
	@Override
	public void inter2() {
		System.out.println("�߻�ż��� inter2");
	}
	@Override
	public void inter2(int num1, int num2) {	
		System.out.println(num1+num2);		
	}
}
