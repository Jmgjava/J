package org.java.arayEx;

public class arayEx1 {

	public static void main(String[] args) {

		System.out.println("배열 -> []");
		// int형 데이터를 저장할 수 있는 배열 arrInt을 선언했다.
		// int형 데이터 5개를 저장할 수 있는 배열을 생성
		// 배열의 이름 → arrInt → 배열의 주소값이 저장
		int[] arrInt = new int[5];

		// 초기화, 0~4번지 -> push
//		arrInt[0] = 10;
//		arrInt[1] = 20;
//		arrInt[2] = 30;
//		arrInt[3] = 40;
//		arrInt[4] = 50;
//		arrInt[5]=60;

		// for문 사용하여 배열
		for (int i = 0; i < 5; i++) {
			// i -> 0,1,2,3,4
			// 10,20,30,40,50,
			arrInt[i] = i * 10 + 10;
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		// 배열의 요소 조회 -> pop
//		System.out.println("arrInt[0]=" + arrInt[0]);// 0번지(index) 요소(element)
//		System.out.println("arrInt[1]=" + arrInt[1]);// 1번지(index) 요소(element)
//		System.out.println("arrInt[2]=" + arrInt[2]);// 2번지(index) 요소(element)
//		System.out.println("arrInt[3]=" + arrInt[3]);// 3번지(index) 요소(element)
//		System.out.println("arrInt[4]=" + arrInt[4]);// 4번지(index) 요소(element)
		// ArrayIndexOutOfBoundsException -> 에외(Exception) 발생
//		System.out.println("arrInt[5]="+arrInt[5]);// 5번지(index) 요소(element)

		// 2. 배열 생성

		int[] arrInt2 = new int[] { 100, 200, 300, 400, 500 };

		arrInt2[0] = 1;
		System.out.println("배열의 이름: " + arrInt2);
//		System.out.println("arrInt[0]=" + arrInt2[0]);// 0번지(index) 요소(element)
//		System.out.println("arrInt[1]=" + arrInt2[1]);// 1번지(index) 요소(element)
//		System.out.println("arrInt[2]=" + arrInt2[2]);// 2번지(index) 요소(element)
//		System.out.println("arrInt[3]=" + arrInt2[3]);// 3번지(index) 요소(element)
//		System.out.println("arrInt[4]=" + arrInt2[4]);// 4번지(index) 요소(element)
		for (int a = 0; a < 5; a++) {
			System.out.println("arrInt2["+a+"]="+arrInt2[a]);
		}

		// 3. 배열 생성
		int[] arrInt3 = { 11, 22, 33, 44, 55 };

		System.out.println(arrInt3);
		System.out.println("배열의 이름: " + arrInt3);
//		System.out.println("arrInt[0]=" + arrInt3[0]);// 0번지(index) 요소(element)
//		System.out.println("arrInt[1]=" + arrInt3[1]);// 1번지(index) 요소(element)
//		System.out.println("arrInt[2]=" + arrInt3[2]);// 2번지(index) 요소(element)
//		System.out.println("arrInt[3]=" + arrInt3[3]);// 3번지(index) 요소(element)
//		System.out.println("arrInt[4]=" + arrInt3[4]);// 4번지(index) 요소(element)
		
		for (int b = 0; b < 5; b++) {
			System.out.println("arrInt3["+b+"]="+arrInt3[b]);
		}
	}
}
