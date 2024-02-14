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

		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2024, 3, 20, 14, 50);
		System.out.println("기준날짜: " + start);
		System.out.println("비교날짜: " + end);

		// 싱글톤 패턴

		System.out.println("===Duration.between===");
		Duration du = Duration.between(start, end);
		System.out.println("초: " + du);

		System.out.println("===Period.between==="); // 년, 월, 일
		LocalDate st = LocalDate.of(1611, 10, 7);
		LocalDate ed = LocalDate.of(1674, 9, 22);

		Period pe = Period.between(st, ed);
		System.out.println("연월일: " + pe);

		System.out.println("년: " + pe.getYears()); // 년*365
		System.out.println("월: " + pe.getMonths()); // 월*30
		System.out.println("일: " + pe.getDays()); // 일 *1

		System.out.println("ChronoUnit.MONTHS.between");
		long mo = ChronoUnit.MONTHS.between(start, end);
		long da = ChronoUnit.DAYS.between(start, end);
		long we = ChronoUnit.WEEKS.between(start, end);
		long ho = ChronoUnit.HOURS.between(start, end);
		long mi = ChronoUnit.MINUTES.between(start, end);
		long se = ChronoUnit.SECONDS.between(start, end);
		long na = ChronoUnit.NANOS.between(start, end);
		System.out.println("Month: " + mo);
		System.out.println("Days: " + da);
		System.out.println("Week: " + we);
		System.out.println("Hours: " + ho);
		System.out.println("Minutes: " + mi);
		System.out.println("Second: " + se);
		System.out.println("Nanos: " + na);
		
		boolean be = start.isBefore(end);
		boolean eq = start.isEqual(end);
		boolean af = start.isAfter(end);
		System.out.println(be);
		System.out.println(eq);
		System.out.println(af);

	}

}
