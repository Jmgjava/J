package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx5 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		// ��¥����
		// .plus~ , .min~
		// LocalTime, LocalDateTime, ZonedDateTime
		// Ŭ������ ���� �ð�, ��, ��, �����ʸ� ���ϰų� �� �� �ִ�.
				
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("���糯¥�ð� : " + curDateTime);
		
		LocalDateTime tarDateTime = curDateTime.plusYears(5); //�� ���ϱ�		
		System.out.println(tarDateTime);

		tarDateTime=curDateTime.minusYears(5);//�� ����
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.plusMonths(5); // �� ���ϱ�
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusMonths(5); // �� ����
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusDays(7);// �� ���ϱ�
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.minusDays(11);// �� ����
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusWeeks(1);// �� ���ϱ�
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.minusWeeks(11);// �� ����
		System.out.println(tarDateTime);

	}
}
