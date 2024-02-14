package org.java.basicApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {

		// 1. 날짜 생성
		Date date = new Date();
		int year = date.getYear(); // 년
		int month = date.getMonth(); // 월
		int date2 = date.getDate();
		int day = date.getDay(); // 요일
		int hour = date.getHours(); // 시
		int minutes = date.getMinutes(); // 분
		int second = date.getSeconds(); // 초
		// SimpleDateFormat
		// 2. 날짜 포맷 설정 1
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/mm/dd HH:MM:SS");

		// 3. 날짜 포맷 < - 날짜를 적용
		String day1 = sdf1.format(date);
		System.out.println(day1);

		// DateFormat
		// 객체를 한번만 생성할 수 있다. -> 싱글톤 패턴
		// 1
		DateFormat df1 = DateFormat.getInstance();
		String day2 = df1.format(date);
		System.out.println(day2);
		// 2
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		String day3 = df2.format(date);
		System.out.println(day3);
		// 3
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		String day4 = df3.format(date);
		System.out.println(day4);

	}

}
