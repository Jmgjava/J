package org.java.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB 경로(URL)
		String userId = "system"; // 계정 id
		String userPw = "1234"; // 비밀번호
		String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클 드라이버 경로

		try {
			// 1.드라이버 연동
			Class.forName(driver);
			System.out.println("드라이버 OK");

			// 2.DB연동
			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB연동성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 실패");
			e.printStackTrace();
		}

		return conn;
	};

}
