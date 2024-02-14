package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ShopDao;
import org.java.dto.ShopDto;

public class ShopSelect implements ShopService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("상품 조회");

		ShopDao dao = ShopDao.getInstance();
		List<ShopDto> members = dao.sSelect();

		System.out.println("======for-each문=====");
		if (members.isEmpty()) {
			System.out.println("조회할 상품이 없습니다.");
		} else {
			System.out.println("전체 상품목록");
			for (ShopDto member : members) {
				System.out.print("상품번호: " + member.getNo() + " ");
				System.out.print("상품제목: " + member.getTitle() + " ");
				System.out.print("상품내용: " + member.getDetail() + " ");
				System.out.print("상품등록자: " + member.getWriter() + " ");
				if (member.getIsfile() != 1) {
					System.out.print("상품 이미지 없음");
				} else {
					System.out.print("이미지 있음 " + member.getIsfile());
				}
				System.out.println();
			}

			System.out.println("=====forEach문=====");
			members.forEach(member -> {
				System.out.print("상품번호: " + member.getNo() + " ");
				System.out.print("상품제목: " + member.getTitle() + " ");
				System.out.print("상품내용: " + member.getDetail() + " ");
				System.out.print("상품등록자: " + member.getWriter() + " ");
				if (member.getIsfile() != 1) {
					System.out.print("상품 이미지 없음");
				} else {
					System.out.print("이미지 있음 " + member.getIsfile());
				}
				System.out.println();
			});
			
		}
	}

}
