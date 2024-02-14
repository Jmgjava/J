package org.java.inheritanceEx;

// 테스트용
class Parent {

	int a;

	// 다형성
	// 오버로딩-> 생성자 오버로딩
	public Parent() {
		super();
	}

	public Parent(int a) {
		this.a = a;
	}

	void m1() {
		System.out.println("부모클래스 m1()");
	}
}

class Sub1 extends Parent {
	int b;

	public Sub1() {
		// super();
		System.out.println("기본생성자 상속");
	}

	void m2() {
		System.out.println("자식클래스 m2()");
	}
	//다형성
	@Override
	void m1() {
		super.m1();// 부모 매서드
		System.out.println("오버라이드,  m1()");
	}
}

public class InheritanceEx5 {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.a = 10;
		p1.m1();

		Sub1 s1 = new Sub1();
		s1.a = 10;
		s1.b = 20;
		s1.m1();
		s1.m2();

		System.out.println(s1.toString());
		
		Parent p2=new Parent();
		p2.a=10;
		p2.m1();
		
		p2=new Sub1();
		p2.a=10;
		p2.m1();
		
		Parent	p21=new Sub1();
		p21.a=20;
		p21.m1();
		
		
//		Sub1 s22=new Sub1();
//		s22=(Sub1) new Parent();
		

	}

}
