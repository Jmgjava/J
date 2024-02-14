package org.java.dao;

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

	private BoardDao() {
		System.out.println("�̱��� -> Board");
	}

	private static class SingleTonClass {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingleTonClass.INSTANCE;
	}

	// 1.�Խñ� �ۼ� BoardDto board= new BoardDto(no, title, content, writer, nickName);
	public int bInsert(BoardDto board) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into board0130(no,title,content,writer,nickname) values(?, ?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, board.getNo());
			pstm.setString(2, board.getTitle());
			pstm.setString(3, board.getContent());
			pstm.setString(4, board.getWriter());
			pstm.setString(5, board.getNickName());

			result = pstm.executeUpdate();// ����, ����, ������ �����̸� 1, �������� ����

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

	// 2. �ۼ���
	public int bUpdate(BoardDto board) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update board0130 set title=?,content=?,writer=?,nickname=? where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, board.getTitle());
			pstm.setString(2, board.getContent());
			pstm.setString(3, board.getWriter());
			pstm.setString(4, board.getNickName());
			pstm.setInt(5, board.getNo());

			result = pstm.executeUpdate();// ����, ����, ������ �����̸� 1, �������� ����

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

	// 3. �ۻ���
	public int bDelete(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from board0130 where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			result = pstm.executeUpdate();// ����, ����, ������ �����̸� 1, �������� ����

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

	// 4. ����ȸ(���)
	public List<BoardDto> select() {

		List<BoardDto> boards = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from board0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				while (rs.next()) { // ���ڵ�
					boards.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5)));
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

		return boards;
	}

	// 5. ����ȸ(�ϳ�)
	public BoardDto bSelectOne(int no) {

		BoardDto board = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null; // ��ȸ -> ���ڵ�(���̺�)

		try {
			conn = DBConnect.getConnection();
			query = "select * from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				if (rs.next()) { // ���ڵ� ��ȸ
//					rs.getInt(1);
//					rs.getString(2);
//					rs.getString(3);
//					rs.getString(4);
//					rs.getString(5);
					// ���̺� ���ڵ�(DB������) -> �ڹٰ�ü(DTO)
					board = new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5));
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

		return board;
	}

	// 6 . ���� ���� �ϴ� �� Ȯ��
	public int isBoard(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from board0130 where no=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// ��ȸ ��

			if (rs != null) {
				if (rs.next()) {
					// ���̵�üũ, �α���, ����,����, ��ȸ ����,,,
					result = rs.getInt(1);// 1�̸� ����, 0�̸� x
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
