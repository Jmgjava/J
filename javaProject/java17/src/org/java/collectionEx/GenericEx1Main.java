package org.java.collectionEx;

public class GenericEx1Main {

	public static void main(String[] args) {

		GenericEx1 g1 = new GenericEx1();
		g1.a = 10;
		g1.b = 20;
		int rs = g1.m1(30);

		GenericEx2 g2 = new GenericEx2();
		g2.a = "10";
		g2.b = "20";
		String rs2 = g2.m1("30");

		// new -> 按眉积己楷魂磊 -> 林家
		GenericEx3<Integer> g3 = new GenericEx3<Integer>();
		g3.a = 10; // Integer i = 10; 磊悼 Wrapper
		g3.b = 20; // 冠教(boxing)
		int sum = g3.m1(30); // 攫冠教(unboxing)

		GenericEx3<String> g4 = new GenericEx3<String>();
		g4.a = "10";
		g4.b = "20";
		g4.m1("30");

		GenericEx3<Object> g5 = new GenericEx3<Object>();
		g5.a = new Object();
		g5.b = new Object();
		g5.m1(new Object());

		GenericEx3<Byte> g6 = new GenericEx3<Byte>();
		GenericEx3<Short> g7 = new GenericEx3<Short>();
		GenericEx3<Float> g8 = new GenericEx3<Float>();
		GenericEx3<Double> g9 = new GenericEx3<Double>();
		GenericEx3<Long> g10 = new GenericEx3<Long>();
		GenericEx3<Character> g11 = new GenericEx3<Character>();

	}

}
