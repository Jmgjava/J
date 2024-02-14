package org.java.basicApi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		// 날짜만 생성
		// 싱글톤 패턴 -> 한번만 객체를 생성하는 방식
		LocalDate date1 = LocalDate.now(); // 오늘 날짜 // 자동
		System.out.println(date1);
		System.out.println("=====================================");
		// 직관적
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth()); // January 월
		System.out.println(date1.getMonthValue()); // 1 월
		System.out.println(date1.getDayOfYear()); // "16"일 / 365 일
		System.out.println(date1.getDayOfMonth()); // 1월 "16" 일
		System.out.println(date1.getDayOfWeek()); // 요일
		System.out.println(date1.isLeapYear()); // 윤년
		
		System.out.println("=====================================");
		
		// 직접 추가 // 수동
		LocalDate date2 = LocalDate.of(2024, 2, 6);
		System.out.println(date2.getYear());
		System.out.println(date2.getMonth()); // January 월
		System.out.println(date2.getMonthValue()); // 1 월
		System.out.println(date2.getDayOfYear()); // "16"일 / 365 일
		System.out.println(date2.getDayOfMonth()); // 1월 "16" 일
		System.out.println(date2.getDayOfWeek()); // 요일
		System.out.println(date2.isLeapYear()); // 윤년

	}

}
