package org.java.oopEx;
// 패키지-> 비슷한 기능의 클래스를 모아둔 디렉토리

//접근지정자(제한자)  class 클래스명
// 선언부
public class ClassBasic {
	// 맴버=필드+매서드+생성자(자동,직접)+다른객체(상속,import)

	// 필드,프로퍼티(속성)
	// 접근지정자 타입 필드명;
	public int num1; // 인스턴스 맴버, new
	public int num2; // 인스턴스 맴버, new
	//클래스맴버 -> new 생성하지 않고, 클리스.맴버
	public static int num3; // static(클래스)맴버-> 공유

//	public ClassBasic() {
//		System.out.println("기본생성자(자동으로생성)");
//	}

	// 매서드 -> 기능, 일하는 ,실행
	// 접근지정자 반환타입 매서드명(입력인자){ return }	
	public void instanceMethod() { 
		System.out.println("인스턴스 매서드"); // 인스턴스 맴버 , new
	}

	public static void staticMethod() {
		System.out.println("static(클래스) 매서드");// static(클래스)맴버-> 공유
	}

}
