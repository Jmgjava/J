package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public interface InterfaceEx {
//	void m1() {	} //�Ϲ� �ɹ�X
//  static �ɹ� O
//	public static final String NAME="NAME";
//	public static void staticM() {}
											// ���� ��ü�� ��� ���� ���ܸ� ���� 
	public abstract void excuteQueryMethod() throws SQLException,IOException;
	public abstract void excuteQueryMethod2() throws Exception;

}
