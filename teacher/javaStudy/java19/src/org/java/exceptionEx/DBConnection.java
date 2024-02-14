package org.java.exceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {

		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Diver Ok");

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Success!!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Diver No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Faill!!");
		}
		
//		finally {
//			if(conn!=null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
		

	}
}
