package org.project.service;

import java.util.Scanner;

public class ActionInsert extends ExcuteCommend {

	@Override
	public void excuteQueryService() {
		
		System.out.println("회원가입");		
		Scanner input=new Scanner(System.in);
		
		System.out.print("회원번호: ");
		int no=input.nextInt();//회원번호
		
		System.out.print("회원아이디: ");
		String userId=input.next();//회원아이디

		System.out.print("회원비빌번호: ");
		String userPw=input.next();//회원비빌번호
		
		System.out.print("회원이름: ");
		String name=input.next();//회원이름
		
		System.out.print("회원나이: ");
		int age=input.nextInt();//회원나이
		
		System.out.print("회원전화번호: ");
		String phone=input.next();//회원전화번호
		
		// 회원가입 회원 정보를 출력
		System.out.print("회원번호: "+no+", ");
		System.out.print("회원아이디: "+userId+", ");
		System.out.print("회원비빌번호: "+userPw+", ");
		System.out.print("회원이름: "+name+", ");
		System.out.print("회원나이: "+age+", ");
		System.out.println("회원전화번호: "+phone);
				
		
	}
}
