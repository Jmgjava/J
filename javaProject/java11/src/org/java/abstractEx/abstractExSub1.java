package org.java.abstractEx;

// 추상클래스 상속을 통해서 추상메소드를 오버라이딩(구현)해서
// 자식클래스가 일반클래스
public class abstractExSub1 extends abstractEx1 {

	public int num3;
	public int num4;

	@Override
	public void abmethod1() {
		// ***반드시 추상 메소드를 구현
		System.out.println("추상 메소드 구현");
	}

	@Override
	public void abmethod2() {
		// TODO Auto-generated method stub
		
	}

}
