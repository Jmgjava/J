package org.java.operatorEx;

public class operatorEx4 {

	public static void main(String[] args) {
		
		System.out.println("비교 연산자");
		
		
		String str1=new String("문자열1");
		String str2=new String("문자열1");
		String str3=("문자열1");
		String str4=("문자열1");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		// 값만 비교 -> 실제 웹 프로젝트 작업시 사용- .equals(객체타입,String)
		System.out.println(str2.equals(str4));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		
		int num1=10;
		int num2=20;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
		
		
	}
}
