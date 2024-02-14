package org.java.inheritanceEx;

// Sub1, Sub2, Sub3 클래스의 부모(super) 클래스
public class Parent {

	public String name;
	public String phone;
	public int age;

	// 다형성(polymorphism)
	// 오버로딩 -> 생성자 오버로딩
//	public Parent() {
//		System.out.println("Parent 기본 생성자");
//	}
//
//	public Parent(String name, String phone, int age) {
//		super();
//		this.name = name;
//		this.phone = phone;
//		this.age = age;
//	}

	public void MemberShip() {
		System.out.println("회원관리 메소드");
	}

}
