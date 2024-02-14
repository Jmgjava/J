package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public abstract interface MemberImpl {

	public abstract void excuteQueryService() throws SQLException, IOException;

}
