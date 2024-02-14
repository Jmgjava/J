package org.java.oopEx;

public class ConstructEx {

	//ConstructEx클래스의 맴버
	//필드
	private int num1;
	private int num2;
	
	//NoArgsConstruct
	public ConstructEx() {
		System.out.println("기본생성자");
	}
					//매개변수 -> 지역변수
	public ConstructEx(int num1) {
		this.num1=num1;
	}
	//AllArgsConstruct
	public ConstructEx(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	
}
