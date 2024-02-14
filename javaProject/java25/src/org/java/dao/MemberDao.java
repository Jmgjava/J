package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet.ParagraphAttribute;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	private static class SingletonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}

	// 1.회원가입 ************
	public int insert(String userId, String userPw, int age, String name) {
		int result = 0;

		// 회원 아이디 유무(회원조회시 유무확인)
		int bool = selectBool(userId); // 1 ( 이미 회원아이디가 있다)
		if (bool == 1) {
			return 2;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0130(userid, userPw, age, name) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, name);

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

	// 2.회원조회 ************
	// 2-1. 전체 조회
	public List<MemberDto> select() {


		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1. DB 연동
		Connection conn = null;
		// 2. SQL 처리
		PreparedStatement pstm = null;
		// 3. SQL문 -> 쿼리문
		String query = "";
		ResultSet rs = null; // 테이블 레코드 단위 get

		try {
			conn = DBConnect.getConnection();
			query = "select*from member0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery(); // 테이블 레코드 반환

			if (rs != null) {
				while (rs.next()) { // 레코드 한줄
					// 테이블 레코드 -> DTO객체 변환 -> List<MemberDto> members

					String userId = rs.getString(1); // 레코드 1(칼럼)
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));

//					for (MemberDto member : members) {
//						System.out.println("아이디: " + member.getUserId());
//					}

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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;
	}

	// 2-2. 조회할 아이디 선택
	public MemberDto selectone(String userId) {
		MemberDto member = null;

		// 1. DB 연동
		Connection conn = null;
		// 2. SQL 처리
		PreparedStatement pstm = null;
		// 3. SQL문 -> 쿼리문
		String query = "";
		ResultSet rs = null; // 테이블 레코드 단위 get

		try {
			conn = DBConnect.getConnection();
			query = "select*from member0130 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery(); // 테이블 레코드 반환

			if (rs != null) {
				if (rs.next()) {
//				String userId=rs.getString(1);

					member = new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				}
			}
		} catch (

		SQLException e) {
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

	// 3.회원수정 ************
	public int update(String userId, String userPw, int age, String name) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;

		try {
			conn = DBConnect.getConnection();
			query = "update member0130 set userPw=?, age=?, name=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

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

	// 4.회원탈퇴 ************
	public int delete(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0130 where userId=?";
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

	// 5.회원유무확인 ************
	// -> 1이면 존재하고 나머지 X (가입,조회,수정,탈퇴 모두 사용)
	public int selectBool(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0130 where userId=?";
			ResultSet rs = null;
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1); // 1(O), 0(X)
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

		return result;
	}

}
