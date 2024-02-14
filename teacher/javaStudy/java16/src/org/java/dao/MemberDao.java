package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

//서비스에서DB관련 시킨일 수행 DAO-><-DB
public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// 회원가입 -> DBConnect ** 성공하면 1반환 실패면 나머지값
	public int insert(int no, String userId, String userPw, String name, int age) {

		int result = 0;

		System.out.println("회원가입 수행");
		Connection conn = null;// 연결객체
		String query = "";// 쿼리문
		PreparedStatement pstm = null;// 쿼리문을 실행 객체

		try {
			// 1. DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문 실행 -> JDBC 수업 때 사용 //1,2,3,4,5
			query = "insert into  member0117(no,userId,userPw,name,age) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setString(4, name);
			pstm.setInt(5, age);
			// 3. 결과값 반환
			result = pstm.executeUpdate();// 회원 가입 성공 하면 1

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB연동해제
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 성공 하면 1, 실패 하면 1을 제외한 값
		return result;
	}

	// 회원수정 -> DBConnect ** 성공하면 1반환 실패면 나머지값
	public int update() {
		int result = 0;
		System.out.println("회원수정 수행");

		Connection conn = null;
		try {
			// 1. DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문 실행 -> JDBC 수업 때 사용
			// 3. 결과값 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB연동 X
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원탈퇴 -> DBConnect ** 성공하면 1반환 실패면 나머지값
	public int delete() {
		int result = 0;
		System.out.println("회원탈퇴 수행");

		Connection conn = null;

		try {
			// 1. DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문 실행 -> JDBC 수업 때 사용
			// 3. 결과값 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB연동 X
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원조회 -> DBConnect
	public MemberDto select() {

		MemberDto member = new MemberDto(1, "m1", "11", "s1", 11);

		System.out.println("회원조회 수행");
		Connection conn = null;
		try {
			// 1. DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문 실행 -> JDBC 수업 때 사용
			// 3. 결과값 반환 -> 회원정보를 DB테이블에서 조회
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
