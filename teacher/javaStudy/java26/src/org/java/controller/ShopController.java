package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.service.ShopDeleteService;
import org.java.service.ShopInsertService;
import org.java.service.ShopSelectSearchService;
import org.java.service.ShopSelectService;
import org.java.service.ShopSeriver;
import org.java.service.ShopUpdateService;

public class ShopController {

	public static void main(String[] args) throws IOException, SQLException {

		System.out.println("Controller-> shop");

		ShopSeriver service = null;

		Scanner input = new Scanner(System.in);	
		
		boolean bool = true;
		
		while (bool) {

			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("sInsert")) {
				service=new ShopInsertService();
				service.executeQueryService();				
			} else if (query.equals("sSelect")) {
				service = new ShopSelectService();
				service.executeQueryService();				
			}else if (query.equals("sSelectSearch")) {
				service = new ShopSelectSearchService();
				service.executeQueryService();				
			}  else if (query.equals("sDelete")) {
				service = new ShopDeleteService();
				service.executeQueryService();				
			} else if (query.equals("sUpdate")) {
				service = new ShopUpdateService();
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
