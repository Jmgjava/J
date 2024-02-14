package org.java.oopEx;

public class ConstructExmain {

	public static void main(String[] args) {
		// 인스턴스화
		// new -> 객체 생성
		ConstructEx c1 = new ConstructEx();
		c1.setUserId("m1");
		System.out.println(c1.getUserId());

		// 매개인자 1
		ConstructEx c2 = new ConstructEx("m111");
		// 객체 생성 시 값을 설정
		c2.setUserId("m222"); // 이미 설정된 값을 수정
		System.out.println(c2.getUserId());

		// 매개인자 2
		ConstructEx c3 = new ConstructEx("22", "m22");

		System.out.println(c3.getUserId());
		System.out.println(c3.getUserPw());

		// 매개인자 3
		ConstructEx c4 = new ConstructEx("333", "m333", 24);

		System.out.println(c4.getUserPw());
		System.out.println(c4.getUserId());
		System.out.println(c4.getAge());

	}
}
