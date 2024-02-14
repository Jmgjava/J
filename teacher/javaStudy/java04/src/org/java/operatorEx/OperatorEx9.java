package org.java.operatorEx;

public class OperatorEx9 {

	public static void main(String[] args) {
		System.out.println("비트연산자");
		
		System.out.println("&");
		System.out.println(12&5);
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12&5));// 2진수 문자열
		/*
		      1100   
		   &   101
		       100    -> 4
		*/
		
		System.out.println("|");
		System.out.println(12|5);
		System.out.println(Integer.toBinaryString(12)+"|"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12|5));// 2진수 문자열
		/*
		 |	-> 하나이상이 1이면 1
			12    |	5    -> 13
			   1100   
			|     101
			    1101    ->  13 
		 
		 */
		
		System.out.println("^");
		System.out.println(12^5);
		System.out.println(Integer.toBinaryString(12)+"^"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12^5));// 2진수 문자열
		/*
		^	-> 서로 다르면 1
		12    ^	5    -> 9
		   1100   
		^    101
		    1001    ->  9
		*/
		
		
		
		
	}
}
