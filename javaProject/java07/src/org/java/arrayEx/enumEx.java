package org.java.arrayEx;

import org.java.constraint.Role;

public class enumEx {

	
	// static -> 클래스(static) 멤버 -> 클래스명.이름
	
	public static final String ADMIN="ROLE_ADMIN";
	public static final String MEMBER="ROLE_MEMBER";
	public static final String SELLER="ROLE_SELLER";
	
	enum USER_ROLE{
		ROLE_ADMIN, ROLE_MEMBER, ROLE_SELLER
	}
	
	public static void main(String[] args) {
		System.out.println("enum");
		System.out.println("관리자 권한: "+enumEx.ADMIN);// 클래스명.클래스멤버
		System.out.println("일반회원 권한: "+enumEx.MEMBER);// 클래스명.클래스멤버
		System.out.println("판매자 권한: "+enumEx.SELLER);// 클래스명.클래스멤버
		
		
		System.out.println("enum-> 조회");
		System.out.println("관리 권한: "+USER_ROLE.ROLE_ADMIN);// 클래스명.클래스멤버
		System.out.println("일반 권한: "+USER_ROLE.ROLE_MEMBER);// 클래스명.클래스멤버
		System.out.println("판매 권한: "+USER_ROLE.ROLE_SELLER);// 클래스명.클래스멤버
		
		System.out.println("enum-> 생성");
		System.out.println("관리 : "+Role.ROLE_ADMIN);
		System.out.println("일반 : "+Role.ROLE_MEMBER);
		System.out.println("판매 : "+Role.ROLE_SELLER);
		
	}
}
