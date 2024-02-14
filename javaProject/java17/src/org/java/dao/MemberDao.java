package org.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");

	}

	// 회원가입 -> 성공하면 1, 실패하면 그 외

	public int insert(int no, String userId, String userPw, String name, int age) {
		int result = 0;
		System.out.println("회원가입 실행");
		Connection conn = null;

		try {
//		1. 드라이버
//		2. DB연동 -> 드라이버 JDBC
			conn = DBConnect.getConnection();

//		3. 회원가입 -> SQL
		} catch (Exception e) {
			// 회원가입 메소드

//		DB연동 X
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

//		4. DB연동 X

		return result;
	}

	
	// 회원조회 -> 성공시 객체 반환, 실패하면 null or empty
	public MemberDto select() {
		System.out.println("회원조회 실행");
		
//		MemberDto member = null; // 실제는 이렇게
		MemberDto member = new MemberDto();
		Connection conn = null;
		
		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// 회원조회 메소드
			
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

	// 회원수정 -> 성공하면 1, 실패하면 그 외
	public int update() {
		System.out.println("회원수정 실행");
		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// 회원수정 메소드

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


	// 회원삭제 -> 성공하면 1, 실패하면 그 외

	public int delete() {
		System.out.println("회원삭제 실행");
		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// 회원삭제 메소드

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

}
