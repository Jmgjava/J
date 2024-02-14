package org.java.exceptionEx;

import java.sql.Connection;

import org.java.connect.DBConnect;

public class DBConnectMain {

	public static void main(String[] args) {

		// DB연동
		Connection conn = DBConnect.getConnection();
		
		if (conn != null) {
			System.out.println("DB 연동 성공");
			// CRUD
		} else {
			System.out.println("DB 연동 실패");
		}
		System.out.println(conn);
	}
}
