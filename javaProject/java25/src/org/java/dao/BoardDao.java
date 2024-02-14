package org.java.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public class BoardDao {

	public BoardDao() {
		System.out.println("�̱��� -> Board");
	}

	private static class Singleton {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return Singleton.INSTANCE;
	}

	// 1. �Խñ� �ۼ�
	public int bInsert(BoardDto board) {

		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into board0130(no,title,content,writer,nickname) VALUES(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, board.getNo());
			pstm.setString(2, board.getTitle());
			pstm.setString(3, board.getContent());
			pstm.setString(4, board.getWriter());
			pstm.setString(5, board.getNickName());

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

	// 2. �Խñ� ��ȸ
	// ��ü
	public List<BoardDto> bselect() {
		List<BoardDto> members = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select*from board0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					int no = rs.getInt(1);
					String title = rs.getString(2);
					String content = rs.getString(3);
					String writer = rs.getString(4);
					String nickName = rs.getString(5);

					members.add(new BoardDto(no, title, content, writer, nickName));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return members;
	}

	// �ϳ�
	public BoardDto bselectone(int no) {
		BoardDto result = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select*from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();
			if (rs != null) {
				if (rs.next()) {

					result = new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 3. �Խñ� ����
	public int bupdate(BoardDto board) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update board0130 set title=?,content=?,writer=?,nickname=? where no=?";
			pstm = conn.prepareStatement(query);

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

	// 4. �Խñ� ����
	public int bdelete(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

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

	// ���� ���� Ȯ��
	public int isBoard(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null; // ��ȸ

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) { // �������� while, �ϳ��� if
					// ���̵� üũ, �α���, ����, ����, ��ȸ ��...
					result = rs.getInt(1);// 1�̸� ����, 0�̸� ����
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

		return result;
	}

}
