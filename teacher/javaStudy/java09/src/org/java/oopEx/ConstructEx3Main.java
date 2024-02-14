package org.java.oopEx;

public class ConstructEx3Main {

	public static void main(String[] args) {

		ConstructEx3 c1 = new ConstructEx3();
		c1.setAge(30);
		c1.setNo(2);
		ConstructEx3 c2 = new ConstructEx3(1, 33);

		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}
}
