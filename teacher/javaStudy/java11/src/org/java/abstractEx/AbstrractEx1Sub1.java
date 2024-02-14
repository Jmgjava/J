package org.java.abstractEx;

// 추상클래스 상속을 통해서 추상매서드를 오버라이딩(구현)해서 
// 자식클래스가 일반클래스 
public class AbstrractEx1Sub1 extends AbstractEx1 {

	public int num3;
	public int num4;
	
	@Override
	public void abstractMethod() {
		// 반드시 추상매서드를 구현
		System.out.println("추상매서드 구현");		
	}

}
