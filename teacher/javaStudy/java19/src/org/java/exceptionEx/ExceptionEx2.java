package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

interface ExInter{
	void m1() throws IOException,SQLException;
}

class ExSub1 implements ExInter{
	@Override
	public void m1() throws IOException, SQLException {
		System.out.println("ȸ������");
	}	
}
class ExSub2 implements ExInter{
	@Override
	public void m1() throws IOException, SQLException {
		System.out.println("ȸ������");
		
	}
}


public class ExceptionEx2 {

}
