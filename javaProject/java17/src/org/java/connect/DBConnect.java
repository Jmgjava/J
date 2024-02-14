package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {

		Connection conn = null;

		String url = "jdbc:oracle:thin:@lacalhost:1511:xe"; // DB url
		String userId = "";
		String userPw = "";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 1. ����̹� ã��
		try {
			Class.forName(driver);
			System.out.println("����̹� OK");
			
			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}

		// 2. DB ����

		return conn;
	}

}
