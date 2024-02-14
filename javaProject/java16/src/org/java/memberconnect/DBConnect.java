package org.java.memberconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// �����ͺ��̽� ����
public class DBConnect {

	/*
	 * > Connection ��ü��? �ڹٿ��� DB�� �����ϱ� ���� ����ϴ� ��ü�Դϴ�. �Ķ���ʹ� Data�� ��ġ(URL), ��Ÿ����(DB����
	 * ID, �н�����, ��Ʈ ��ȣ)�Դϴ�. DriveManager�� getConnection()�޼ҵ带 ȣ���Ͽ� ������ �� �ֽ��ϴ�.
	 */

	// DB ���� -> ����(static) �޼ҵ�
	public static Connection getConnection() {

		// �����ͺ��̽��� �����ؼ� -> ����(CRUD)
		// DB���� Ŭ����,
		Connection conn = null; // null -> Object�� �⺻��

									// @ȣ��Ʈ:��Ʈ:DB���
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� url (xe: ����)
		String userId = "system"; // ����� ����
		String passward = "1234"; // ��й�ȣ
		String driver = "oracle.jdbc.driver.OracleDriver"; // driver

		// DB ���� ����
		try {
			// 1.����̹� ã��
			Class.forName(driver);
			System.out.println("����̹� ����");
			// 2.DB���� -> DB���� ���� -> null
			conn = DriverManager.getConnection(url, userId, passward);
			System.out.println("DB ���� Success");

		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� Fail");
			e.printStackTrace();
		}

		return conn;

	}
}
