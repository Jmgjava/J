package org.java.exceptionEx;

import java.io.IOException;
import java.rmi.ServerException;
import java.sql.SQLException;

class A implements InterfaceEx {
	@Override
	public void excuteQueryMethod() throws SQLException, IOException, ServerException {}
	@Override
	public void excuteQueryMethod2() throws Exception {}
}

public class InterfaceExSub1 implements InterfaceEx {

	@Override
	public void excuteQueryMethod() throws SQLException, IOException, ServerException {
		System.out.println("�������̽� ���� �޼ҵ� ����");
	}

	@Override
	public void excuteQueryMethod2() throws Exception {
		System.out.println("�������̽� ���� �޼ҵ�2 ����");
	}

}
