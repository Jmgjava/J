package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.dto.ShopDto;

public class ShopDao {

	// ---------------------------�̱���----------------------------//
	public ShopDao() {
		System.out.println("�̱���");
	}

	private static class sigleton {
		private static final ShopDao INSTANCE = new ShopDao();
	}

	public static ShopDao getInstance() {
		return sigleton.INSTANCE;
	}

	// ---------------------------�̱���----------------------------//
	// �Խñ� �ۼ�
	public int sInsert(ShopDto board) {

		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into shop0131(no, title, detail, writer, isFile) VALUES(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, board.getNo());
			pstm.setString(2, board.getTitle());
			pstm.setString(3, board.getDetail());
			pstm.setString(4, board.getWriter());
			pstm.setInt(5, board.getIsfile());

			result = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	// �Խñ� ��ü��ȸ
	public List<ShopDto> sSelect() {

		List<ShopDto> member = new ArrayList<ShopDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select*from shop0131";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
//					int no = rs.getInt(1);
//					String title = rs.getString(2);
//					String detail = rs.getString(3);
//					String writer = rs.getString(4);
//					int isfile = rs.getInt(5);
//
//					ShopDto dto = new ShopDto(no, title, detail, writer, isfile);
//					member.add(dto);

					member.add(
							new ShopDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return member;

	}

	// �Խñ� ������ȸ
	public ShopDto sSelectOne(int no) {
		ShopDto result = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select*from shop0131 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = new ShopDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
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

	// �ۼ��ڷ� ã��
	public List<ShopDto> sSelectWriter(String writer) {
		System.out.println("�ۼ��ڰ˻�");
		List<ShopDto> writerL = new ArrayList<ShopDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from shop0131 where writer=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, writer);

			rs = pstm.executeQuery();

			if (rs != null)
				while (rs.next()) {
					writerL.add(
							new ShopDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return writerL;
	}

	// �Խñ� ����
	public int sUpdate(ShopDto board) {

		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update shop0131 set title=?,detail=?,writer=?,isFile=? where no=?";
			pstm = conn.prepareStatement(query);

//			pstm.setString(1, title);
//			pstm.setString(2, detail);
//			pstm.setString(3, writer);
//			pstm.setInt(4, isfile);
//			pstm.setInt(5, no);

			pstm.setString(1, board.getTitle());
			pstm.setString(2, board.getTitle());
			pstm.setString(3, board.getWriter());
			pstm.setInt(4, board.getIsfile());
			pstm.setInt(5, board.getNo());

			result = pstm.executeUpdate();
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

	// �Խñ� ����
	public int sDelete(int no) {

		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from shop0131 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			result = pstm.executeUpdate();
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

	// �Խñ� ���� ���� Ȯ�� ***
	public int sExist(int no) {
		int result = 0;

		Connection conn = null;
		String query = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from shop0131 where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);
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
