package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public class Insert implements MemberImpl {
	
	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원가입");
	}

}
