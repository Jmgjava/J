package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx2 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");

		// 현재시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfMonth());

		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();

		// 직접 입력
		LocalDateTime datetime2 = LocalDateTime.of(2024, 1, 18, 14, 30, 25, 33);
		System.out.println(datetime2);

		System.out.println(datetime2.getYear());
		System.out.println(datetime2.getMonth());
		System.out.println(datetime2.getMonthValue());
		System.out.println(datetime2.getDayOfYear());
		System.out.println(datetime2.getDayOfMonth());

		System.out.println(datetime2.getHour());
		System.out.println(datetime2.getMinute());
		System.out.println(datetime2.getSecond());
		System.out.println(datetime2.getNano());
		System.out.println();

	}

}
