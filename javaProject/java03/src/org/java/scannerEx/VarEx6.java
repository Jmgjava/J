package org.java.scannerEx;

public class VarEx6 {
	
	public static void main(String[] args) {
		System.out.println("변수와 자료형");
		
	/*
	 	1. 자바의 기본형 (Primitive Type) -> 하나의 값만 저장
				1		2		4		8
		정수형	byte	short	int*	long
		실수형					float	double*
		문자형			char
		논리형	boolean
		
		2. 자바의 객체형 (Object)
		class, interface, 배열, String
			//주소(객체의 주소)
		타입 변수=new ()
	*/
		
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2); //int형 아래 연산시 자동으로 int형변환
		int i1=b1+b2; //int형 아래 연산시 자동으로 int형변환
		
		int i2=b1; // 자동으로 byte -> int
		
		double d1=10+1.1; // int+double->double+double 작은형+큰형 -> 큰형+큰형 
		int i=10+(int)1.1; // 작은형+(작은형)큰형 -> 강제 형변환 손실 
		
		String str1=new String("문자열1");
		String str2=new String("문자열1");
		String str3="문자열1";
		String str4="문자열1";
		
		// 객체의 주소값 비교
		System.out.println(str1==str2); //false
		System.out.println(str1==str3); //false
		System.out.println(str3==str4); //ture
		//값만 비교 -> 로그인,  회원가입..
		System.out.println(str1.equals(str2));
		
					// new 객체생성 연산자
		ClassBasic c1=new ClassBasic();
			// c1 -> 객체 참조 변수
		System.out.println(c1);
		
		c1.age=10;
		c1.name="이름1";
		c1.instanceMethod();
		
		
	}	
}
