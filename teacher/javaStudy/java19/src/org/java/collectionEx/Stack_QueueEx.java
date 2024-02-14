package org.java.collectionEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_QueueEx {

	public static void main(String[] args) {

		System.out.println("Stack -> push(), pop() ");

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println("Queue -> add, poll()");

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}
}
