package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn=null;		
		//오라클
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// DB URL
		String user = "system";// 아이디
		String password = "1234";// 비빌번호
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1. 드라이버찾기
			Class.forName(driver);
			System.out.println("드라이버 OK");
			// DB연동-> 커넥션 객체 설정
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 Fail!!");
			e.printStackTrace();
		}
		// conn-> null -> DB연동 실패
		
		return conn;
	}

}
