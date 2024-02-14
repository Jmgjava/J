package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx5 {

	public static void main(String[] args) {

		System.out.println("LocalDateTime");
		// 날짜 조절
		// .plus~, .min~
		// LocalTime, LocalDatetime, ZonedDateTime
		// 클래스는 각각 시간, 분, 초, 나노초를 더하거나 뺼 수 있다.

		LocalDateTime nowdate = LocalDateTime.now();
		System.out.println("현재날짜: " + nowdate);

		LocalDateTime plusdate = nowdate.plusYears(5); // + 년
		System.out.println("현재날짜 + 5년: " + plusdate);

		plusdate = nowdate.minusYears(5); // -
		System.out.println("현재날짜 - 5년: " + plusdate);

		plusdate = nowdate.plusMonths(5); // + 월
		System.out.println("현재날짜 + 5월: " + plusdate);

		plusdate = nowdate.minusMonths(5); // -
		System.out.println("현재날짜 - 5월: " + plusdate);

		plusdate = nowdate.plusDays(10); // + 일
		System.out.println("현재날짜 + 10일: " + plusdate);

		plusdate = nowdate.minusDays(10); // -
		System.out.println("현재날짜 - 10일: " + plusdate);

		plusdate = nowdate.plusHours(10); // + 시간
		System.out.println("현재날짜 + 10시간: " + plusdate);

		plusdate = nowdate.minusHours(10); // -
		System.out.println("현재날짜 - 10시간: " + plusdate);

		plusdate = nowdate.plusMinutes(10); // + 분
		System.out.println("현재날짜 + 10분: " + plusdate);

		plusdate = nowdate.minusMinutes(10); // -
		System.out.println("현재날짜 - 10분: " + plusdate);

		plusdate = nowdate.plusSeconds(10); // + 초
		System.out.println("현재날짜 + 10초: " + plusdate);

		plusdate = nowdate.minusSeconds(10); // -
		System.out.println("현재날짜 - 10초: " + plusdate);

	}

}
