package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.BoardDelete;
import org.java.service.BoardInsert;
import org.java.service.BoardSelect;
import org.java.service.BoardSelectOne;
import org.java.service.BoardService;
import org.java.service.BoardUpdate;
import org.java.service.Boardcheck;

public class BoardController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("Controller -> Board");

		BoardService service = null;
		boolean bool = true;
		Scanner input = new Scanner(System.in);

		while (bool) {
			System.out.println("쿼리문 입력: \nbinsert,bselect,bselectone,bupdate,bdelete,bcheck,exit");
			String query = input.next();

			if (query.equals("binsert")) {
				service = new BoardInsert();
				service.executeQueryService();
			} else if (query.equals("bselect")) {
				service = new BoardSelect();
				service.executeQueryService();
			} else if (query.equals("bselectone")) {
				service = new BoardSelectOne();
				service.executeQueryService();
			} else if (query.equals("bupdate")) {
				service = new BoardUpdate();
				service.executeQueryService();
			} else if (query.equals("bdelete")) {
				service = new BoardDelete();
				service.executeQueryService();
			} else if (query.equals("bcheck")) {
				service = new Boardcheck();
				service.executeQueryService();
			} else if (query.equals("bexit")) {
				System.out.println("프로그램 종료");
				bool = false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}

	}

}
