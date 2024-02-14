package org.java.memberconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB연동 클래스 -> 1드라이버 찾기,2DB연동 
public class DBConnect2 {

	public static Connection getConnection() {

		Connection conn = null; // DB연동

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String passward = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1.드라이버 찾기
			Class.forName(driver);
			System.out.println("드라이버 OK");
			// 2.DB연동
			DriverManager.getConnection(url, user, passward);
			System.out.println("DB연동 Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 NO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연동 Fail");
		}
		
		// DB 연동 실패 -> conn = null
		return conn;
	}

}
