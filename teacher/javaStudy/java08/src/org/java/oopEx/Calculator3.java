package org.java.oopEx;

public class Calculator3 {

	private int num1;
	private int num2;
	private String op;
	
	//setters -> �ܺο��� ���� private �ʵ带 �ʱ�ȭ �ż���
	public void setNum1(int num1) {
		// this.�ɹ�=�ܺκ�����
		this.num1 = num1;
	}

	// getters -> �ʱ�ȭ�� private �ʵ带 get
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setOp(String op) {
		this.op=op;
	}
	public String getOp() {
		return op;
	}

}
