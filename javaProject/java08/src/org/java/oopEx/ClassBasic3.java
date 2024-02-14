package org.java.oopEx;

public class ClassBasic3 {
	// 멤버

	// 1.필드, 프로퍼티(속성), 하나의 값

	// 인스턴스 멤버 -> 객체를 생성한 후 사용 가능 new
	// CalssBasic3 c1 = new ClassBasic3();
	// c1.num1;, c1.num2;, c1.name;, c1.num3;
	public int num1;
	public int num2;
	public String name;// 주소값, 객체형의 기본값 -> null
	public int[] arrInt;

	int sum; // 같은 패키지 내에서만 접근 가능

	// private 필드 -> 같은 클래스 내에서만 접근 가능
	// 데이터베이스에 접근하고 또한 보안이 필요한 멤버는 private설정
	// 외부에서 접근할 수 없기 때문에 외부에서 접근 가능한 메소드를 생성하여 접근한다
	// setters, getters 메소드다.
	private String userId;
	private String userPw;

	// static(클래스) 멤버 -> 객체 생성 없이 사용 가능, 공유, public static final
	// 객체 생성 없이 클래스명.static멤버
	public static int num3;

	// 2. 메소드 -> 기능, 일 처리, 구현
	// 인스턴스 메소드 -> 인스턴스 멤버 -> 객체를 생성한 후 사용 가능 new
	// CalssBasic3 c1 = new ClassBasic3();
	// c1.메소드명();
	// 접근 지정자 반환 타입 메소드명() { //구현문 }

	// 선언부
	public void instanceMethod() {
		// 구현부 -> 처리,수행,실행
		System.out.println("메소드(인스턴스)");
		// 메소드는 기본이 return(반환값) 이 있다.
//		return;
	}

	// 클래스(static)메소드 -> 객체 생성 없이 사용 가능
	// 클래스명.static메소드();
	// ClassBasic3.staticMethod();
	// 접근 지정자 static 반호나타입 메소드명(){ //구현부 }
	public static void staticMethod() {
		System.out.println("static(클래스)메소드");
//		return;
	}

	// getters, setters
	// private String userId;
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// 외부에서 생성값을 getters -> 조회
	public String getUserId() {
		return userId;
	}

	// private String userPw;
	// 외부에서 setters -> 초기화
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	// 외부에서 생성값을 getters -> 조회
	public String getUserPw() {
		return userPw;
	}

}
