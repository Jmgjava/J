package org.java.basicApi;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getYear()); // 1900+124 -> 2024
		System.out.println(dt.getMonth() + 1); // 월(0부터~) *** 월+1
		System.out.println(dt.getDate()); // 일
		System.out.println(dt.getHours()); // 시
		System.out.println(dt.getMinutes()); // 분
		System.out.println(dt.getSeconds()); // 초
		System.out.println(dt.getDay()); // 요일 -> 일요일 0

		// 현재시간 : 년 월 일 시 분 초 요일(swich)콘솔에 출력

		String week = "";

		int ye = ((dt.getYear() + 1900));
		int mo = ((dt.getMonth() + 1));
		int da = (dt.getDate());
		int ho = (dt.getHours());
		int mi = (dt.getMinutes());
		int se = (dt.getSeconds());

		int d = dt.getDay();

		switch (d) {
		case 0:
			week = "일요일";
			break;
		case 1:
			week = "월요일";
			break;
		case 2:
			week = "화요일";
			break;
		case 3:
			week = "수요일";
			break;
		case 4:
			week = "목요일";
			break;
		case 5:
			week = "금요일";
			break;
		case 6:
			week = "토요일";
			break;
		default:
			System.out.println("입력오류");
		}
		System.out.println(ye + "년 " + mo + "월 " + da + "일 " + ho + "시 " + mi + "분 " + se + "초 " + week);

	}

}
