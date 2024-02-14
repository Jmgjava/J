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

	/////////////////////////////////////////////////
	private MemberDao() {
		System.out.println("싱글톤");
	}

	private static class SingletonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}
	/////////////////////////////////////////////////

	// 1. 회원가입
	public int insert(String userId, String userPw, int age, String name) {

		int result = 0;

		// 회원 아이디 유무
//		int bool=selectBool(userId);// 1(이미 회원아이디가 O)
//		if(bool==1) {			
//			return 2;
//		}
		//		

		// 1. DB연동
		Connection conn = null;
		// 2. SQL 처리
		PreparedStatement pstm = null;
		// 3. SQL
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = "insert into member0130(userId,userPw,age,name) values(?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			// 쿼리문의 ? 순서 1~
			pstm.setString(1, userId); // 서비스에서 전달된 userId
			pstm.setString(2, userPw); // 서비스에서 전달된 userPw
			pstm.setInt(3, age); // 서비스에서 전달된 3, age
			pstm.setString(4, name); // 서비스에서 전달된 userPw

			// 2.쿼리문을 최종적으로 실행 -> 결과값을 반환
			result = pstm.executeUpdate();// 가입, 수정, 삭제는 성공이면 1, 나머지는 실패

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

		return result; // 가입, 수정, 삭제는 성공이면 1, 나머지는 실패
	}

	// 2.회원조회 (목록)
	public List<MemberDto> select() {
		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1.DB연동
		Connection conn = null;
		// 2. SQL 처리
		PreparedStatement pstm = null;
		// 3.SQL문 -> 쿼리문
		String query = "";
		// 4. ResultSet -> DB테이터 get
		ResultSet rs = null; // 테이블 레코드 단위 get

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0130";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				while (rs.next()) { // 레코드
					// 테이블 레코드 -> DTO객체 변환 -> List<MemberDto> members
					String userId = rs.getString(1);// 레코드 1(칼럼)
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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;
	}

	// 3.회원 수정
	public int update(String userId, String userPw, int age, String name) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = " update member0130 set userPw=?, age=?, name=? where userId=? ";
			pstm = conn.prepareStatement(query);

			// 쿼리문의 ?순서
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// 2.쿼리문을 최종적으로 실행 -> 결과값을 반환
			result = pstm.executeUpdate();// 가입, 수정, 삭제는 성공이면 1, 나머지는 실패

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

	// 4.회원 탈퇴
	public int delete(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = " delete from member0130  where userId=? ";
			pstm = conn.prepareStatement(query);

			// 쿼리문의 ?순서
			pstm.setString(1, userId);

			// 2.쿼리문을 최종적으로 실행 -> 결과값을 반환
			result = pstm.executeUpdate();// 가입, 수정, 삭제는 성공이면 1, 나머지는 실패

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

	// 5. 회원 조회 -> 레코드(DTO)
	public MemberDto selectOne(String userId) {

		MemberDto member = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0130 where userId=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				if (rs.next()) { // 레코드 get
					/*
					 * // String userId = rs.getString(1);// 레코드 1(칼럼) // String userPw =
					 * rs.getString(2); // int age = rs.getInt(3); // String name = rs.getString(4);
					 */
					member = new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return member;
	}

	// 6. 회원 조회(회원유무) -> 1이면 존재하고 나머지 X
	public int selectBool(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*)  from member0130 where userid=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);// 1(O) ,0(X)
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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
