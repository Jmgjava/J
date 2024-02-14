package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx1 {

	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");
		// 날짜, 시간		
		LocalDateTime now2= LocalDateTime.now();
		System.out.println("LocalDateTime.now()->  "+now2);
		
		//현재시간
		LocalDateTime now= LocalDateTime.now();
		System.out.println("LocalDateTime.now()->  "+now);
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		
		
		
		
	}
}
