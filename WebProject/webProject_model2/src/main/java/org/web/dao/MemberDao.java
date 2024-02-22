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

	public int insert(String userId, String userPw, String gender, String hobby, String memo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnect();
			query = "insert into model2_tb(userId,userPw,gender,hobby,memo) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, gender);
			pstm.setString(4, hobby);
			pstm.setString(5, memo);

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

	public List<MemberDto> selectAll() {
		
		List<MemberDto> members = new ArrayList<MemberDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "select * from  model2_tb";

			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery(); // 조회

			if (rs != null) {
				while (rs.next()) {
					int no = rs.getInt(1);
					String userId = rs.getString(2);
					String userPw = rs.getString(3);
					String gender = rs.getString(4);
					String hobby = rs.getString(5);
					String memo = rs.getString(6);
					
					members.add(new MemberDto(no, userId, userPw, gender, hobby, memo));
					
					
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;
	}

}
