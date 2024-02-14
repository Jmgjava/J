package org.java.basicApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {
		// 1. 날짜생성
		Date date = new Date();
		date.getYear();// 년 -> 1900+
		date.getMonth();// 월 -> 0~
		date.getDay();// 요일 -> 일요일이0 ~ 토요일6
		// SimplDateFormat
		// 2. 날짜포맷 설정 1
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 3. 날짜포맷 <- 날짜를 적용
		String day1 = sf.format(date);// String
		System.out.println(day1);

		// DateFormat
		// 객체를 한번만 생성할 수있다. -> 싱글톤 패턴
		DateFormat df1 = DateFormat.getInstance();
		String day2 = df1.format(date);
		System.out.println(day2);

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		String day3 = df2.format(date);
		System.out.println(day3);

		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		String day4 = df3.format(date);
		System.out.println(day4);

	}
}
