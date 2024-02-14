package org.java.exceptionEx;

import java.io.IOException;
import java.rmi.ServerException;
import java.sql.SQLException;

public interface InterfaceEx {

// void m1() { } // 일반 멤버 X
// static 멤버 O
//	public static final String NAME = "NAME";
//	public static void staticM() {}
	
													// 구현 객체에 모두 구현 예외를 설정
	public abstract void excuteQueryMethod() throws SQLException, IOException, ServerException;

	public abstract void excuteQueryMethod2() throws Exception;

}
