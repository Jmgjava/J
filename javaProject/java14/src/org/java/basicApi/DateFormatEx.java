package org.java.basicApi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void main(String[] args) {
		System.out.println("DateFormat");
		// 1.��¥ ����
		Date now = new Date();
		System.out.println(now);
		// DateFormat -> new ���� X

		// 2.��¥ ����
		// final�� ��ü ���� -> �ѹ��� ������ �� �ִ�
		DateFormat df1 = DateFormat.getInstance(); // singleton pattern(�̱��� ����) -> ��ü�� �ѹ��� �����ϵ��� programming
		// 3.���� <- ��¥
		System.out.println(df1.format(now));
		// getDateInstance DateFormat.FULL
		// 2024�� 1�� 15�� ������
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		// 2024�� 1�� 15��
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		// 24. 1. 15.
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		// 2024. 1. 15.
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		// 2024. 1. 15.

		System.out.println(df2.format(now));
														// ��¥ 				// �ð� 			// ����
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df3.format(now));
	}

}
