package org.java.operatorEx;

public class operatorEx2 {

	public static void main(String[] args) {
		
		System.out.println("대입 연산자");
		
		int i=10;
		int i2=10+10*5+(10-2);
		String str1=new String("문자열1");
		
		
		// 복합대입연산자 -> 총알, 장바구니 ....
		int k=10;
		
		k+=10; // k=k+10;
		System.out.println(k);
		
		k-=5; // k=k-5;
		System.out.println(k);
		
		k*=10; // k=k*10;
		System.out.println(k);
		
		k/=10; // k=k/10;
		System.out.println(k);
		
		k%=10; // k=k%10;
		System.out.println(k);
	}
}
