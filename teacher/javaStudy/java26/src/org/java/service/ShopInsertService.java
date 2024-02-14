package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopInsertService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("상품등록");

		Scanner input = new Scanner(System.in);

		System.out.print("상품번호: ");
		int no = input.nextInt();

		System.out.print("상품명: ");
		String title = input.next();

		System.out.print("상품상세내역: ");
		String detail = input.next();

		System.out.print("상품등록자: ");
		String writer = input.next();

		System.out.print("상품이미지 추가(1,0): ");
		int isFile = input.nextInt();

		// 싱글톤
		ShopDao dao = ShopDao.getInstance();

		// 1. 매개인자 여러
//		int result = dao.shopInsert(no, title, detail, writer, isFile);

		// 2. 객체 -> Dto -> 등록, 수정
		ShopDto shop = new ShopDto(no, title, detail, writer, isFile);

		int isShop = dao.isShop(shop.getNo());

		if (isShop != 0) {
			System.out.println("이미 같은 상품(상품번호)가 등록 되어 있습니다.");
			return;
		}

//		int result2 = dao.shopInsertDto(new ShopDto(no, title, detail, writer, isFile));
		int result2 = dao.shopInsertDto(shop);

		if (result2 != 1) {
			System.out.println("상품등록 실패");
		} else {
			System.out.println("상품등록 성공");
		}

	}
}
