package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

//	private static final MemberDao INSTANCE=new MemberDao();

	private MemberDao() {
		System.out.println("싱글톤 DAO");
	}

	// 내부 클래스 -> private (내부에서만 사용)
	private static class SingtonClass {
		// 싱글톤 패턴 -> 객체를 한번만 생생
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingtonClass.INSTANCE;
	}

//	public MemberDao() {
//		System.out.println("기본생성자 DAO");
//	}

	// 회원가입 -> 성공 1, 실패하면 1이외의 값이 반환
	public int insert(String userId, String userPw, int age, String name) {

		int result = 0; // 결과 값 처리 변수

		Connection conn = null;// Connction
		PreparedStatement pstm = null; // Query처리문
		String query = "";

		try {
			// 1.DB연동
			conn = DBConnect.getConnecton();
			// 2.쿼리문 // 외부 입력 데이터는 ? 처리 PreparedStatement
			query = "insert into member0129(userId, userPw, age, name) values(?,?,?,?)";
			// 3.쿼리문 ->Connection연결
			pstm = conn.prepareStatement(query);
			// 4.외부 입력 값을 처리
			pstm.setString(1, userId); // 1번째 ?
			pstm.setString(2, userPw); // 2번째 ?
			pstm.setInt(3, age); // 3번째 ?
			pstm.setString(4, name); // 1번째 ?
			// 5.최종 실행-> 결과를 반환 1이면
			result = pstm.executeUpdate();// insert,update,delete쿼리문에 사용

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

	// 회원조회(목록)-> 전제회원조회
	public List<MemberDto> select() {

		List<MemberDto> members = new ArrayList<MemberDto>();// isEmpty() -> 비었으면 true

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		try {
			// 1.DB연동
			conn = DBConnect.getConnecton();
			// 2.쿼리문 // 외부 입력 데이터는 ? 처리 PreparedStatement
			query = "select * from member0129";
			// 3.쿼리문 ->Connection연결
			pstm = conn.prepareStatement(query);
			// 4.외부 입력 값을 처리, 레코드
			rs = pstm.executeQuery();// select

			if (rs != null) {// 레코드가 존재 하면 조회
				while (rs.next()) {
					// 레코드 하나
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));
				}
			}

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
		return members;
	}

	// 회원상세조회(특정회원) -> CRUD

	// 회원수정 -> 성공 1, 실패하면 1이외의 값이 반환
	public int update(String userId, String userPw, int age, String name) {
		// userId가 일치 하는 회원의 userPw,age,name를 변경 하세요
		int result = 0; // 결과 값 처리 변수

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnecton();
			query = "update  member0129 set userpw=?, age=? , name=?  where userId=? ";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// 성공 1
			result = pstm.executeUpdate();

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

	// 회원탈퇴 -> 성공 1, 실패하면 1이외의 값이 반환
	public int delete(String userId) {
		// userId가 일치 하면 회원탈퇴
		int result = 0; // 결과 값 처리 변수

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnecton();
			query = "delete from member0129 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);

			result = pstm.executeUpdate();

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

}
