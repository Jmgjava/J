package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnecton() {
		
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";// DB URL
		String user = "system";// 계정 아이디
		String password = "1234";// 계정 비빌번혼
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1.driver 찾기
			Class.forName(driver);
			System.out.println("드라이버 OK!");
			// 2.DB연동 찾기
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Ok!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Connect Fail!");
			e.printStackTrace();
		}

		return conn;
	}
}
