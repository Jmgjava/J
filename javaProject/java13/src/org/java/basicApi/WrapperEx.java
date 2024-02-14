package org.java.basicApi;

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println("Wrapper");

		// 박싱 -> 기본자료형 -> 객체형

		int i = 10;
		Integer i1 = i;

		new Integer(10);
		// 자동박싱
		Integer i2 = 10;
		Character ch = 'c';
		Boolean bool = false; // new Boolean(false);

		// 언박싱 -> 객체형 -> 기본자료형
		Integer i4 = new Integer(10);
		int i3 = i4.intValue();
		// 자동언박싱
		int i5 = new Integer(10);
		int i6 = i4;

		// 2진수로 변환했을 때 1의 개수
		System.out.println(Integer.bitCount(i6));
		// 문자열을 정수(int)로 바꿔줌
		System.out.println(Integer.parseInt("111"));
		// 문자열 숫자를 -> 숫자형으로 바꿔줌 ,2(2진수로 바꿔줌), 4(4진수로 바꿔줌)
		System.out.println(Integer.parseInt("10", 2));
		// 정수형 -> 문자열진법으로 전환
		System.out.println(Integer.toBinaryString(10));
		// 16진수 -> 123456789abcdef -> CSS에서 사용
		System.out.println(Integer.toHexString(10));
		// 8진수
		System.out.println(Integer.toOctalString(10));

	}

}
