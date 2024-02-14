package org.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");

	}

	// ȸ������ -> �����ϸ� 1, �����ϸ� �� ��

	public int insert(int no, String userId, String userPw, String name, int age) {
		int result = 0;
		System.out.println("ȸ������ ����");
		Connection conn = null;

		try {
//		1. ����̹�
//		2. DB���� -> ����̹� JDBC
			conn = DBConnect.getConnection();

//		3. ȸ������ -> SQL
		} catch (Exception e) {
			// ȸ������ �޼ҵ�

//		DB���� X
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

//		4. DB���� X

		return result;
	}

	
	// ȸ����ȸ -> ������ ��ü ��ȯ, �����ϸ� null or empty
	public MemberDto select() {
		System.out.println("ȸ����ȸ ����");
		
//		MemberDto member = null; // ������ �̷���
		MemberDto member = new MemberDto();
		Connection conn = null;
		
		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// ȸ����ȸ �޼ҵ�
			
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

	// ȸ������ -> �����ϸ� 1, �����ϸ� �� ��
	public int update() {
		System.out.println("ȸ������ ����");
		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// ȸ������ �޼ҵ�

		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;

	}


	// ȸ������ -> �����ϸ� 1, �����ϸ� �� ��

	public int delete() {
		System.out.println("ȸ������ ����");
		int result = 0;
		Connection conn = null;

		try {
			conn = DBConnect.getConnection();
		} catch (Exception e) {
			// ȸ������ �޼ҵ�

		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;

	}

}
