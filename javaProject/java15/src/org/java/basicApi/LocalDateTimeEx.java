package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		// 날짜, 시간

		// 현재시간
		LocalDateTime local1 = LocalDateTime.now();
		System.out.println("LocalDateTime.now() -> " + local1);

		System.out.println(local1.getDayOfYear());
		System.out.println(local1.getYear());
		System.out.println(local1.getMonth());
		System.out.println(local1.getDayOfMonth());
		System.out.println(local1.getDayOfWeek());
		System.out.println(local1.getHour());
		System.out.println(local1.getMinute());
		System.out.println(local1.getSecond());
		System.out.println(local1.getNano());
	}

}
