package org.java.basicApi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void main(String[] args) {
		System.out.println("DateFormat");
		// 1.날짜 생성
		Date now = new Date();
		System.out.println(now);
		// DateFormat -> new 생성 X

		// 2.날짜 포맷
		// final로 객체 생성 -> 한번만 생성할 수 있다
		DateFormat df1 = DateFormat.getInstance(); // singleton pattern(싱글톤 패턴) -> 객체를 한번만 생성하도록 programming
		// 3.포맷 <- 날짜
		System.out.println(df1.format(now));
		// getDateInstance DateFormat.FULL
		// 2024년 1월 15일 월요일
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		// 2024년 1월 15일
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		// 24. 1. 15.
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		// 2024. 1. 15.
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		// 2024. 1. 15.

		System.out.println(df2.format(now));
														// 날짜 				// 시간 			// 지역
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df3.format(now));
	}

}
