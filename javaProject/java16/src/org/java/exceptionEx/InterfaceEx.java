package org.java.exceptionEx;

import java.io.IOException;
import java.rmi.ServerException;
import java.sql.SQLException;

public interface InterfaceEx {

// void m1() { } // �Ϲ� ��� X
// static ��� O
//	public static final String NAME = "NAME";
//	public static void staticM() {}
	
													// ���� ��ü�� ��� ���� ���ܸ� ����
	public abstract void excuteQueryMethod() throws SQLException, IOException, ServerException;

	public abstract void excuteQueryMethod2() throws Exception;

}
