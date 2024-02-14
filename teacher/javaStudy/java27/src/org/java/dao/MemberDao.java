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
	// ------------�̱���-------------//
	private MemberDao() {
		System.out.println("�̱��� -> MemberDao");
	}

	private static class SingleTonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	// ------------�̱���-------------//

	// ȸ������ üũ -> ȸ�����, ����,Ż��, ��ȸ(�ϳ�), �˻� -> ���� ����
	public int isUserIdChecked(String userId) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0201 where userId=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

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

	// 1. ȸ�����
	public int insert(int no, String userId, String userPw, int age, String name) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0201(no,userId, userPw,age,name) values(?,?,?,?,?) ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);
			pstm.setString(2, userId);
			pstm.setString(3, userPw);
			pstm.setInt(4, age);
			pstm.setString(5, name);

			result = pstm.executeUpdate();// �����̸� 1, ���и� ������

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

	// ��ü ȸ�����
	public List<MemberDto> selectAll() {

		List<MemberDto> members = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();			
			query = "select * from member0201";
			
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// ��ȸ ��

			if (rs != null) {

				while (rs.next()) { // �ϳ��̻��� ���ڵ�

					int no = rs.getInt(1); // ���ڵ��� Ÿ�� int getInt(Į�����ε���)
					String userId = rs.getString(2); // ���ڵ��� Ÿ�� int getString(Į�����ε���)
					String userPw = rs.getString(3);
					int age = rs.getInt(4);
					String name = rs.getString(5);
					// 1.���̺� ���ڵ带 Dto��ü�� ��ȯ
					MemberDto dto = new MemberDto(no, userId, userPw, age, name);
					// 2.��ȯ�� Dto��ü��(�ϳ��̻�) -> List<MemberDto> �߰�
					members.add(dto);

//					members.add(new MemberDto(no, userId, userPw, age, name));
//					members.add(new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getString(5)));
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

	// ȸ����ȣ üũ
	public int isNoChecked(int no) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0201 where no=? ";
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

	public int update(int no, String userId, String userPw, int age, String name) {
		
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0201 set  userid=? , userpw=?, age=? ,name=? where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, name);
			pstm.setInt(5, no);

			result = pstm.executeUpdate();// �����̸� 1, ���и� ������

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

	public MemberDto selectOne(int no) {
	
		MemberDto member=null;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// ��ȸ
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0201 where no=? ";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, no);

			rs = pstm.executeQuery();// ��ȸ ��

			if (rs != null) {
				
				if (rs.next()) {  //�ϳ��� ���ڵ� 
					
					int no2 = rs.getInt(1); // ���ڵ��� Ÿ�� int getInt(Į�����ε���)
					String userId = rs.getString(2); // ���ڵ��� Ÿ�� int getString(Į�����ε���)
					String userPw = rs.getString(3);
					int age = rs.getInt(4);
					String name = rs.getString(5);
					
					member=new MemberDto(no2, userId, userPw, age, name);
					
//					member=	new MemberDto(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getString(5))
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

	public int delete(int no) {
		
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0201 where no=? ";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, no);

			result = pstm.executeUpdate();// �����̸� 1, ���и� ������

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
