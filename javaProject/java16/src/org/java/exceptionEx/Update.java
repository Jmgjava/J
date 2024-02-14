package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public class Update implements MemberImpl {
	
	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원수정");
	}
}
