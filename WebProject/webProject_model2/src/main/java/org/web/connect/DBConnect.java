package org.web.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnect() {

		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/testdb";
		String userId = "root";
		String userPw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			System.out.println("driver OK");

			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB연결 O");
		} catch (ClassNotFoundException e) {
			System.out.println("driver NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 NO");
			e.printStackTrace();
		}

		return conn;
	}
}
