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
		System.out.println("싱글톤 -> Board");
	}

	private static class SingleTonClass {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingleTonClass.INSTANCE;
	}

	// 1.게시글 작성 BoardDto board= new BoardDto(no, title, content, writer, nickName);
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

	// 2. 글수정
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

	// 3. 글삭제
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

	// 4. 글조회(목록)
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

			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				while (rs.next()) { // 레코드
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

	// 5. 글조회(하나)
	public BoardDto bSelectOne(int no) {

		BoardDto board = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null; // 조회 -> 레코드(테이블)

		try {
			conn = DBConnect.getConnection();
			query = "select * from board0130 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();// 테이블 레코드 반환

			if (rs != null) {
				if (rs.next()) { // 레코드 조회
//					rs.getInt(1);
//					rs.getString(2);
//					rs.getString(3);
//					rs.getString(4);
//					rs.getString(5);
					// 테이블 레코드(DB데이터) -> 자바객체(DTO)
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

	// 6 . 글이 존재 하는 지 확인
	public int isBoard(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from board0130 where no=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// 조회 시

			if (rs != null) {
				if (rs.next()) {
					// 아이디체크, 로그인, 수정,삭제, 조회 전단,,,
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

}
