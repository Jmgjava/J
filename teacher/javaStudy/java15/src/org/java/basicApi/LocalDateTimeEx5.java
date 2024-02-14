package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx5 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		// 날짜조절
		// .plus~ , .min~
		// LocalTime, LocalDateTime, ZonedDateTime
		// 클래스는 각각 시간, 분, 초, 나노초를 더하거나 뺄 수 있다.
				
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("현재날짜시간 : " + curDateTime);
		
		LocalDateTime tarDateTime = curDateTime.plusYears(5); //년 더하기		
		System.out.println(tarDateTime);

		tarDateTime=curDateTime.minusYears(5);//년 빼기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.plusMonths(5); // 월 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusMonths(5); // 월 빼기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusDays(7);// 일 더하기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.minusDays(11);// 일 빼기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusWeeks(1);// 주 더하기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.minusWeeks(11);// 주 빼기
		System.out.println(tarDateTime);

	}
}
