package org.java.basicApi;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		System.out.println("LocalTime");
		// 시간만

		LocalTime time1 = LocalTime.now();// 자동 현재 시간
		System.out.println("LocalTime.now() -> " + time1);

		System.out.println(time1.getHour());
		System.out.println(time1.getMinute());
		System.out.println(time1.getSecond());
		System.out.println(time1.getNano());// 1/10억 초

		LocalTime time2 = LocalTime.of(14, 20, 30);
		System.out.println("LocalTime.of(14, 20, 30) -> "+time2);		

		System.out.println(time2.getHour());
		System.out.println(time2.getMinute());
		System.out.println(time2.getSecond());
		System.out.println(time2.getNano());// 1/10억 초


	}
}
