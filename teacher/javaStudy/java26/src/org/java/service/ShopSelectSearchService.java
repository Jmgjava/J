package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectSearchService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("상품 검색");

		// 1. 상품번호 -> 상품 검색
//		System.out.print("상품검색번호: ");
//
//		Scanner input = new Scanner(System.in);
//		int no = input.nextInt();
//
//		ShopDao dao = ShopDao.getInstance();
//
//		int isShop = dao.isShop(no);
//
//		if (isShop != 1) {
//			System.out.println("조회할 상품(상품번호)가 없다.");
//			return;
//		}
//		// 번호에 해당 하는 상품을 조회 -> get
//		ShopDto shop = dao.searchNo(no);
//
//		if (shop != null) {
//			System.out.print("상품번호: " + shop.getNo());
//			System.out.print(", 상품명: " + shop.getTile());
//			System.out.print(", 상품상세: " + shop.getDetail());
//			System.out.print(", 상품등록자: " + shop.getWriter());
//			if (shop.getIsFile() != 1) {
//				System.out.println(",이미지(0): 상품이미지가 없습니다.");
//			} else {
//				System.out.println(",이미지유(1): " + shop.getIsFile());
//			}
//		} else {
//			System.out.println("조회할 상품(상품번호)가 없다.");
//		}

		// 2.상품등록자를 검색 -> 상품등록자가 등록한 상품목록를 조회(검색)

		System.out.print("상품등록자 입력: ");

		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.searchWriter(writer);

		// 등록자가 있는지 체크 		
		
		if (writerList.isEmpty()) {
			System.out.println("조회 목록이 없습니다.");
		} else {
			System.out.println("상품목록");
			for (ShopDto shop : writerList) {
				System.out.print("상품번호: " + shop.getNo());
				System.out.print(", 상품명: " + shop.getTile());
				System.out.print(", 상품상세: " + shop.getDetail());
				System.out.print(", 상품등록자: " + shop.getWriter());
				if (shop.getIsFile() != 1) {
					System.out.println(",이미지(0): 상품이미지가 없습니다.");
				} else {
					System.out.println(",이미지유(1): " + shop.getIsFile());
				}
			}

		}

	}

}
