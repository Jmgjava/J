package org.java.abstractEx;

public class abstractEx1Main {

	public static void main(String[] args) {

		// 추상클래스는 객체를 생성 하지 못한다.
//		new AbstractEx1();

		abstractExSub1 sub1 = new abstractExSub1();
		sub1.num1 = 10;
		sub1.num2 = 20;
		sub1.num3 = 30;
		sub1.num4 = 40;
		sub1.abmethod1();

		// 다형성 ,, 부모타입 객체참조 변수 -> 자식객체

		abstractEx1 ab1 = new abstractExSub1();
		ab1.num1 = 10;
		ab1.num2 = 20;
		ab1.abmethod1();

//		new abstractExSub2(); //추상 클래스

		abstractExSub2Sub abs1 = new abstractExSub2Sub();
		abs1.num1 = 10;
		abs1.num2 = 20;
		abs1.abmethod1();
		abs1.abmethod2();
		abs1.abstractMethod2();

		abstractEx1 abs11 = new abstractExSub2Sub();
		abs11.abmethod2();
		abs11.abmethod1();

		abstractExSub2 abs12 = new abstractExSub2Sub();
		abs12.abmethod2();
		abs12.abstractMethod2();

	}

}
