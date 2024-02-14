package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopDelete implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("상품 삭제");

		Scanner input = new Scanner(System.in);
		System.out.println("삭제할 no 입력");
		int no = input.nextInt();

		ShopDao dao = ShopDao.getInstance();
		
		// === 유무 확인 === //
		// 상품(상품번호)이 잇는지 먼저 조회 select count(*) from shop0131
		// -> 1이면 상품 존재 0 이면 상품 없음
		int isShop = dao.sExist(no);

		if (isShop != 1) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
			return; // executeQueryService() 종료
		}
		// === 유무 확인 === //

		int result = dao.sDelete(no);

		if (result != 1) {
			System.out.println("상품 삭제 실패");
		} else {
			System.out.println("상품 삭제 성공!");
		}

	}

}
