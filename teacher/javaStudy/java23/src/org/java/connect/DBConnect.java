package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn=null;		
		//����Ŭ
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// DB URL
		String user = "system";// ���̵�
		String password = "1234";// �����ȣ
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			// 1. ����̹�ã��
			Class.forName(driver);
			System.out.println("����̹� OK");
			// DB����-> Ŀ�ؼ� ��ü ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB���� Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� NO");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB���� Fail!!");
			e.printStackTrace();
		}
		// conn-> null -> DB���� ����
		
		return conn;
	}

}
