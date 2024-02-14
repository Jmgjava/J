package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopWriter implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		// 2. 등록자로 검색 (writer)
		System.out.println("등록자 입력: ");
		Scanner input = new Scanner(System.in);
		String writer = input.next();

		ShopDao dao = ShopDao.getInstance();

		List<ShopDto> writerList = dao.sSelectWriter(writer);

		// 등록자가 있는지 체크

		if (writerList.isEmpty()) {
			System.out.println("조회할 내용이 없습니다.");
		} else {
			System.out.println("상품목록");
			for (ShopDto writers : writerList) {
				System.out.print("상품번호: " + writers.getNo() + " ");
				System.out.print("상품제목: " + writers.getTitle() + " ");
				System.out.print("상품내용: " + writers.getDetail() + " ");
				System.out.print("상품등록자: " + writers.getWriter() + " ");
				if (writers.getIsfile() != 1) {
					System.out.print("상품 이미지 없음");
				} else {
					System.out.print("이미지 있음 " + writers.getIsfile());
				}
				System.out.println();
			}
		}

	}

}
