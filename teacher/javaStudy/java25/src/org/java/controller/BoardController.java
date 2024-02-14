package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.BoardDeleteService;
import org.java.service.BoardInsertService;
import org.java.service.BoardIsCheckedService;
import org.java.service.BoardSelectOneService;
import org.java.service.BoardSelectService;
import org.java.service.BoardSeriver;
import org.java.service.BoardUpdateService;
import org.java.service.MemberDeleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectOneService;
import org.java.service.MemberSelectService;
import org.java.service.MemberUpdateService;

public class BoardController {

	public static void main(String[] args) throws IOException, SQLException {
		
		System.out.println("Controller -> Board");
		
		BoardSeriver service=null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("binsert")) {
				service = new BoardInsertService();
				service.executeQueryService();
			} else if (query.equals("bselect")) {
				service = new BoardSelectService();
				service.executeQueryService();
			} else if (query.equals("bselectOne")) {
				service = new BoardSelectOneService();
				service.executeQueryService();
			}else if (query.equals("bupdate")) {
				service = new BoardUpdateService();
				service.executeQueryService();
			} else if (query.equals("bdelete")) {
				service = new BoardDeleteService();
				service.executeQueryService();
			}else if (query.equals("isChecked")) {
				service = new BoardIsCheckedService();
				service.executeQueryService();
			} else if (query.equals("exit")) {
				System.out.println("서비스종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 Fail! -> 다시");
			}

		}
		
		
	}
}
