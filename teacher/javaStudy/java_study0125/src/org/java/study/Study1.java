package org.java.study;

interface In1{	
	void ab1(); // 다형성을 이용해서 프로젝트 작업 효과적으로 수행
}
class In1Sub implements In1{
	// 다형성 -> 하나의 이름으로 여러 일을 수행?
	//상속을 통해서 부모의 매서드를 구현한 프로그래밍 방식(오버라이딩)
	@Override
	public void ab1() {
		System.out.println("추상매서드-> 오버라이딩");
	}	
}
class In1Sub2 implements In1{

	@Override
	public void ab1() {
		System.out.println("추상매서드-> 오버라이딩");
	}
	
}
class A{
	int a;//맴버 -> 필드
	static int b;//맴버 -> 필드
	// 다형성 -> 하나의 이름으로 여러 일을 수행?
	//매서드이름 똑같고 매개인자 갯수또는 타입이 다른 것을 허용
	// 오버로딩
	//맴버 -> 생성자
	public A() {
		System.out.println("기본생성자");
	}
	public A(int a) {
		this.a=a;
	}
	//맴버 -> 매서드
	void m1(int num) { // int num -> 매개변수(인자) -> 지역변수
		int num2=10;// 지역변수
		System.out.println("m1");
	}
}

public class Study1 {
	
	int num1;
	int num2;
	static int num3;
	
	public Study1() {
		System.out.println("기본"); 
	}
	
	void me1() {
		
	}
	
	public static void main(String[] args) {
		
		new Study1();
		
		System.out.println("java Study");
		//타입
		int i=10;
		double d=1.1;
		
		A a1=new A();
		A a2=new A();
		
		// 인터페이스 객체를 생성 X new X
		// 하나의 이름(타입)으로 여러객체를 접근 할수 있는 프로그래밍 방식
		In1 in1=new In1Sub();
		in1=new In1Sub2();
		
				
		
	}
	
}
