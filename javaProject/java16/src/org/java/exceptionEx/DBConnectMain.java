package org.java.exceptionEx;

import java.sql.Connection;

import org.java.memberconnect.DBConnect;

public class DBConnectMain {

	public static void main(String[] args) {

		// DB연동

		Connection conn = DBConnect.getConnection();

		if (conn == null) {
			System.out.println("DB연동 실패");
		} else {
			System.out.println("DB연동성공");
			// CRUD
			
			
			
		}
		System.out.println(conn);

	}

}
