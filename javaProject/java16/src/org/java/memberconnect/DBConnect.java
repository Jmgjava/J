package org.java.memberconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 접속
public class DBConnect {

	/*
	 * > Connection 객체란? 자바에서 DB와 연결하기 위해 사용하는 객체입니다. 파라미터는 Data의 위치(URL), 기타정보(DB접속
	 * ID, 패스워드, 포트 번호)입니다. DriveManager의 getConnection()메소드를 호출하여 생성할 수 있습니다.
	 */

	// DB 접속 -> 공유(static) 메소드
	public static Connection getConnection() {

		// 데이터베이스에 접속해서 -> 서비스(CRUD)
		// DB연동 클래스,
		Connection conn = null; // null -> Object의 기본값

									// @호스트:포트:DB멤버
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 url (xe: 무료)
		String userId = "system"; // 사용자 계정
		String passward = "1234"; // 비밀번호
		String driver = "oracle.jdbc.driver.OracleDriver"; // driver

		// DB 연동 순서
		try {
			// 1.드라이버 찾기
			Class.forName(driver);
			System.out.println("드라이버 있음");
			// 2.DB연동 -> DB연동 실패 -> null
			conn = DriverManager.getConnection(url, userId, passward);
			System.out.println("DB 연동 Success");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연동 Fail");
			e.printStackTrace();
		}

		return conn;

	}
}
