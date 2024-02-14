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

	// -----------싱글톤---------//
	private ShopDao() {
		System.out.println("싱글톤 ->Shop");
	}

	private static class SingleTonClass {
		private static final ShopDao INSTANCE = new ShopDao();
	}

	public static ShopDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	// -----------싱글톤---------//

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

	// 3.전체 상품목록 조회
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

	// 4. 상품 수정
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

	// 5 . 상품(상품번호) 존재 하는 지 확인 -> 조회 (select), 등록,수정,삭제, 등록유무체크(아이디체크)
	public int isShop(int no) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// 조회
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from shop0131 where no=? ";
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

	// 6. 상품 삭제
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

	// 7. 상품번호(상품) 하나 조회
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

			if (rs != null) { // 검색 -> 하나일 경우
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

	// 8. 상품등록자를 검색 -> 상품등록자가 등록한 상품목록를 조회(검색)
	public List<ShopDto> searchWriter(String writer) {

		List<ShopDto> writerList = new ArrayList<ShopDto>();

		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		ResultSet rs = null; // 조회 select 쿼리
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
