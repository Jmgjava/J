package org.java.constraint;
// 패키지 -> 비슷한 기능의 클래스는 모아놓은 디렉토리

// 접근지정자(제한자) class 클래스명
// 선언부
public class ClassBasic {
	// 구현부
	// 멤버

	// 필드+메소드+생성자(자동, 직접)+다른객체(상속, import)

	// 필드,프로퍼티(속성)
	public int num1; // 인스턴스 멤버, new
	public int num2; // 인스턴스 멤버, new
	// 클래스멤버 -> new 생성하지 않고, 클래스.멤버
	public static int num3; // static(클래스)멤버 -> 공유

//	public ClassBasic() {
//		System.out.println("기본생성자(자동으로 생성)");
//	}

	// 메소드 → 기능, 일하는, 실행
	// 접근지정자 반환타입 메소드명(입력인자){ return }
	public void instanceMethod() {
		System.out.println("인스턴스 메소드"); // 인스턴스 멤버
	}

	public static void staticMethod() {
		System.out.println("static(클래스) 메소드"); // 클래스 멤버
	}
}
