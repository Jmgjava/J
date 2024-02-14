package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

interface ExInter{
	void m1() throws IOException,SQLException;
}

class ExSub1 implements ExInter{
	@Override
	public void m1() throws IOException, SQLException {
		System.out.println("회원가입");
	}	
}
class ExSub2 implements ExInter{
	@Override
	public void m1() throws IOException, SQLException {
		System.out.println("회원수정");
		
	}
}


public class ExceptionEx2 {

}
