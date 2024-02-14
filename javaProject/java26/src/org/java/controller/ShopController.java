package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.ShopSelectOne;
import org.java.service.ShopDelete;
import org.java.service.ShopExist;
import org.java.service.ShopInsert;
import org.java.service.ShopSelect;
import org.java.service.ShopService;
import org.java.service.ShopUpdate;
import org.java.service.ShopWriter;

public class ShopController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("��Ʈ�ѷ�");

		ShopService service = null;
		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("insert,exist,select,selectone \n,writer,update,delete,exit");
			System.out.println("�߿� ������ �ϳ� �Է�");
			String query = input.next();
			if (query.equals("insert")) {
				service = new ShopInsert();
				service.executeQueryService();
			} else if (query.equals("exist")) {
				service = new ShopExist();
				service.executeQueryService();
			} else if (query.equals("select")) {
				service = new ShopSelect();
				service.executeQueryService();
			} else if (query.equals("selectone")) {
				service = new ShopSelectOne();
				service.executeQueryService();
			} else if (query.equals("writer")) {
				service = new ShopWriter();
				service.executeQueryService();
			} else if (query.equals("update")) {
				service = new ShopUpdate();
				service.executeQueryService();
			} else if (query.equals("delete")) {
				service = new ShopDelete();
				service.executeQueryService();
			} else if (query.equals("exit")) {
				System.out.println("����");
				bool = false;
			}

		}

	}

}
