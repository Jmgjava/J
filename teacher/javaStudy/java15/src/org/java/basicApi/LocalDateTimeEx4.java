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

		// ��¥�� ���� �� �ִ�.
		LocalDateTime startDateTime = LocalDateTime.now();// ����
		LocalDateTime endDateTime = LocalDateTime.of(2024, 4, 1, 23, 59, 59);
		System.out.println("���س�¥: " + startDateTime);
		System.out.println("�񱳳�¥: " + endDateTime);
		
		System.out.println("===========Duration");// �̱���
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("��: " + duration.getSeconds());
		System.out.println("������: " + duration.getNano()); // �Ϸ� -> 24*60*60
		
		System.out.println("===========Period");// ��,��,��
		LocalDate startDate = LocalDate.of(1752, 10, 28);
		LocalDate endDate = LocalDate.of(1800, 8, 18);
		Period period = Period.between(startDate, endDate);
		System.out.println("Years: " + period.getYears()); // ��*365
		System.out.println("Months: " + period.getMonths());// ��*30
		System.out.println("Days: " + period.getDays()); // ��*1
		
		System.out.println("===========ChronoUnit"); // ��ü ���� ���� ��밡��
		long months = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		long weeks = ChronoUnit.WEEKS.between(startDateTime, endDateTime);
		long days = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		long hours = ChronoUnit.HOURS.between(startDateTime, endDateTime); // �˹ٺ���
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
