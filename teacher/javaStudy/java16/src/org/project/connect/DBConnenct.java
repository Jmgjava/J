package org.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnenct {

	public static Connection getConnection() {
		// �����ͺ��̽� ���� -> ����( CURD)
		// DB���� Ŭ����
		Connection conn = null;// null ->Object�� �⺻ ��
								// @ȣ��Ʈ:��Ʈ:DB��
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// �����ͺ��̽� URL(xe ����)
		String user = "system";// ����� ����(���̵�)
		String password = "1234";// ����� �����ȣ
		String driver = "oracle.jdbc.driver.OracleDriver";// driver
		// DB���� ����
		try {
			// 1. ����̹� ã��
			Class.forName(driver);
			System.out.println("����̹�OK");
			// 2. DB���� -> DB���� ���� -> null
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB���� Success!!");

		} catch (ClassNotFoundException e) {
			System.out.println("����̹�NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� Fail!!");
			e.printStackTrace();
		}

		return conn;
	}
}
