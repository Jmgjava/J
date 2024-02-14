package org.java.inheritanceEx;

public class InheritanceEx1Sub1 extends InheritanceEx1 {

	public int num5;
	public int num6;

	public void sub1() {
		System.out.println("sub1 메소드");
	}

	// 부모 메소드와 이름은 동일하지만 사용법을 다르게 하고 싶을 때
	// Overriding(오버라이딩)
	// 오버라이드(Override) -> 상속을 통해서 재정의

	@Override
	public void superM1() {
		// TODO Auto-generated method stub
		super.superM1();
	}

	public static void main(String[] args) {

		// i1 -> Object멤버+InheritanceEx1 멤버
		InheritanceEx1 i1 = new InheritanceEx1();
		i1.num1 = 10;
		i1.num2 = 20;
		i1.num3 = 30;
		i1.superM1();
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());

		InheritanceEx1Sub1 i2 = new InheritanceEx1Sub1();
		i2.num1 = 20;
		i2.num2 = 30;
		i2.num3 = 40;
		i2.num5 = 60;
		i2.num6 = 70;
		System.out.println(i2.toString());
		System.out.println(i2.hashCode());

	}

}
