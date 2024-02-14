package org.java.colletionEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		System.out.println("LinkedList");

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);

//		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>(list1); // �ٸ� ��ü�� �ҷ��� �� ����.

		for (Integer i : list3) {
			System.out.println(i);
		}

		System.out.println();

		LinkedList<Integer> list4 = new LinkedList<>();

		list4.add(10);
		list4.add(20);
		list4.add(30);

		System.out.println(list4);

		list4.addFirst(0); // ���� �տ� �������߰�
		list4.addLast(50); // ���� �ڿ� �������߰�

		System.out.println(list4);

		list4.add(0, -10); // 0���� -> -10

		System.out.println(list4);

		list4.removeFirst(); // ù��° ��� ����
		list4.removeLast(); // ������ ��� ����

		System.out.println(list4);

	}

}
