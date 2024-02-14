package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx3 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2024, 1, 16, 11, 30);
		System.out.println("���س�¥: " + start);
		System.out.println("�񱳳�¥: " + end);

		boolean bool1 = start.isBefore(end);
		System.out.println(bool1);
		boolean bool2 = start.isEqual(end);
		System.out.println(bool2);
		boolean bool3 = start.isAfter(end);
		System.out.println(bool3);

		if (start.isAfter(end)) {
			System.out.println("���ó��� �����Դϴ�.");
		} else {
			System.out.println("���ó��� ���İ� �ƴմϴ�.");
		}

		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc); // ������ ��������� (���� ����)

		ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul")); // AWS -> ����(Asia/Seoul)
		System.out.println(seoul); // ����
	}

}
