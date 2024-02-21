package org.web.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public Connection getConnetion() {

		Connection conn = null;

		String url = "oracle:jdbc:thin:@localhost:1521:xe";
		String userId = "system";
		String userPw = "1234";
		String driver = "jdbc.driver.OracleDriver";

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
