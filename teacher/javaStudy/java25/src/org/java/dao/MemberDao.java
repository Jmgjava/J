package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	/////////////////////////////////////////////////
	private MemberDao() {
		System.out.println("�̱���");
	}

	private static class SingletonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}
	/////////////////////////////////////////////////

	// 1. ȸ������
	public int insert(String userId, String userPw, int age, String name) {

		int result = 0;

		// ȸ�� ���̵� ����
//		int bool=selectBool(userId);// 1(�̹� ȸ�����̵� O)
//		if(bool==1) {			
//			return 2;
//		}
		//		

		// 1. DB����
		Connection conn = null;
		// 2. SQL ó��
		PreparedStatement pstm = null;
		// 3. SQL
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = "insert into member0130(userId,userPw,age,name) values(?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			// �������� ? ���� 1~
			pstm.setString(1, userId); // ���񽺿��� ���޵� userId
			pstm.setString(2, userPw); // ���񽺿��� ���޵� userPw
			pstm.setInt(3, age); // ���񽺿��� ���޵� 3, age
			pstm.setString(4, name); // ���񽺿��� ���޵� userPw

			// 2.�������� ���������� ���� -> ������� ��ȯ
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

		return result; // ����, ����, ������ �����̸� 1, �������� ����
	}

	// 2.ȸ����ȸ (���)
	public List<MemberDto> select() {
		List<MemberDto> members = new ArrayList<MemberDto>();
		// 1.DB����
		Connection conn = null;
		// 2. SQL ó��
		PreparedStatement pstm = null;
		// 3.SQL�� -> ������
		String query = "";
		// 4. ResultSet -> DB������ get
		ResultSet rs = null; // ���̺� ���ڵ� ���� get

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0130";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				while (rs.next()) { // ���ڵ�
					// ���̺� ���ڵ� -> DTO��ü ��ȯ -> List<MemberDto> members
					String userId = rs.getString(1);// ���ڵ� 1(Į��)
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);
					members.add(new MemberDto(userId, userPw, age, name));
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

		return members;
	}

	// 3.ȸ�� ����
	public int update(String userId, String userPw, int age, String name) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = " update member0130 set userPw=?, age=?, name=? where userId=? ";
			pstm = conn.prepareStatement(query);

			// �������� ?����
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// 2.�������� ���������� ���� -> ������� ��ȯ
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

	// 4.ȸ�� Ż��
	public int delete(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			// 1.
			conn = DBConnect.getConnection();
			query = " delete from member0130  where userId=? ";
			pstm = conn.prepareStatement(query);

			// �������� ?����
			pstm.setString(1, userId);

			// 2.�������� ���������� ���� -> ������� ��ȯ
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

	// 5. ȸ�� ��ȸ -> ���ڵ�(DTO)
	public MemberDto selectOne(String userId) {

		MemberDto member = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0130 where userId=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			rs = pstm.executeQuery();// ���̺� ���ڵ� ��ȯ

			if (rs != null) {
				if (rs.next()) { // ���ڵ� get
					/*
					 * // String userId = rs.getString(1);// ���ڵ� 1(Į��) // String userPw =
					 * rs.getString(2); // int age = rs.getInt(3); // String name = rs.getString(4);
					 */
					member = new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
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

		return member;
	}

	// 6. ȸ�� ��ȸ(ȸ������) -> 1�̸� �����ϰ� ������ X
	public int selectBool(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*)  from member0130 where userid=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);// 1(O) ,0(X)
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
