package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

//���񽺿���DB���� ��Ų�� ���� DAO-><-DB
public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// ȸ������ -> DBConnect ** �����ϸ� 1��ȯ ���и� ��������
	public int insert(int no, String userId, String userPw, String name, int age) {

		int result = 0;

		System.out.println("ȸ������ ����");
		Connection conn = null;// ���ᰴü
		String query = "";// ������
		PreparedStatement pstm = null;// �������� ���� ��ü

		try {
			// 1. DB����
			conn = DBConnect.getConnection();
			// 2. ������ ���� -> JDBC ���� �� ��� //1,2,3,4,5
			query = "insert into  member0117(no,userId,userPw,name,age) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setString(4, name);
			pstm.setInt(5, age);
			// 3. ����� ��ȯ
			result = pstm.executeUpdate();// ȸ�� ���� ���� �ϸ� 1

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB��������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ���� �ϸ� 1, ���� �ϸ� 1�� ������ ��
		return result;
	}

	// ȸ������ -> DBConnect ** �����ϸ� 1��ȯ ���и� ��������
	public int update() {
		int result = 0;
		System.out.println("ȸ������ ����");

		Connection conn = null;
		try {
			// 1. DB����
			conn = DBConnect.getConnection();
			// 2. ������ ���� -> JDBC ���� �� ���
			// 3. ����� ��ȯ
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB���� X
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ��Ż�� -> DBConnect ** �����ϸ� 1��ȯ ���и� ��������
	public int delete() {
		int result = 0;
		System.out.println("ȸ��Ż�� ����");

		Connection conn = null;

		try {
			// 1. DB����
			conn = DBConnect.getConnection();
			// 2. ������ ���� -> JDBC ���� �� ���
			// 3. ����� ��ȯ
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // DB���� X
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// ȸ����ȸ -> DBConnect
	public MemberDto select() {

		MemberDto member = new MemberDto(1, "m1", "11", "s1", 11);

		System.out.println("ȸ����ȸ ����");
		Connection conn = null;
		try {
			// 1. DB����
			conn = DBConnect.getConnection();
			// 2. ������ ���� -> JDBC ���� �� ���
			// 3. ����� ��ȯ -> ȸ�������� DB���̺��� ��ȸ
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return member;
	}

}
