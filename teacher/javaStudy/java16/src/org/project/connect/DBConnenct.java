package org.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnenct {

	public static Connection getConnection() {
		// 데이터베이스 접속 -> 서비스( CURD)
		// DB연동 클래스
		Connection conn = null;// null ->Object의 기본 값
								// @호스트:포트:DB명
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 데이터베이스 URL(xe 무료)
		String user = "system";// 사용자 계정(아이디)
		String password = "1234";// 사용자 비빌번호
		String driver = "oracle.jdbc.driver.OracleDriver";// driver
		// DB연동 순서
		try {
			// 1. 드라이버 찾기
			Class.forName(driver);
			System.out.println("드라이버OK");
			// 2. DB연동 -> DB연동 실패 -> null
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success!!");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 Fail!!");
			e.printStackTrace();
		}

		return conn;
	}
}
