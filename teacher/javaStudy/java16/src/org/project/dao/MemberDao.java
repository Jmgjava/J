package org.project.dao;

import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// 회원가입
	public int insert() {
		System.out.println("회원가입 수행");
		// 1.DB연동
		// 2.쿼리문실행
		// 3.결과반환
		return 0;
	}
	// 회원수정
	public int update() {
		System.out.println("회원수정 수행");
		// 1.DB연동
		// 2.쿼리문실행
		// 3.결과반환
		return 0;
	}

	// 회원탈퇴
	public int delete() {
		System.out.println("회원탈퇴 수행");
		// 1.DB연동
		// 2.쿼리문실행
		// 3.결과반환
		return 0;
	}
	// 회원조회	
	public MemberDto select() {
		System.out.println("회원조회 수행");
		MemberDto member=new MemberDto();
		// 1.DB연동
		// 2.쿼리문실행
		// 3.결과반환
		return member;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
