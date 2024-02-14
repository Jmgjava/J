package org.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@lacalhost:1521:xe"; // DB url
		String userId = "system";
		String userPw = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

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


		return conn;

	}

}
