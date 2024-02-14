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
		System.out.println("싱글톤 -> Board");
	}

	private static class Singleton {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return Singleton.INSTANCE;
	}

	// 1. 게시글 작성
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

	// 2. 게시글 조회
	// 전체
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

	// 하나
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

	// 3. 게시글 수정
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

	// 4. 게시글 삭제
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

	// 존재 유무 확인
	public int isBoard(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null; // 조회

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) { // 여러개는 while, 하나는 if
					// 아이디 체크, 로그인, 수정, 삭제, 조회 등...
					result = rs.getInt(1);// 1이면 존재, 0이면 없음
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
