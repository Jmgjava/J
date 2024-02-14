package org.java.conditionEx;

import java.util.Scanner;

public class Quiz_Switch {

	public static void main(String[] args) {
		System.out.println("Switch -> 검색");
		
		// 검색 종류(subject)가 있으면 !=null (null이 아니면) , !="" (공란이 아니면)
		String subject = null; // 검색 종류
		
		System.out.println("검색 종류 입력: ");
		Scanner scn = new Scanner(System.in);
		subject=scn.next();
		
		// 검색어 -> itemName(상품명), itemDetail(상품상세내용), writer(등록자)
		String itemName = "상품1";
		String itemDetail = "상품1내용";
		String writer = "상품1등록자";

		if (subject != null) {

			switch (subject) {
			case "상품명":
				System.out.println("검색 상품: " + itemName);
				break;
			case "상품상세":
				System.out.println("상품 내용: " + itemDetail);
				break;
			case "상품등록자":
				System.out.println("상품등록자: " + writer);
			}

		} else {
			System.out.println("검색 종류가 없다");
		}
	}
}
