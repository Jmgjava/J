package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.dbConnection.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("�̱���");
	}

	// ���� Ŭ���� -> private (���� Ŭ���� ���ο����� ���� ����)
	private static class SingletonClass {
		// �̱��� ���� -> ��ü�� �ѹ��� ����
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}

	// ȸ������
	// �����ϸ� 1, �����ϸ� 1 �̿��� ���� ��ȯ
	public int insert(String userId, String userPw, int age, String name) {

		int result = 0; // ��� �� ó�� ����

		Connection conn = null; // Connection
		PreparedStatement pstm = null; // Query ó����
		String query = "";

		try {
			// 1. DB����
			conn = DBConnect.getConnection();
			// 2. ������ �ܺ��Է� �����ʹ� ?�� ó�� PreparedStatement
			query = "insert into member0129(userId, userPw,age,name) values(?,?,?,?)";
			// 3. ������ -> Connection ����
			pstm = conn.prepareStatement(query);
			// 4. �ܺ� �Է°��� ó�� (query���� �߰�)
			pstm.setString(1, userId); // 1��° ?
			pstm.setString(2, userPw); // 2��° ?
			pstm.setInt(3, age); // 3��° ?
			pstm.setString(4, name); // 4��° ?
			// 5. ���� ���� -> �����(return) ��ȯ
			result = pstm.executeUpdate(); // insert,update,delete ����(query)���� ���

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

	// ȸ����ȸ(�����ȸ) -> ��üȸ�� ��ȸ
	// ȸ�� ��ȸ(���) -> ��üȸ�� ��ȸ
	// ȸ�� ����ȸ(Ư��ȸ��) -> CRUD
	public List<MemberDto> select() {

		List<MemberDto> members = new ArrayList<MemberDto>(); // isEmpty() -> ������� true

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select* from member0129";

			pstm = conn.prepareStatement(query);

			// ���� 1
			rs = pstm.executeQuery();

			if (rs != null) { // ���ڵ尡 ���� �ϸ�

				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String name = rs.getString(4);

					members.add(new MemberDto(userId, userPw, age, name));

					for (MemberDto member : members) {
						System.out.println("���̵�" + member.getUserId());
						System.out.println("���̵�" + member.getUserPw());
						System.out.println("���̵�" + member.getAge());
						System.out.println("���̵�" + member.getName());
					}
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

		return members;

	}

	// ȸ������
	// �����ϸ� 1, �����ϸ� 1 �̿��� ���� ��ȯ
	public int update(String userId, String userPw, int age, String name) {

		// userId�� ��ġ �ϴ� ȸ���� userPw,age,name�� ����
		int result = 0;

		Connection conn = null;
		String query = "";
		PreparedStatement pstm = null;

		try {
			conn = DBConnect.getConnection();
			query = "update member0129 set userPw=?, age=?, name=? where userId=?";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, name);
			pstm.setString(4, userId);

			// ���� 1
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

	// ȸ��Ż��
	// �����ϸ� 1, �����ϸ� 1 �̿��� ���� ��ȯ
	public int delete(String userId) {
		// userId�� ��ġ �ϸ� ȸ�� �r��

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int result = 0;

		try {
			conn = DBConnect.getConnection();
			query = "delete member0130 where userid=?";
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

}
