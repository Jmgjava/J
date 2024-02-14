package org.java.colletionEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		System.out.println("Queue");

		Queue<Integer> queue1 = new LinkedList<Integer>();

		queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		queue1.add(40);
		queue1.add(50);

		System.out.println(queue1);
		System.out.println(queue1.peek() + " 가장 처음 요소 조회"); // 가장 처음 요소 조회

		System.out.println(queue1);
		System.out.println(queue1.poll() + " Queue의 가장 처음 요소를 제거"); // Queue의 가장 처음 요소를 제거
		System.out.println(queue1);

		// 1~100 까지 추가 -> 1~100 순서대로 출력
		Queue<Integer> queue2 = new LinkedList<Integer>();

		for (int i = 1; i <= 100; i++) {
			queue2.add(i);
		}
		for (int i = 1; i <= 100; i++) {
			System.out.print(queue2.poll()+",");
		}
	}

}
