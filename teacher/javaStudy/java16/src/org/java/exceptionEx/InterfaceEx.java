package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public interface InterfaceEx {
//	void m1() {	} //일반 맴버X
//  static 맴버 O
//	public static final String NAME="NAME";
//	public static void staticM() {}
											// 구현 객체에 모두 구현 예외를 설정 
	public abstract void excuteQueryMethod() throws SQLException,IOException;
	public abstract void excuteQueryMethod2() throws Exception;

}
