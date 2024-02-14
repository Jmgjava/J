package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements MemberService{

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("È¸¿ø»èÁ¦");
		
		
		// ½Ì±ÛÅæ
		MemberDao dao = MemberDao.getInstance();

//		MemberDao dao=new MemberDao();
		
		Scanner input = new Scanner(System.in);
		System.out.println("¾ÆÀÌµð: ");
		String userId = input.next();
		
		int result= dao.delete(userId);
		

		if (result != 1) {
			System.out.println("È¸¿øÅ»Åð Fail!");
		} else {
			System.out.println("È¸¿øÅ»Åð Success!");
		}
		
	}
}
