package org.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// 회원가입 -> 성공시 1반환, 실패하면 나머지 값 반환
	public int insert() {

		System.out.println("회원가입 실행");

		int result = 0;
		Connection conn = null;

		try {
//		1. 드라이버
//		2. DB연동  -> 드라이버 JDBC
			conn = DBConnect.getConnection();
//		3. 회원가입-> SQL			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//		4. DB연동 X			
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원수정
	public int update() {
		System.out.println("회원수정 실행");

		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원탈퇴
	public int delete() {
		System.out.println("회원탈퇴 실행");
		int result = 0;

		Connection conn = null;

		try {
			conn = DBConnect.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원조회 -> 성공시 객체반환, 실패하면 null or empty
	public MemberDto select() {
		System.out.println("회원조회 실행");

//		MemberDto member = new MemberDto();
		MemberDto member = null;

		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
			// DB데이터를 조회 해서 가져옴->

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return member;
	}

}
