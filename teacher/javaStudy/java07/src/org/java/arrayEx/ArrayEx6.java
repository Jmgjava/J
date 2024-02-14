package org.java.arrayEx;

public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println("배열");
		// char-> String
		char[] arrCh1 = new char[5];
		// 'A','B','C','D','E'를 arrCh1에 추가
		// 0 1 2 3 4
		// for이용해서 추가 해보세요
		int alpha = 65;
		for (int i = 0; i < arrCh1.length; i++) {
			arrCh1[i] = (char) (alpha + i); // char ->(char)(int+int)
		}
		System.out.println("배열의 모든 요소를 조회 ->for each문");
		for (char ch : arrCh1) {
			System.out.print(ch + " ");
		}
		System.out.println();

		// 문자형배열 -> String
		String chStr = new String(arrCh1);
		System.out.println(chStr);

		// 문자형배열 -> String
		// 영문자-> 정수형 ->char형 배열
		char[] arrCh2 = new char[] { 'C', 'A', 'F', 'E' };
		String chStr2 = new String(arrCh2);
		System.out.println(chStr2);

		// int형 아래(char,short,byte)의 연산시 자동으로 int형으로 변환

		System.out.println((char) ('C' - 2));
		System.out.println('a' > 'A');// 97>65

	}
}
