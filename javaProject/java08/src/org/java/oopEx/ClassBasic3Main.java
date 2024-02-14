package org.java.oopEx;

public class ClassBasic3Main {

	public static void main(String[] args) {

		// 클래스(static)멤버
		// 클래스명.멤버
		ClassBasic3.num3 = 100;
		System.out.println(ClassBasic3.num3);

		// 메소드 -> 호출(call) -> return(반환)값을 반호나하고 종료
		// return문을 만나면 메소드가 종료된다.
		// 호출할 때마다 구현부의 명령문이 실행된다.
		ClassBasic3.staticMethod();

		// 인스턴스화(객체화)
		// new -> 객체 생성 연산자
		// c1 -> 객체,인스턴스 -> 객체의 주소값 저장(객체참조 변수)
		ClassBasic3 c1 = new ClassBasic3();
		System.out.println(c1);
		System.out.println(c1.hashCode());
		// 인스턴스 멤버 -> 필드, 메소드
		System.out.println(c1.num1); // int 0
		System.out.println(c1.name); // String null
		System.out.println(c1.arrInt); // 배열 null

		c1.num1 = 100;
		c1.num2 = 200;
		System.out.println(c1.num1 + c1.num2);

		c1.name = "이름";
		System.out.println(c1.name);

		c1.arrInt = new int[] { 1, 2, 3, 4, 5 };
		for (int i : c1.arrInt) {
			System.out.println(i + " ");
		}

		// private 필드에 접근 -> 초기화 setters
		c1.setUserId("m111");
		// private 필드에 접근 -> 조회
		c1.getUserId();
		System.out.println(c1.getUserId());

		c1.setUserPw("1111");
		c1.getUserPw();
		System.out.println(c1.getUserPw());
		
		//인스턴스 메소드
		c1.instanceMethod();
		c1.instanceMethod();
		c1.instanceMethod();

	}

}
