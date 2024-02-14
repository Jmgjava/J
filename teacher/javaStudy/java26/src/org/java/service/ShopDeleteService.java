package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;

public class ShopDeleteService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("상품삭제");

		// 상품 번호가 같은 상품을 삭제
		Scanner input = new Scanner(System.in);

		System.out.print("상품번호: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();

		// 삭제 상품 유무 확인
		int isShop = dao.isShop(no);
		if (isShop != 1) {
			System.out.println("삭제할 상품(상품번호)이 없습니다.");
			return;
		}
		// 삭제할 상품이 있으면 삭제
		int result = dao.shopDelete(no);

		if (result != 1) {
			System.out.println("상품삭제 실패");
		} else {
			System.out.println("상품삭제 성공");
		}

	}
}
