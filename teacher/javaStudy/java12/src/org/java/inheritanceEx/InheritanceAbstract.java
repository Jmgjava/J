package org.java.inheritanceEx;

abstract class Ab1{
	int a;
	// 추상매서드(미완성) -> 반드시 오버라이딩 구현
	abstract void ab(); 
	void m1() {
		System.out.println("m1 일반매서드");
	}
}

class Ab1Sub1 extends Ab1{
	int b;
	@Override
	void m1() {
		System.out.println("부모 선택 매서드  m1");
	}
	@Override
	void ab() {
		System.out.println("추상매서드 반드시 구현");		
	}	
}
public class InheritanceAbstract {

	public static void main(String[] args) {
		
//		new Ab1();
		// 다형성 이용
		Ab1 ab1= new Ab1Sub1();
		ab1.a=10;
		ab1.ab();
		ab1.m1();
		
		Ab1Sub1 ab1sub1=new Ab1Sub1();
		ab1sub1.a=10;
		ab1sub1.b=20;
		ab1sub1.ab();
		ab1sub1.m1();
		
		
		
	}
}
