package org.java.colletionEx;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		System.out.println("Stack");

		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);

		System.out.println(stack1);

		for (Integer i : stack1) {
			System.out.println(i);
		}

		stack1.pop(); // top -> 가장 마지막에 추가객체를 제거
		System.out.println(stack1);

		System.out.println(stack1.peek()); // 마지막 요소 조회
		System.out.println(stack1.search(40)); // 검색, top부터 시작 , 마지막요소 -> 첫 요소
		System.out.println(stack1.isEmpty()); // 비었는가?

		System.out.println();
		// 1~100 정수 입력 -> 100 ~1까지 콘솔에 출력 단 Stack push,pop

		Stack<Integer> stack2 = new Stack<Integer>();
		for (int i = 1; i <= 100; i++) {
			stack2.push(i);
		}
		for (int i = 0; i < 100; i++) {

			System.out.print(stack2.pop());
		}

	}
}
