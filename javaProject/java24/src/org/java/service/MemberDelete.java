package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDelete implements MemberService {

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("È¸¿ø»èÁ¦");

		MemberDao dao = MemberDao.getInstance();

		Scanner input = new Scanner(System.in);
		System.out.println("ID: ");
		String userId = input.next();

		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("È¸¿øÅ»Åð ½ÇÆÐ");
		} else {
			System.out.println("È¸¿øÅ»Åð ¼º°ø");
		}

	}

}
