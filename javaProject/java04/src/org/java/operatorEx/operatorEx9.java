package org.java.operatorEx;

public class operatorEx9 {

	public static void main(String[] args) {
		System.out.println("비트 연산자");
		System.out.println("==== & ===");
		System.out.println(12 & 5); // 2진수 -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5)); // 2진수 문자열
		System.out.println(Integer.toBinaryString(12&5));
		/*
		 	   1100
		     & 	101 
		     =	100 -> 4
		*/
		
		System.out.println("=== | ===");
		System.out.println(12 | 5); // 2진수 -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"|"+Integer.toBinaryString(5)); // 2진수 문자열
		System.out.println(Integer.toBinaryString(12|5));
		/*
		 	   1100
		     | 	101 
		     = 1101 -> 13
		*/
		
		System.out.println("== ^ ===");
		System.out.println(12 ^ 5); // 2진수 -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"^"+Integer.toBinaryString(5)); // 2진수 문자열
		System.out.println(Integer.toBinaryString(12^5));
		/*
		 	   1100
		     ^ 	101 
		     = 1001 -> 9
		*/
		
		
		
	}

}
