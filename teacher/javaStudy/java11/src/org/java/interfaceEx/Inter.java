package org.java.interfaceEx;

interface I1 {
	void in1();
}

interface I2 {
	void in2();
}

// ���� ��� -> �������̽� ���� ���� ���
interface I3 extends I2, I1 {
	void in3();
}

class InMain {
}

// Ŭ���� extends Ŭ���� implements �������̽� 
public class Inter extends InMain implements I3 {

	@Override
	public void in2() {
	}

	@Override
	public void in1() {
	}

	@Override
	public void in3() {
	}

	public static void main(String[] args) {

		new InMain();

	}
}
