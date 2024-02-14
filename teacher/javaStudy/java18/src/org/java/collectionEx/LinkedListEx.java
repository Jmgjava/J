package org.java.collectionEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		System.out.println("LinkedList");

//		List<Integer> list1=new ArrayList<>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);

//		LinkedList<Integer> list2= new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>(list1);

		for (Integer i : list3) {
			System.out.println(i);
		}

		System.out.println();
		LinkedList<Integer> list4 = new LinkedList<Integer>();

		list4.add(10);
		list4.add(20);
		list4.add(30);
		System.out.println(list4);

		list4.addFirst(100);// 가장 앞에 데이터 추가
		System.out.println(list4);

		list4.addLast(100);
		;// 가장 뒤에 데이터 추가
		System.out.println(list4);

		list4.add(0, 200); // 0번지 -> 200
		System.out.println(list4);

		list4.removeFirst();// 첫번째 요소 삭제
		System.out.println(list4);

		list4.removeLast(); // 마지막 요소 삭제
		System.out.println(list4);

	}
}
