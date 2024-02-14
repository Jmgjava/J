package org.java.collectionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
//		1.List인터페이스 부모
//		2.순서가 있다.
//		3.길이가 자동 조절
//		4.요소가 객체로 구성
//		5.중복값을 허용		
		Vector<Integer> v1 = new Vector<Integer>();

		System.out.println(v1);

		Integer i1 = new Integer(10);// 박싱 , 기본타입(10) ->객체
		Integer i2 = 10; // 자동 박싱
		// 추가
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		int size = v1.size();// 백터의 길이
		System.out.println(size);
		System.out.println(v1);

		// 각 요소를 조회
		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		System.out.println("===================");

		// for문이용해서 콘솔에 모든 요소를 출력
		// for-> 갯수를 정해서
		for (int i = 0; i < size; i++) {
			System.out.print(v1.get(i) + " ");
		}
		System.out.println();
		System.out.println("===================");

		// 객체 반복문 -> foreach
		// 모든 요소를 ->
		for (Integer i : v1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===================");

		v1.add(1, 100);

		System.out.println(v1);
		System.out.println(v1.capacity());

		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		v2.add(400);
		v2.add(500);
		System.out.println(v2);
		System.out.println(v1);
		// v1백터 뒤에 v2백터 추가
		System.out.println(v1.addAll(v2));
		System.out.println(v1);

//		v1.clear();//모든 요소 삭제

		System.out.println(v1);
		// 검색 기능 활용
		System.out.println(v1.contains(100)); // *****
		System.out.println(v1.elementAt(0)); // 인덱에 해당하는 요소
		System.out.println(v1.indexOf(100)); // 요소가 몇번지?

//		int[] arrInt= new int[5];
//		System.out.println(arrInt[0]);

//		v1.clear();
		System.out.println(v1.isEmpty());// ***** 백터에 요소가 없다

		if (v1.isEmpty()) {
			throw new NullPointerException("요소가 NULL");
		}

		System.out.println(v1);
		v1.remove(1);// 인덱스
		System.out.println(v1);
		v1.remove(new Integer(200));// 요소 삭제
		System.out.println(v1);

		// 백터 -> 배열
		Integer[] iArr = (Integer[]) v1.toArray();

		
		
	}
}
