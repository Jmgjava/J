package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.dbConnection.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("싱글톤");
	}

	// 내부 클래스 -> private (같은 클래스 내부에서만 접근 가능)
	private static class SingletonClass {
		// 싱글톤 패턴 -> 객체를 한번만 생성
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}

	// 회원가입
	// 성공하면 1, 실패하면 1 이외의 값이 반환
	public int insert(String userId, String userPw, int age, String name) {

		int result = 0; // 결과 값 처리 변수

		Connection conn = null; // Connection
		PreparedStatement pstm = null; // Query 처리문
		String query = "";

		try {
			// 1. DB연동
			conn = DBConnect.getConnection();
			// 2. 쿼리문 외부입력 데이터는 ?로 처리 PreparedStatement
			query = "insert into member0129(userId, userPw,age,name) values(?,?,?,?)";
			// 3. 쿼리문 -> Connection 연결
			pstm = conn.prepareStatement(query);
			// 4. 외부 입력값을 처리 (query문에 추가)
			pstm.setString(1, userId); // 1번째 ?
			pstm.setString(2, userPw); // 2번째 ?
			pstm.setInt(3, age); // 3번째 ?
			pstm.setString(4, name); // 4번째 ?
			// 5. 최종 실행 -> 결과값(return) 반환
			result = pstm.executeUpdate(); // insert,update,delete 쿼리(query)문에 사용

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	// 회원조회(목록조회) -> 전체회원 조회
	// 회원 조회(목록) -> 전체회원 조회
	// 회원 상세조회(특정회원) -> CRUD
	public List<MemberDto> select() {

		List<MemberDto> members = new ArrayList<MemberDto>(); // isEmpty() -> 비었으면 true

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select* from member0129";

			pstm = conn.prepareStatement(query);

			// 성공 1
			rs = pstm.executeQuery();

			if (rs != null) { // 레코드가 존재 하면

				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));

					for (MemberDto member : members) {
						System.out.println("아이디" + member.getUserId());
						System.out.println("아이디" + member.getUserPw());
						System.out.println("아이디" + member.getAge());
						System.out.println("아이디" + member.getName());
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;

	}

	// 회원수정
	// 성공하면 1, 실패하면 1 이외의 값이 반환
	public int update(String userId, String userPw, int age, String name) {

		// userId가 일치 하는 회원의 userPw,age,name을 변경
		int result = 0;

		Connection conn = null;
		String query = "";
		PreparedStatement pstm = null;

		try {
			conn = DBConnect.getConnection();
			query = "update member0129 set userPw=?, age=?, name=? where userId=?";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// 성공 1
			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원탈퇴
	// 성공하면 1, 실패하면 1 이외의 값이 반환
	public int delete(String userId) {
		// userId가 일치 하면 회원 탍퇴

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int result = 0;

		try {
			conn = DBConnect.getConnection();
			query = "delete member0130 where userid=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);

			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
