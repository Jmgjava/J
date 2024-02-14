package org.java.basicApi;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date date = new Date();// KST, Korea Standard Time
		System.out.println(date);
		System.out.println(date.getYear() + 1900);// 년 1900+124 -> 2024
		System.out.println(date.getMonth() + 1); // 월(0부터~) *** 월+1
		System.out.println(date.getDate());// 일
		System.out.println(date.getHours());// 시
		System.out.println(date.getMinutes());// 분
		System.out.println(date.getSeconds());// 분
		System.out.println(date.getDay()); // 요일 -> 일요일 0

		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		int hour = date.getHours();
		int minutes = date.getMinutes();
		int second = date.getSeconds();
		
		int key = date.getDay();
		
//		System.out.println(key);
		
		String week = "";

		switch (key) {
		
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

		// 현재시간: 년 월 일 시 분 초 요일(switch) 콘솔에 출력
		System.out.println(year + "년 " + month + "월 " + 
							day + "일 " + hour + "시 " + minutes + "분 " 
							+ second + "초 " + week);

	}
}
