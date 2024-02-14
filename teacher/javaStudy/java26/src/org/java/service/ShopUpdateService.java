package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopUpdateService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("상품수정");

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

		// 2. 객체 -> Dto -> 등록, 수정
		ShopDto shop = new ShopDto(no, title, detail, writer, isFile);

		// 상품(상품번호)이 있는지 먼저 조회 select count(*) from shop0131 -> 1이면 상품 존재, 0이면 상품X
		int isShop = dao.isShop(shop.getNo());

		if (isShop != 1) {
			System.out.println("수정할 상품(상품번호)이 없어 조회 할수 없습니다.");
			return; // executeQueryService() 종료			
//			throw new IllegalArgumentException("조회할 상품번호가 없습니다"); // -> Spring boot 
		}

		int result = dao.shopUpdateDto(shop);

		if (result != 1) {
			System.out.println("상품수정 실패");
		} else {
			System.out.println("상품수정 성공");
		}

	}
}
