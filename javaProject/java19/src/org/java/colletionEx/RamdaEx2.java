package org.java.colletionEx;

interface In4 {
	void ramda1();
}

interface In5 {
	String ramda2(String name);
}

interface In6 {
	int ramda3(int num1, int num2);
}

public class RamdaEx2 {

	public static void main(String[] args) {
		System.out.println("람다식");
		In4 i4 = () -> System.out.println("람다식 구현 ramda1()");

		In5 i5 = name -> {
			return name;
		};

//		i5.ramda2("m2").toString();
		String name = i5.ramda2("m1");
		System.out.println(name);

		In6 i6 = (int num1, int num2) -> {
			System.out.println(num1 + num2);
			int sum = num1 + num2;
			return sum;
		};
		int sum = i6.ramda3(100, 20);
		System.out.println(sum);
	}

}
