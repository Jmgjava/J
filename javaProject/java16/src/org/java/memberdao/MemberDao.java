package org.java.memberdao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.memberconnect.DBConnect;
import org.java.memberdto.MemberDto;
import org.java.memberservice.MemberDeleteService;
import org.java.memberservice.MemberSelectService;

// ���񽺿��� DB ���� ��Ų���� ���� DAO -><- DB
public class MemberDao {

	public MemberDao() {
		System.out.println("DAO");
	}

	// ȸ������ -> DBConnect ** �����̸� 1��ȯ ���и� ��������
	public int insert(int no, String userId, String userPw, String name, int age) {
		int result = 0;
		System.out.println("ȸ������ ����");

		Connection conn = null; // ���ᰴü
		String query = ""; // ������
		PreparedStatement pstm = null; // ������ ���� ��ü

		try {
			// 1.DB����
			conn = DBConnect.getConnection();
			// 2.������ ���� -> JDBC ���� �� ��� //1,2,3,4,5
			query = "insert into Member0117(no,userId,userPw,name,age) values(?,?,?,?,?)";

			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setString(4, name);
			pstm.setInt(5, age);

			// 3.����� ��ȯ
			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (conn != null)
					conn.close(); // DB���� ����
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// �����ϸ�1 ,�����ϸ� 1�� ������ ��
		return result;

	}

	// ȸ������ -> DBConnect ** �����̸� 1��ȯ ���и� ��������

	public int update() {
		int result = 0;
		System.out.println("ȸ������ ����");

		return result;
	}

	// ȸ����ȸ -> DBConnect ** �����̸� 1��ȯ ���и� ��������

	public MemberDto select() {
		MemberDto dto = new MemberDto(1, "m1", "11", "ss", 15);
		System.out.println("ȸ����ȸ ����");

		Connection conn = null;
		try {
			// 1.DB����
			conn = DBConnect.getConnection();
			// 2.������ ����
			// 3.����� ��ȯ
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

//		try {
//			conn = DBConnect.getConnection();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

		return dto;
	}

	// ȸ������ -> DBConnect ** �����̸� 1��ȯ ���и� ��������

	public int delete() {
		int result = 0;
		System.out.println("ȸ������ ����");

		return result;
	}

}
