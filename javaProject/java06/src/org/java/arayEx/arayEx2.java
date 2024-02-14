package org.java.arayEx;

public class arayEx2 {

	public static void main(String[] args) {
		System.out.println("배열");

		// int형 데이터를 저장할 수 있는 배열 arrInt 선언
		int[] arrInt = new int[5];

		System.out.println(arrInt.length);
		// 10~50
		// 배열의 인덱스는 전체 배열의 길이보다 -1 작다. (인덱스 < 전체배열)
		// 5
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 10; // 초기화
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println();

		// char형 배열 -> 알파벳 증감식 시 -> 아스키코드 활용

		char[] arrCh = new char[5];

		arrCh[0] = 'a';

		for (int i = 0; i < arrCh.length; i++) {
			arrCh[i] = (char) (i + 97); // 'a', 'b', 'c', 'd', 'e'
			System.out.println("arrCh[" + i + "]=" + arrCh[i]);
		}

		// String
		String[] arrStr = new String[5];

		arrStr[0] = "한글";

		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i]="<li>상품목록"+i+"</li>";
			System.out.println("arrStr[" + i + "]=" + arrStr[i]);
		}

	}

}
