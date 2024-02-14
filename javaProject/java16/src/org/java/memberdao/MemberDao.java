package org.java.memberdao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.memberconnect.DBConnect;
import org.java.memberdto.MemberDto;
import org.java.memberservice.MemberDeleteService;
import org.java.memberservice.MemberSelectService;

// 서비스에서 DB 관련 시킨일을 수행 DAO -><- DB
public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// 회원가입 -> DBConnect ** 성공이면 1반환 실패면 나머지값
	public int insert(int no, String userId, String userPw, String name, int age) {
		int result = 0;
		System.out.println("회원가입 수행");

		Connection conn = null; // 연결객체
		String query = ""; // 쿼리문
		PreparedStatement pstm = null; // 쿼리문 실행 객체

		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.쿼리문 실행 -> JDBC 수업 때 사용 //1,2,3,4,5
			query = "insert into Member0117(no,userId,userPw,name,age) values(?,?,?,?,?)";

			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setString(4, name);
			pstm.setInt(5, age);

			// 3.결과값 반환
			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (conn != null)
					conn.close(); // DB연동 해제
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 성공하면1 ,실패하면 1을 제외한 값
		return result;

	}

	// 회원수정 -> DBConnect ** 성공이면 1반환 실패면 나머지값

	public int update() {
		int result = 0;
		System.out.println("회원수정 실행");

		return result;
	}

	// 회원조회 -> DBConnect ** 성공이면 1반환 실패면 나머지값

	public MemberDto select() {
		MemberDto dto = new MemberDto(1, "m1", "11", "ss", 15);
		System.out.println("회원조회 수행");

		Connection conn = null;
		try {
			// 1.DB연동
			conn = DBConnect.getConnection();
			// 2.쿼리문 실행
			// 3.결과값 반환
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

//		try {
//			conn = DBConnect.getConnection();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

		return dto;
	}

	// 회원삭제 -> DBConnect ** 성공이면 1반환 실패면 나머지값

	public int delete() {
		int result = 0;
		System.out.println("회원삭제 실행");

		return result;
	}

}
