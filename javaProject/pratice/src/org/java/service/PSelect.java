package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.PDao;
import org.java.dto.PDto;

public class PSelect implements PService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("회원 조회");

		PDao dao = PDao.getInstance();

		List<PDto> result = dao.pSelect();

		if (result.isEmpty()) {
			System.out.println("조회할 회원이 없습니다.");
		} else {
			result.forEach(members -> {
				System.out.print("No: " + members.getNo() + " ");
				System.out.print("ID: " + members.getUserId() + " ");
				System.out.print("Pw: " + members.getUserPw() + " ");
				System.out.print("Age: " + members.getAge() + " ");
				System.out.print("Name: " + members.getName() + " ");
				System.out.println();
			});
		}
	}

}
