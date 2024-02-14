package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.BoardDao;

public class BoardIsCheckedService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		
		System.out.println("게시글 유무 체크");		
		
		Scanner input = new Scanner(System.in);

		System.out.println("조회할 게시글 변호 ");
		int no = input.nextInt();

		BoardDao dao = BoardDao.getInstance();

		int result= dao.isBoard(no);
		
		if(result!=1) {
			System.out.println("게시글이 존재 하지않습니다.");
		}else {
			System.out.println("게시글이 존재합니다.");
			//수정, 삭제, 조회(하나)
			
		}
		
	}

}
