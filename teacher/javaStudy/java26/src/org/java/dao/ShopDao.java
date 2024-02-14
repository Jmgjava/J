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

	// -----------�̱���---------//
	private ShopDao() {
		System.out.println("�̱��� ->Shop");
	}

	private static class SingleTonClass {
		private static final ShopDao INSTANCE = new ShopDao();
	}

	public static ShopDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	// -----------�̱���---------//

	// 1.
	public int shopInsert(int no, String title, String detail, String writer, int isFile) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into shop0131(no, title,detail,writer,isfile) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);
			pstm.setString(2, title);
			pstm.setString(3, detail);
			pstm.setString(4, writer);
			pstm.setInt(5, isFile);

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

	// 2.
	// ShopDto shop= new ShopDto(no, title, detail, writer, isFile);
	public int shopInsertDto(ShopDto shop) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into shop0131(no, title,detail,writer,isfile) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, shop.getNo());
			pstm.setString(2, shop.getTile());
			pstm.setString(3, shop.getDetail());
			pstm.setString(4, shop.getWriter());
			pstm.setInt(5, shop.getIsFile());

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

	// 3.��ü ��ǰ��� ��ȸ
	public List<ShopDto> shopSelectAll() {

		List<ShopDto> shopList = new ArrayList<ShopDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from shop0131";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {

//					int no = rs.getInt(1);
//					String title = rs.getString(2);
//					String detail = rs.getString(3);
//					String writer = rs.getString(4);
//					int isFile = rs.getInt(5);
//
//					ShopDto dto = new ShopDto(no, title, query, title, isFile);
//					shopList.add(dto);

					shopList.add(
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
				e.printStackTrace();
			}
		}

		return shopList;
	}

	// 4. ��ǰ ����
	public int shopUpdateDto(ShopDto shop) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update shop0131 set title=?,detail=?,writer=?,isfile=? where no=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, shop.getTile());
			pstm.setString(2, shop.getDetail());
			pstm.setString(3, shop.getWriter());
			pstm.setInt(4, shop.getIsFile());
			pstm.setInt(5, shop.getNo());

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

	// 5 . ��ǰ(��ǰ��ȣ) ���� �ϴ� �� Ȯ�� -> ��ȸ (select), ���,����,����, �������üũ(���̵�üũ)
	public int isShop(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from shop0131 where no=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// ��ȸ ��

			if (rs != null) {
				if (rs.next()) {
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

	// 6. ��ǰ ����
	public int shopDelete(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from  shop0131 where no=?";
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

	// 7. ��ǰ��ȣ(��ǰ) �ϳ� ��ȸ
	public ShopDto searchNo(int no) {

		ShopDto shop = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from shop0131 where no=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();

			if (rs != null) { // �˻� -> �ϳ��� ���
				if (rs.next()) {
//					int no2 = rs.getInt(1);
//					String title = rs.getString(2);
//					String detail = rs.getString(3);
//					String writer = rs.getString(4);
//					int isFile = rs.getInt(5);

					shop = new ShopDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

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

		return shop;
	}

	// 8. ��ǰ����ڸ� �˻� -> ��ǰ����ڰ� ����� ��ǰ��ϸ� ��ȸ(�˻�)
	public List<ShopDto> searchWriter(String writer) {

		List<ShopDto> writerList = new ArrayList<ShopDto>();

		Connection conn = null; // DB����
		PreparedStatement pstm = null;// SQLó��
		ResultSet rs = null; // ��ȸ select ����
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from shop0131 where writer=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, writer);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					writerList.add(
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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return writerList;
	}

}
