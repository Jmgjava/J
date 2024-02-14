package org.java.var3;

public class VarEx7 {

	public static void main(String[] args) {
		System.out.println("변수와 자료형");
		
		String str1=new String("문자열1");
		String str2=new String("문자열1");
		String str3="문자열1";
		// 1. 주소값을 비교
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		// 2. 값만 비교 -> 로그인 , 회원가입시 
		System.out.println(str1.equals(str2));
		
		
		
	}
}
