package org.java.oopEx;

public class OverLoadingMain {

	public static void main(String[] args) {

		System.out.println("overloading");
		System.out.println(1);
		System.out.println(1.1);
		System.out.println(1.1f);
		System.out.println(new String("ddd"));
		System.out.println(new char[] { 'a', 'b' });
		System.out.println(new ClassBasic5());

		OverLoadingEx over1 = new OverLoadingEx();
		over1.method1();
		over1.method1(100);
		over1.method1("m111");
		over1.method1(300, "third");
		over1.method1("dddd ", "1111 ", 250);
	}

}
