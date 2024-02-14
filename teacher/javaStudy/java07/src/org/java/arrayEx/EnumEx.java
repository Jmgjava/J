package org.java.arrayEx;

import org.java.contraint.Role;

public class EnumEx {

	// static(공유) ->클래스(static) 맴버 -> 클래스명.이름
	public static final String ADMIN = "ROLE_ADMIN";
	public static final String MEMBER = "ROLE_MEMBER";
	public static final String SELLER = "ROLE_SELLER";

	enum USER_ROLE {
		ROLE_ADMIN, ROLE_MEMBER, ROLE_SELLER
	}

	public static void main(String[] args) {

		System.out.println("enum");
		System.out.println("관리자 권한: " + EnumEx.ADMIN);// 클래스명.클래스맴버
		System.out.println("판매자 권한: " + EnumEx.SELLER);// 클래스명.클래스맴버
		System.out.println("일반회원 권한: " + EnumEx.MEMBER);// 클래스명.클래스맴버

		System.out.println("enum-> 조회");
		System.out.println("관리자 권한: " + USER_ROLE.ROLE_ADMIN);//
		System.out.println("판매자 권한: " + USER_ROLE.ROLE_SELLER);//
		System.out.println("일반회원 권한: " + USER_ROLE.ROLE_MEMBER);//
		
		System.out.println("enum-> 생성");
		System.out.println("관리자 권한: "+Role.ROLE_ADMIN);
		System.out.println("판매자 권한: " + Role.ROLE_SELLE);//
		System.out.println("일반회원 권한: " + Role.ROLE_MEMBER);//
		
		

	}
}
