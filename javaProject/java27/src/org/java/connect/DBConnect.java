package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "system";
		String userPw = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			Class.forName(driver);
			System.out.println("����̹� OK");

			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}

		return conn;
	}

}
