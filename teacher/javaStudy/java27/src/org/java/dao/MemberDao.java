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
	// ------------싱글톤-------------//
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}

	private static class SingleTonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	// ------------싱글톤-------------//

	// 회원유무 체크 -> 회원등록, 수정,탈퇴, 조회(하나), 검색 -> 먼저 수행
	public int isUserIdChecked(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0201 where userId=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery();// 조회 시

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);// 1이면 존재, 0이면 x				
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

	// 1. 회원등록
	public int insert(int no, String userId, String userPw, int age, String name) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0201(no,userId, userPw,age,name) values(?,?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setInt(4, age);
			pstm.setString(5, name);

			result = pstm.executeUpdate();// 성공이면 1, 실패면 나머지

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

	// 전체 회원목록
	public List<MemberDto> selectAll() {

		List<MemberDto> members = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();			
			query = "select * from member0201";
			
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// 조회 시

			if (rs != null) {

				while (rs.next()) { // 하나이상의 레코드

					int no = rs.getInt(1); // 레코드의 타입 int getInt(칼럼명인덱스)
					String userId = rs.getString(2); // 레코드의 타입 int getString(칼럼명인덱스)
					String userPw = rs.getString(3);
					int age = rs.getInt(4);
					String name = rs.getString(5);
					// 1.테이블 레코드를 Dto객체로 변환
					MemberDto dto = new MemberDto(no, userId, userPw, age, name);
					// 2.변환한 Dto객체를(하나이상) -> List<MemberDto> 추가
					members.add(dto);

//					members.add(new MemberDto(no, userId, userPw, age, name));
//					members.add(new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getString(5)));
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

	// 회원번호 체크
	public int isNoChecked(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0201 where no=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// 조회 시

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);// 1이면 존재, 0이면 x
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

	public int update(int no, String userId, String userPw, int age, String name) {
		
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0201 set  userid=? , userpw=?, age=? ,name=? where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, name);
			pstm.setInt(5, no);

			result = pstm.executeUpdate();// 성공이면 1, 실패면 나머지

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

	public MemberDto selectOne(int no) {
	
		MemberDto member=null;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0201 where no=? ";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// 조회 시

			if (rs != null) {
				
				if (rs.next()) {  //하나의 레코드 
					
					int no2 = rs.getInt(1); // 레코드의 타입 int getInt(칼럼명인덱스)
					String userId = rs.getString(2); // 레코드의 타입 int getString(칼럼명인덱스)
					String userPw = rs.getString(3);
					int age = rs.getInt(4);
					String name = rs.getString(5);
					
					member=new MemberDto(no2, userId, userPw, age, name);
					
//					member=	new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getString(5))
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

	public int delete(int no) {
		
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0201 where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			result = pstm.executeUpdate();// 성공이면 1, 실패면 나머지

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
