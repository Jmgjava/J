package org.java.oopEx;

public class Calculator3 {

	private int num1;
	private int num2;
	private String op;
	
	//setters -> 외부에서 직접 private 필드를 초기화 매서드
	public void setNum1(int num1) {
		// this.맴버=외부변수값
		this.num1 = num1;
	}

	// getters -> 초기화된 private 필드를 get
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
