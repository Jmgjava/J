package org.project.dao;

import org.project.dto.MemberDto;

public class MemberDao {

	// 싱글톤 패턴 -> "객체를 한번만 생성"
	// 1. 생성자 private
	// 2. INSTANCE 한번만 생성 -> 한번만 객체를 생성
	// 3. 외부 static MemberDao getInstance() -> 한번만 생성
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
		System.out.println("DAO");
	}

	public static MemberDao getInstance() {
		return MemberDao.INSTANCE;
	}

	/////////////////////////////////////////////////////////////////////
	// C reat 회원가입
	public int insert() {
		return 0;
	}

	// R ead 회원조회
	public MemberDto select() {
		MemberDto dto = null;

		return dto;
	}

	// U pdate 회원수정
	public int update() {
		return 0;
	}

	// D elete 회원삭제
	public int delete() {
		return 0;
	}
}
