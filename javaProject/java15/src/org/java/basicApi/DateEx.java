package org.java.basicApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {

		// 1. ��¥ ����
		Date date = new Date();
		int year = date.getYear(); // ��
		int month = date.getMonth(); // ��
		int date2 = date.getDate();
		int day = date.getDay(); // ����
		int hour = date.getHours(); // ��
		int minutes = date.getMinutes(); // ��
		int second = date.getSeconds(); // ��
		// SimpleDateFormat
		// 2. ��¥ ���� ���� 1
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/mm/dd HH:MM:SS");

		// 3. ��¥ ���� < - ��¥�� ����
		String day1 = sdf1.format(date);
		System.out.println(day1);

		// DateFormat
		// ��ü�� �ѹ��� ������ �� �ִ�. -> �̱��� ����
		// 1
		DateFormat df1 = DateFormat.getInstance();
		String day2 = df1.format(date);
		System.out.println(day2);
		// 2
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		String day3 = df2.format(date);
		System.out.println(day3);
		// 3
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		String day4 = df3.format(date);
		System.out.println(day4);

	}

}
