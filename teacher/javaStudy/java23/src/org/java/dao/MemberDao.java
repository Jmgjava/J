package org.java.dao;

import org.java.dto.MemberDto;

public class MemberDao {
	/////////////////////////////////////////////////////////////////
	// 싱글톤 -> "객체를 한번만 생성"
	// 1. 생성자 private
	// 2. INSTANCE 한번만 초기 -> 한번만 객체를 생성
	// 3. 외분 static MemberDao getInstance() -> 한번만 생성
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
		System.out.println("Dao");
	}

	public static MemberDao getInstance() {
		return MemberDao.INSTANCE;
	}
	/////////////////////////////////////////////////////////////////
	// Create 회원가입
	public int insert() {
		return 0;
	}
	// Read 회원조회
	public MemberDto select() {
		MemberDto dto=null;
		
		return dto;
	}
	
	
	// Update 회원수정
	public int update() {
		return 0;
	}
	// Delete 회원삭제
	public int delete() {
		return 0;
	}	
	
	
	
	
	
}
