package org.java.basicApi;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getYear()); // 1900+124 -> 2024
		System.out.println(dt.getMonth() + 1); // ��(0����~) *** ��+1
		System.out.println(dt.getDate()); // ��
		System.out.println(dt.getHours()); // ��
		System.out.println(dt.getMinutes()); // ��
		System.out.println(dt.getSeconds()); // ��
		System.out.println(dt.getDay()); // ���� -> �Ͽ��� 0

		// ����ð� : �� �� �� �� �� �� ����(swich)�ֿܼ� ���

		String week = "";

		int ye = ((dt.getYear() + 1900));
		int mo = ((dt.getMonth() + 1));
		int da = (dt.getDate());
		int ho = (dt.getHours());
		int mi = (dt.getMinutes());
		int se = (dt.getSeconds());

		int d = dt.getDay();

		switch (d) {
		case 0:
			week = "�Ͽ���";
			break;
		case 1:
			week = "������";
			break;
		case 2:
			week = "ȭ����";
			break;
		case 3:
			week = "������";
			break;
		case 4:
			week = "�����";
			break;
		case 5:
			week = "�ݿ���";
			break;
		case 6:
			week = "�����";
			break;
		default:
			System.out.println("�Է¿���");
		}
		System.out.println(ye + "�� " + mo + "�� " + da + "�� " + ho + "�� " + mi + "�� " + se + "�� " + week);

	}

}
