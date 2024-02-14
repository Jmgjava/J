package org.java.colletionEx;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_QueueEx {

	public static void main(String[] args) {

		System.out.println("Stack -> add, pop");

		Stack<Integer> st1 = new Stack<Integer>();

		st1.add(10);
		st1.add(20);
		st1.add(30);
		st1.add(40);
		st1.add(50);
		st1.add(60);
		System.out.println(st1);
		System.out.println(st1.pop());
		System.out.println(st1);

		System.out.println("Queue -> add, poll");
		LinkedList<Integer> qu = new LinkedList<Integer>();

		qu.add(10);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		qu.add(50);
		qu.add(60);
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu);

	}
}
