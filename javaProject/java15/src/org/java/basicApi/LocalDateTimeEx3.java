package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx3 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2024, 1, 16, 11, 30);
		System.out.println("기준날짜: " + start);
		System.out.println("비교날짜: " + end);

		boolean bool1 = start.isBefore(end);
		System.out.println(bool1);
		boolean bool2 = start.isEqual(end);
		System.out.println(bool2);
		boolean bool3 = start.isAfter(end);
		System.out.println(bool3);

		if (start.isAfter(end)) {
			System.out.println("선택날자 이후입니다.");
		} else {
			System.out.println("선택날자 이후가 아닙니다.");
		}

		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc); // 전세계 협정세계시 (영국 런던)

		ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul")); // AWS -> 리전(Asia/Seoul)
		System.out.println(seoul); // 서울
	}

}
