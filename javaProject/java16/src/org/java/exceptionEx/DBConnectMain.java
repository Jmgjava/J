package org.java.exceptionEx;

import java.sql.Connection;

import org.java.memberconnect.DBConnect;

public class DBConnectMain {

	public static void main(String[] args) {

		// DB����

		Connection conn = DBConnect.getConnection();

		if (conn == null) {
			System.out.println("DB���� ����");
		} else {
			System.out.println("DB��������");
			// CRUD
			
			
			
		}
		System.out.println(conn);

	}

}
