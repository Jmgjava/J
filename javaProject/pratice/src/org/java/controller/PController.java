package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.PDelete;
import org.java.service.PInsert;
import org.java.service.PSelect;
import org.java.service.PService;
import org.java.service.PUpdate;

public class PController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("컨트롤러");

		PService service = null;
		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문 입력");
			String query = input.next();

			if (query.equals("insert")) {
				service = new PInsert();
				service.executeQueryService();
			} else if (query.equals("select")) {
				service = new PSelect();
				service.executeQueryService();
			} else if (query.equals("update")) {
				service = new PUpdate();
				service.executeQueryService();
			} else if (query.equals("delete")) {
				service = new PDelete();
				service.executeQueryService();
			}
		}

	}

}
