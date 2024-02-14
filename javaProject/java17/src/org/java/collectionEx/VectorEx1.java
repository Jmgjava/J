package org.java.collectionEx;

import java.util.Vector;

import javax.lang.model.element.Element;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
//		1. List 인터페이스 부모
//		2. 순서가 있다.
//		3. 길이가 자동 조절
//		4. 요소가 객체로 구성
//		5. 중복값을 허용

		Vector<Integer> v1 = new Vector<Integer>();

		System.out.println(v1);

		Integer i1 = new Integer(10); // 박싱, 기본타입(10) -> 객체
		Integer i2 = 10;
		// 추가
//		v1.add(i1);
//		v1.add(new Integer(20));
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		int size = v1.size(); // 벡터의 길이
		System.out.println(size);
		System.out.println(v1);

		System.out.println("======1======");
		// 각 요소를 조회
		System.out.print(v1.get(0));
		System.out.print(v1.get(1));
		System.out.print(v1.get(2));
		System.out.print(v1.get(3));
		System.out.print(v1.get(4));

		System.out.println();

		System.out.println("======2======");
		// for
		for (int i = 0; i < size; i++) {
			System.out.print(v1.get(i));
		}

		System.out.println();
		System.out.println("======3======");
		// 객체 반복문 -> for-each
		// 모든 요소를 ->
		for (Integer i : v1) {
			System.out.print(i);
		}

		System.out.println();
		System.out.println("======4======");
		v1.add(1, 100); // (1번지 앞에, 100을 집어 넣음)

		System.out.println(v1);
		System.out.println(v1.capacity());

		System.out.println();
		System.out.println("======5======");
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		v2.add(400);
		v2.add(500);
		System.out.println(v2);
		System.out.println(v1);
		// v1 벡터 뒤에 v2 벡터 추가
		System.out.println(v1.addAll(v2));
		System.out.println(v1);

//		v1.clear(); // 모든 요소 삭제

		System.out.println(v1);

		// 검색 기능 있음
		System.out.println(v1.contains(100)); // ****
		System.out.println(v1.elementAt(0)); // 인덱스의 해당하는 요소
		System.out.println(v1.indexOf(100)); // 요소가 몇번지?

		System.out.println(v1.isEmpty()); // **** 벡터에 요소가 없다
		if (v1.isEmpty()) {
			System.out.println("벡터에 요소가 null.");
		} else {
			System.out.println("벡터에 요소가 있음");
		}

		System.out.println(v1);
		v1.remove(1); // 인덱스
		System.out.println(v1);
		v1.remove(new Integer(200)); // 요소 삭제
		System.out.println(v1);

		// 벡터 -> 배열
		Integer[] vArr = (Integer[]) v1.toArray();

	}

}
