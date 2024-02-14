package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB연동 클래스 -> 1드라이버찾기,2DB연동
public class DBConnect2 {

	public static Connection getConnection() {

		Connection conn = null;// DB연동

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1.드라이버찾기
			Class.forName(driver);
			System.out.println("드라이버OK");
			// 2.DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 Fail!!");
			e.printStackTrace();
		}

		// DB연동 실패 -> conn=null;
		return conn;

	}
}
