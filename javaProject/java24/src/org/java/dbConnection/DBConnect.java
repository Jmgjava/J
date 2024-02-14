package org.java.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB ���(URL)
		String userId = "system"; // ���� id
		String userPw = "1234"; // ��й�ȣ
		String driver = "oracle.jdbc.driver.OracleDriver"; // ����Ŭ ����̹� ���

		try {
			// 1.����̹� ����
			Class.forName(driver);
			System.out.println("����̹� OK");

			// 2.DB����
			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB��������");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}

		return conn;
	};

}
