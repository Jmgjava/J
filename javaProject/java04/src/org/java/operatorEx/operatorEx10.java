package org.java.operatorEx;

public class operatorEx10 {

	public static void main(String[] args) {

		System.out.println("shift 연산자");
		
		/*
		
		*** shift 연산자 >> , <<
		→ 2진수 변환 해서   >>, <<

		오른쪽 shift → 이동한 자릿수는 제거, 빈 자릿수 0 → 작아진다
		12
		>>2
		00000000 00000000 00000000 00001100
		    00000000 00000000 00000000 00001100

		>>2
		1100
		    1100
		0011

		왼쪽 shift → 왼쪽 자릿만큼 이동, 빈자릿수 0 → 커진다
		12
		<<2
		00000000 00000000 00000000 00001100
		    00000000 00000000 00000000 0000110000

		<<2
		   1100
		110000
		
		*/
		
		int i = 10;
		System.out.println("오른쪽 shift");
		System.out.println((i>>2)+"->"+Integer.toBinaryString(i>>2));
		
		
		
		
	}
}
