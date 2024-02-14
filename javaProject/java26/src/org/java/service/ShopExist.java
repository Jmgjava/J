package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopExist implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("상품 유무 확인");


		Scanner input = new Scanner(System.in);

		System.out.println("조회할 상품 no 입력: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();
		int result = dao.sExist(no);

		if (result != 1) {
			System.out.println("상품이 없습니다.");
		} else {
			System.out.println("상품이 있습니다.");
		}

	}

}
