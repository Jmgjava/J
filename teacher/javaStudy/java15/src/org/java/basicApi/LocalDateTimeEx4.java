package org.java.basicApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx4 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");

		// 날짜를 비교할 수 있다.
		LocalDateTime startDateTime = LocalDateTime.now();// 오늘
		LocalDateTime endDateTime = LocalDateTime.of(2024, 4, 1, 23, 59, 59);
		System.out.println("기준날짜: " + startDateTime);
		System.out.println("비교날짜: " + endDateTime);
		
		System.out.println("===========Duration");// 싱글톤
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("초: " + duration.getSeconds());
		System.out.println("나노초: " + duration.getNano()); // 하루 -> 24*60*60
		
		System.out.println("===========Period");// 년,월,일
		LocalDate startDate = LocalDate.of(1752, 10, 28);
		LocalDate endDate = LocalDate.of(1800, 8, 18);
		Period period = Period.between(startDate, endDate);
		System.out.println("Years: " + period.getYears()); // 년*365
		System.out.println("Months: " + period.getMonths());// 월*30
		System.out.println("Days: " + period.getDays()); // 일*1
		
		System.out.println("===========ChronoUnit"); // 객체 생성 없이 사용가능
		long months = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		long weeks = ChronoUnit.WEEKS.between(startDateTime, endDateTime);
		long days = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		long hours = ChronoUnit.HOURS.between(startDateTime, endDateTime); // 알바비계산
		long minutes = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		long seconds = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		System.out.println("Months: " + months);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}
}
