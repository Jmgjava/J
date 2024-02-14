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

	public MemberDao() {
		System.out.println("ΩÃ±€≈Ê");
	}

	private static class singleton {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return singleton.INSTANCE;
	}

	public int mInsert(MemberDto insertBoard) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0201(no,userId,userPw,age,name) VALUES(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, insertBoard.getNo());
			pstm.setString(2, insertBoard.getUserId());
			pstm.setString(3, insertBoard.getUserPw());
			pstm.setInt(4, insertBoard.getAge());
			pstm.setString(5, insertBoard.getName());

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

	public List<MemberDto> mSelect() {
		List<MemberDto> member = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select*from member0201";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null)
				while (rs.next()) {
					member.add(new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getString(5)));
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

		return member;
	}

	public MemberDto sCheck(int no) {
		MemberDto result = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select* from member0201 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getString(5));
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

	public int mUpdate(MemberDto insertBoard) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0201 set userId=?,userPw=?,age=?,name=? where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, insertBoard.getUserId());
			pstm.setString(2, insertBoard.getUserPw());
			pstm.setInt(3, insertBoard.getAge());
			pstm.setString(4, insertBoard.getName());
			pstm.setInt(5, insertBoard.getNo());

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

	public int mDelete(MemberDto insertBoard) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0201 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, insertBoard.getNo());

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

	public int mExist(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0201 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
