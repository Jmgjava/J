package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB관련 일을 처리 할 때 기본적으로 연동 되는 클래스
public class DBConnect {

	// 공유 -> Connection DB연동 객체
	public static Connection getConnection() {

		Connection conn = null;// 커넥션 객체 기본 null

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
