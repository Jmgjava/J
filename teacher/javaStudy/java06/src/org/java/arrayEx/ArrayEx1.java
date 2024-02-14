package org.java.arrayEx;

public class ArrayEx1 {

	public static void main(String[] args) {

		System.out.println("배열 -> []");

		// 1. 배열 생성 방법 -> new
		// int형데이터를 저장 할수 있는 배열 arrInt를 선언 했다.
		// int형 데이터 5개를 저장할수 있는 배열을 생성
		// 배열의 이름 -> arrInt -> 배열의 주소값이 저장
		int[] arrInt = new int[5];

//		int i1 = 10;
//		int i2 = 20;
//		int i3 = 30;
//		int i4 = 40;
//		int i5 = 50;

		// 초기화, 0~4번지 -> push
//		arrInt[0]=10;
//		arrInt[1]=20;
//		arrInt[2]=30;
//		arrInt[3]=40;
//		arrInt[4]=50;
//		arrInt[5]=60;//ArrayIndexOutOfBoundsException -> 예외(Exception) 발생		

		// 배열의 요소 조회 -> pop
//		System.out.println("arrInt[0]="+arrInt[0]);// 0변지(index) 요소(element)
//		System.out.println("arrInt[1]="+arrInt[1]);// 1변지(index) 요소(element)
//		System.out.println("arrInt[2]="+arrInt[2]);// 2변지(index) 요소(element)
//		System.out.println("arrInt[3]="+arrInt[3]);// 3변지(index) 요소(element)
//		System.out.println("arrInt[4]="+arrInt[4]);// 4번지(index) 요소(element)	
		// ArrayIndexOutOfBoundsException -> 예외(Exception) 발생
//		System.out.println("arrInt[5]="+arrInt[5]);// 5번지(index) 요소(element)	

		// for
		for (int i = 0; i < 5; i++) {
			// i-> 0,1,2,3,4
			// 10,20,30,40,50
			// 0*10 ,1*10,2*10 ,3*10, 4*10
			// 0 ,10, 20 ,30,40
			arrInt[i] = i * 10 + 10;

			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println();

		// 2. 배열 생성
		int[] arrInt2 = new int[] { 10, 20, 30, 40, 50 };

		arrInt2[0] = 100;
		System.out.println("배열의 이름: " + arrInt2);
//		System.out.println("arrInt2[0]="+arrInt2[0]);// 0변지(index) 요소(element)
//		System.out.println("arrInt2[1]="+arrInt2[1]);// 1변지(index) 요소(element)
//		System.out.println("arrInt2[2]="+arrInt2[2]);// 2변지(index) 요소(element)
//		System.out.println("arrInt2[3]="+arrInt2[3]);// 3변지(index) 요소(element)
//		System.out.println("arrInt2[4]="+arrInt2[4]);// 4번지(index) 요소(element)	

		for (int i = 0; i < 5; i++) {
			System.out.println("arrInt2[" + i + "]=" + arrInt2[i]);
		}

		System.out.println();

		// 3.배열 생성
		int[] arrInt3 = { 10, 20, 30, 40, 50 };

		System.out.println(arrInt3);
		System.out.println("배열의 이름: " + arrInt3);
//		System.out.println("arrInt3[0]="+arrInt3[0]);// 0변지(index) 요소(element)
//		System.out.println("arrInt3[1]="+arrInt3[1]);// 1변지(index) 요소(element)
//		System.out.println("arrInt3[2]="+arrInt3[2]);// 2변지(index) 요소(element)
//		System.out.println("arrInt3[3]="+arrInt3[3]);// 3변지(index) 요소(element)
//		System.out.println("arrInt3[4]="+arrInt3[4]);// 4번지(index) 요소(element)

		for (int i = 0; i < 5; i++) {
			System.out.println("arrInt3[" + i + "]=" + arrInt3[i]);
		}

	}
}
