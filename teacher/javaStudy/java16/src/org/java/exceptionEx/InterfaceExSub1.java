package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

class A implements InterfaceEx{
	@Override
	public void excuteQueryMethod() throws SQLException, IOException {}
	@Override
	public void excuteQueryMethod2() throws Exception {	}
}
public class InterfaceExSub1 implements InterfaceEx {
	@Override
	public void excuteQueryMethod() throws SQLException, IOException {
		System.out.println("�������̽� ���� ���� ��� SQLException, IOException");		
	}
	@Override
	public void excuteQueryMethod2() throws Exception {
		System.out.println("�������̽� ���� ���� ��� Exception");
	}

}
