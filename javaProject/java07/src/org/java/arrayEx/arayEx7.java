package org.java.arrayEx;

public class arayEx7 {
	public static void main(String[] args) {
		System.out.println("char형 배열 -> String변경 예시");
		// 'C','A','F','E'를 String 변환 -> 변환코드를 이용해서 출력

		char[] arrCh = new char[] { 'C', 'A', 'F', 'E' };
		String[] binnery = { 
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" 
				};

		String result = "";
		// 4번 실행 C,A,F,E
		for (int i = 0; i < arrCh.length; i++) {
			if (arrCh[i] >= '0' && arrCh[i] <= '9') {
				// 실제 실행 되지 않는다.
				result += binnery[arrCh[i] - 'A' + 10];
			} else {
				// 실제 실행 되는 실행문
				result += binnery[arrCh[i] - 'A' + 10];
			}
		}

		System.out.println("변환전 문자열 배열");
		System.out.println(new String(arrCh));

		System.out.println("변환후 String형 배열");
		System.out.println(result);

	}

}
