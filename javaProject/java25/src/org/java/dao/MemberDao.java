package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet.ParagraphAttribute;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	private static class SingletonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}

	// 1.ȸ������ ************
	public int insert(String userId, String userPw, int age, String name) {
		int result = 0;

		// ȸ�� ���̵� ����(ȸ����ȸ�� ����Ȯ��)
		int bool = selectBool(userId); // 1 ( �̹� ȸ�����̵� �ִ�)
		if (bool == 1) {
			return 2;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0130(userid, userPw, age, name) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, name);

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

	// 2.ȸ����ȸ ************
	// 2-1. ��ü ��ȸ
	public List<MemberDto> select() {


		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1. DB ����
		Connection conn = null;
		// 2. SQL ó��
		PreparedStatement pstm = null;
		// 3. SQL�� -> ������
		String query = "";
		ResultSet rs = null; // ���̺� ���ڵ� ���� get

		try {
			conn = DBConnect.getConnection();
			query = "select*from member0130";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery(); // ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				while (rs.next()) { // ���ڵ� ����
					// ���̺� ���ڵ� -> DTO��ü ��ȯ -> List<MemberDto> members

					String userId = rs.getString(1); // ���ڵ� 1(Į��)
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));

//					for (MemberDto member : members) {
//						System.out.println("���̵�: " + member.getUserId());
//					}

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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;
	}

	// 2-2. ��ȸ�� ���̵� ����
	public MemberDto selectone(String userId) {
		MemberDto member = null;

		// 1. DB ����
		Connection conn = null;
		// 2. SQL ó��
		PreparedStatement pstm = null;
		// 3. SQL�� -> ������
		String query = "";
		ResultSet rs = null; // ���̺� ���ڵ� ���� get

		try {
			conn = DBConnect.getConnection();
			query = "select*from member0130 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery(); // ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				if (rs.next()) {
//				String userId=rs.getString(1);

					member = new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				}
			}
		} catch (

		SQLException e) {
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

		return member;
	}

	// 3.ȸ������ ************
	public int update(String userId, String userPw, int age, String name) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;

		try {
			conn = DBConnect.getConnection();
			query = "update member0130 set userPw=?, age=?, name=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

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

	// 4.ȸ��Ż�� ************
	public int delete(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0130 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);

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

	// 5.ȸ������Ȯ�� ************
	// -> 1�̸� �����ϰ� ������ X (����,��ȸ,����,Ż�� ��� ���)
	public int selectBool(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0130 where userId=?";
			ResultSet rs = null;
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1); // 1(O), 0(X)
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

}
