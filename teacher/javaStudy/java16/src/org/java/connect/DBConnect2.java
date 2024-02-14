package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB���� Ŭ���� -> 1����̹�ã��,2DB����
public class DBConnect2 {

	public static Connection getConnection() {

		Connection conn = null;// DB����

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1.����̹�ã��
			Class.forName(driver);
			System.out.println("����̹�OK");
			// 2.DB����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB���� Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹�NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� Fail!!");
			e.printStackTrace();
		}

		// DB���� ���� -> conn=null;
		return conn;

	}
}
