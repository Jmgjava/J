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

		// 1. 드라이버 찾기
		try {
			Class.forName(driver);
			System.out.println("드라이버 OK");
			
			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB연동 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 실패");
			e.printStackTrace();
		}

		// 2. DB 연동

		return conn;
	}

}
