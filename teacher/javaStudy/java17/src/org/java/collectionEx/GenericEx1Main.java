package org.java.collectionEx;

public class GenericEx1Main {

	public static void main(String[] args) {

		GenericEx1 g1 = new GenericEx1();
		g1.a = 10;
		g1.b = 20;
		int rs = g1.m1(100);

		GenericEx2 g2 = new GenericEx2();
		g2.a = "10";
		g2.b = "20";
		String rs2 = g2.m1("100");

		// new -> 按眉积己楷魂磊 -> 林家
		GenericEx3<Integer> g3 = new GenericEx3<Integer>();
		g3.a = 10;// Integer i=10;
		g3.b = 20;// 冠教
		int sum = g3.m1(100);// 攫冠教

		GenericEx3<String> g4 = new GenericEx3<String>();
		g4.a = "10";
		g4.b = "20";
		String s1 = g4.m1("100");

		GenericEx3<Object> g5 = new GenericEx3<Object>();
		g5.a = new Object();
		g5.b = new Object();
		Object obj = g5.m1(new Object());

		GenericEx3<Float> g6 = new GenericEx3<Float>();
		GenericEx3<Double> g7 = new GenericEx3<Double>();
		GenericEx3<Long> g8 = new GenericEx3<Long>();
		GenericEx3<Character> g9 = new GenericEx3<Character>();

	}
}
