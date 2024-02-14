package org.web.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String url="jdbc:mysql://localhost:3306/testdb";
		String userId="root";
		String userPw="1234";
		String driver="com.mysql.cj.jdbc.Driver";

//		// 오라클
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String userId = "system";
//		String userPw = "1234";
//		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			Class.forName(driver);
			System.out.println("드라이버OK");

			conn = DriverManager.getConnection(url, userId, userPw);
			System.out.println("DB연동 O");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 X");
			e.printStackTrace();
		}

		return conn;
	}

}
