package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {

	public int d;

	@Override
	public void excuteQueryService() {
		
		System.out.println("회원가입");
		
//		//DB-> 회원정보를 입력 받아서 데이터베이스 저장 -> DAO
//		MemberDao dao=new MemberDao();
//		
//		Scanner input= new Scanner(System.in);
//		
//		System.out.print("회원번호: ");		
//		int no=input.nextInt();//회원번호
//		
//		System.out.print("회원아이디: ");		
//		String userId=input.next();//회원아이디
//		
//		System.out.print("회원비빌번호: ");		
//		String userPw=input.next();//회원비빌번호
//		
//		System.out.print("회원이름: ");		
//		String name=input.next();//회원이름
//		
//		System.out.print("전화번호: ");		
//		String phone=input.next();//전화번호	
//		
//		// 반환값이 1이면 회원가입 성공, 1이아니면 회원가입 실패
//		int result=dao.insert(no, userId,userPw,name,phone);
//		
//		 if(result==1) {
//			 System.out.println("회원가입 성공");
//		 }else {
//			 System.out.println("회원가입 실패");			 
//		 }
	}

}
