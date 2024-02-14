package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx5 {

	public static void main(String[] args) {

		System.out.println("LocalDateTime");
		// ��¥ ����
		// .plus~, .min~
		// LocalTime, LocalDatetime, ZonedDateTime
		// Ŭ������ ���� �ð�, ��, ��, �����ʸ� ���ϰų� �E �� �ִ�.

		LocalDateTime nowdate = LocalDateTime.now();
		System.out.println("���糯¥: " + nowdate);

		LocalDateTime plusdate = nowdate.plusYears(5); // + ��
		System.out.println("���糯¥ + 5��: " + plusdate);

		plusdate = nowdate.minusYears(5); // -
		System.out.println("���糯¥ - 5��: " + plusdate);

		plusdate = nowdate.plusMonths(5); // + ��
		System.out.println("���糯¥ + 5��: " + plusdate);

		plusdate = nowdate.minusMonths(5); // -
		System.out.println("���糯¥ - 5��: " + plusdate);

		plusdate = nowdate.plusDays(10); // + ��
		System.out.println("���糯¥ + 10��: " + plusdate);

		plusdate = nowdate.minusDays(10); // -
		System.out.println("���糯¥ - 10��: " + plusdate);

		plusdate = nowdate.plusHours(10); // + �ð�
		System.out.println("���糯¥ + 10�ð�: " + plusdate);

		plusdate = nowdate.minusHours(10); // -
		System.out.println("���糯¥ - 10�ð�: " + plusdate);

		plusdate = nowdate.plusMinutes(10); // + ��
		System.out.println("���糯¥ + 10��: " + plusdate);

		plusdate = nowdate.minusMinutes(10); // -
		System.out.println("���糯¥ - 10��: " + plusdate);

		plusdate = nowdate.plusSeconds(10); // + ��
		System.out.println("���糯¥ + 10��: " + plusdate);

		plusdate = nowdate.minusSeconds(10); // -
		System.out.println("���糯¥ - 10��: " + plusdate);

	}

}
