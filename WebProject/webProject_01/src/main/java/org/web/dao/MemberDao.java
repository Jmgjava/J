package org.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.web.connect.DBConnect;
import org.web.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	private static class singleton {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return singleton.INSTANCE;
	}

	public int mInsert(MemberDto board) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1(userId,userPw,userName) values (?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, board.getUserId());
			pstm.setString(2, board.getUserPw());
			pstm.setString(3, board.getUserName());

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

	public List<MemberDto> mselect() {
		List<MemberDto> member = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select* from member1";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					member.add(new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
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

		return member;
	}

}
