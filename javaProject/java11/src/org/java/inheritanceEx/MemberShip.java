package org.java.inheritanceEx;

import org.java.role.Role;

public class MemberShip {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.age = 10;
		p1.name = "A";
		p1.phone = "010-0000-0000";
		p1.MemberShip();

		Sub1 s1 = new Sub1();
		s1.age = 10;
		s1.name = "B";
		s1.phone = "010-0001-0001";
		s1.num1 = 20;
		s1.num2 = 30;
		s1.MemberShip();

		Sub2 s2 = new Sub2();
		s2.age = 10;
		s2.name = "C";
		s2.phone = "010-0011-0011";
		s2.app = "APP";
		s2.MemberShip();

		Sub3 s3 = new Sub3();
		s3.age = 10;
		s3.name = "D";
		s3.phone = "010-0111-0111";
		s3.role1 = Role.ROLE_ADMIN;
		s3.MemberShip();

		System.out.println("본인의 권한: " + s3.role1);

		// 부모타입의 객체 참조변수로 다양한 객체에 접근 가능
		// → 참조하는 값은 부모타입 멤버만 가능
		Parent p2 = new Sub1();
		p2 = new Sub2();
		p2 = new Sub3();

		Parent p3 = new Sub3();
		Sub3 s31 = new Sub3();

	}

}
