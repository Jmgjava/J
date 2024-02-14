package org.java.memberconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB���� Ŭ���� -> 1����̹� ã��,2DB���� 
public class DBConnect2 {

	public static Connection getConnection() {

		Connection conn = null; // DB����

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String passward = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1.����̹� ã��
			Class.forName(driver);
			System.out.println("����̹� OK");
			// 2.DB����
			DriverManager.getConnection(url, user, passward);
			System.out.println("DB���� Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� NO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB���� Fail");
		}
		
		// DB ���� ���� -> conn = null
		return conn;
	}

}
