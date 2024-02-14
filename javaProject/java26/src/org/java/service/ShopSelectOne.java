package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelectOne implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		// 1. 상품 번호로 검색 (no)
 		System.out.println("상품번호로 검색");

		Scanner input = new Scanner(System.in);

		System.out.println("조회할 상품 no 입력: ");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();

		ShopDto board = new ShopDto();

		// === 유무 확인 === //
		// 상품(상품번호)이 잇는지 먼저 조회 select count(*) from shop0131
		// -> 1이면 상품 존재 0 이면 상품 없음
		int isShop = dao.sExist(no);

		if (isShop != 1) {
			System.out.println("조회할 상품이 존재하지 않습니다.");
			return; // executeQueryService() 종료
		}
		// === 유무 확인 === //

		ShopDto result = dao.sSelectOne(no);

		if (result != null) {
			System.out.println("상품 번호 :" + result.getNo());
			System.out.println("상품 제목 :" + result.getTitle());
			System.out.println("상품 내용 :" + result.getDetail());
			System.out.println("상품 등록자 :" + result.getWriter());
			if (result.getIsfile() != 1) {
				System.out.print("상품 이미지 없음");
			} else {
				System.out.print("이미지 있음 " + result.getIsfile());
			}
		} else {
			System.out.println("조회할 상품이 없습니다.");
		}



	}

}
