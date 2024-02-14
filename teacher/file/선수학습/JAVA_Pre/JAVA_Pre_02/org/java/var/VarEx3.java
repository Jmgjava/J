package org.java.var;

public class VarEx3 {

	public static void main(String[] args) {
		
		System.out.println("변수");
		System.out.println("참조형(객체형,Objec형)");
		
		int i=10;
		byte b=10;
		
		System.out.println(b);
		
		//String -> 문자열 ""
		String str1;// String타입 변수 str1선언
		str1=new String("문자열1");
		System.out.println(str1);
		
		// 객체참조변수.  -> 객체잠조연산자  .객체맴버
		System.out.println(str1.charAt(2));// 문자열 인덱스(0부터시작) 
		System.out.println(str1.length()); //문자열 길이
		
		// new -> 객체 생성 연산자, 메모리에 할당,주소값 생성
		// str2 -> 객체 참조변수, 생성된 객체의 주소값을 저장 
		String str2=new String("문자열2");		
		System.out.println(str2.charAt(0));
		System.out.println(str2.length());
		
		System.out.println("===========================");
		
		// String new를 생략 할수 있다. 단. new로 생성한 문자열과 메모리 위치가 다르다
		String str3="문자열3";
		System.out.println(str3.charAt(0));
		System.out.println(str3.length());
		
		String str4= new String("문자열3");
		
		System.out.println(str4.charAt(0));
		System.out.println(str4.length());
		
		// 항등연산자   str3==str4 같으냐?
		System.out.println(str3==str4);
		
		
		
		
		
		
		
		
		
		
		
	}
}
