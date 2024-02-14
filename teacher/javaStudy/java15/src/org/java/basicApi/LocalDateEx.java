package org.java.basicApi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		// 날짜만
		// 싱글톤 패턴 -> 한번만 객체를 생성 하는 방식
		LocalDate date1 = LocalDate.now();// 오늘날짜 // 자동		
		System.out.println("LocalDate.now() -> "+date1);
		// 직관적
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());// 1
		System.out.println(date1.getMonth());// JANUARY
		System.out.println(date1.getDayOfYear());// 16/365 2월1일 -> 32
		System.out.println(date1.getDayOfMonth());// 1월 16일 2월1일 -> 1
		System.out.println(date1.getDayOfWeek());// TUESDAY
		System.out.println(date1.isLeapYear()); // 윤년?
		// 직접 추가
		LocalDate date2= LocalDate.of(2024, 2, 1);
		System.out.println("LocalDate.of(2024, 2, 1)-> "+date2);
		System.out.println(date2.getYear());
		System.out.println(date2.getMonthValue());// 1
		System.out.println(date2.getMonth());// JANUARY
		System.out.println(date2.getDayOfYear());// 16/365 2월1일 -> 32
		System.out.println(date2.getDayOfMonth());// 1월 16일 2월1일 -> 1
		System.out.println(date2.getDayOfWeek());// TUESDAY
		System.out.println(date2.isLeapYear()); // 윤년?
		
		
		
		
		
		
		
		
		
		
		

	}
}
