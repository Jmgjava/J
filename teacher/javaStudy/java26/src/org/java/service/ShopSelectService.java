package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectService implements ShopSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("상품조회(목록)");

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> shopList = dao.shopSelectAll();

		if (shopList.isEmpty()) {
			System.out.println("조회할 상품목록이 없다");
		} else {
			System.out.println("전체 상품목록");

			System.out.println("===========foreach문===========");
			for (ShopDto shop : shopList) {
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

			System.out.println("===========forEach()===========");
			shopList.forEach(shop -> {
				System.out.print("상품번호: " + shop.getNo());
				System.out.print(", 상품명: " + shop.getTile());
				System.out.print(", 상품상세: " + shop.getDetail());
				System.out.print(", 상품등록자: " + shop.getWriter());
				if (shop.getIsFile() != 1) {
					System.out.println(",이미지(0): 상품이미지가 없습니다.");
				} else {
					System.out.println(",이미지유(1): " + shop.getIsFile());
				}
			});

		}

	}
}
