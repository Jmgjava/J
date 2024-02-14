package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopUpdate implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("상품 수정");

		Scanner input = new Scanner(System.in);
		System.out.println("수정할 no 입력: ");
		int no = input.nextInt();
		System.out.println("title 입력: ");
		String title = input.next();
		System.out.println("detail 입력: ");
		String detail = input.next();
		System.out.println("writer 입력: ");
		String writer = input.next();
		System.out.println("isFile 입력: ");
		int isFile = input.nextInt();

		ShopDao dao = ShopDao.getInstance();

		// 1. 매개인자 여러개
//		int result = dao.sUpdate(no, title, detail, writer, isFile);

		// 2. 객체 DTO
		ShopDto board = new ShopDto(no, title, detail, writer, isFile);

		// === 유무 확인 === //
		// 상품(상품번호)이 잇는지 먼저 조회 select count(*) from shop0131
		// -> 1이면 상품 존재 0 이면 상품 없음
		int isShop = dao.sExist(board.getNo());

		if (isShop != 1) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
			return; // executeQueryService() 종료
		}
		// === 유무 확인 === //

		int result = dao.sUpdate(board);

		if (result != 1) {
			System.out.println("상품 수정 실패");
		} else {
			System.out.println("상품 수정 성공!");
		}
	}

}
