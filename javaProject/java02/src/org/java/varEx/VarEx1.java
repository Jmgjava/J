package org.java.varEx;

public class VarEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("변수");
		// 1.주소값
		// 2.주소가 참조 하는 값
		// 3.변수의 타입과 참조값의 타입이 일치 해야 된다. ***
		
		
		System.out.println("자바의 기본 자료형(Primitive Type)");
		//정수형 자료형(타입) -> 기본형 int
		byte b=10; //byte형 변수 b를 선언하고 byte형 정수 10으로 초기화 했다. 1byte
		short s=10; //short형 변수 s를 선언하고 short형 정수 10으로 초기화 했다. 2byte
		int i=10; //int형 변수 i를 선언하고 int형 정수 10으로 초기화 했다. 4byte
		long l=10; //long형 변수 l을 선언하고 long형 정수 10으로 초기화했다. 8byte
		
		//실수형 자료형(타입) -> 기본형 double
		float f=1.1f; // float형 변수 f를 선언하고 float형 실수 1.1으로 초기화했다. 4byte
		// or (float)1.1;
		double d=1.1; // double형 변수 d를 선언하고 double형 실수 1.1으로 초기화했다. 8byte
		
		//문자형 자료형(char) -> '', 한글자
		char ch='a'; // char형 변수 ch를 선언하고 char형 문자 a로 초기화했다. 2byte
				
		//논리형 자료형(boolean) -> 기본형 false
		boolean bool=true; // boolean형 변수 bool를 선언하고 boolean형 true로 초기화했다. 1byte
				
				
	}
}
