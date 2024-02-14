package org.java.basicApi;

class A {
	int a;
	int b;

	int m1(int num1) {
		return num1;
	}
}

class B {
	String a;
	String b;

	String m1(String num1) {
		return num1;
	}
}

// 제네릭타입 -> 객체 생성시 외부에서 타입을 결정 
class GenericEx<T> {
	T a;
	T b;

	T m1(T num1) {
		return num1;
	}
}

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println("Wrapper");

		// 제네릭 타입 -> 기본자료형 ->객체형
		new GenericEx<Integer>();
		new GenericEx<String>();
		new GenericEx<Float>();

		// 박싱 -> 기본자료형 -> 객체형
		Integer i2 = new Integer(10);
		// 자동박싱
		Integer i = 10;
		Character ch = 'a';
		Boolean bool = false;// new Boolean(false)

		// 언박싱 -> 객체형 -> 기본자료형
		Integer i4 = new Integer(10);
		i4 = 10;
		int i3 = i4.intValue();
		// 자동 언박싱
		int i5 = new Integer(10);
		int i6 = i4;

		// 2진수로 변환했을 때 1의 갯수
		System.out.println(Integer.bitCount(10));// 1010
		// 문자열을 정수(int)로 바꿔줌
		System.out.println(Integer.parseInt("1111"));// ***
		// 문자열 숫자를 -> 숫자형 바꿔줌, 2(2진수),10(10진수)
		System.out.println(Integer.parseInt("10", 2));
		System.out.println();
		// 정수형 -> 문자열 진법으로 변환
		System.out.println(Integer.toBinaryString(10));
		// 16진수 -> 123456789abcdef -> CSS
		System.out.println(Integer.toHexString(10));
		// 8진수
		System.out.println(Integer.toOctalString(10));

	}
}
