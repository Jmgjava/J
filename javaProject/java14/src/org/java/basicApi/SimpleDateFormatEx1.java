package org.java.basicApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		System.out.println("SimpleDateFormatEx");
		
		// JSP -> ��¥�� ǥ�� �� �� ���� ���
		// 1.��¥
		Date date1 = new Date();
		// 2.����
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		// 3.����<-��¥
		String day1 = sdf1.format(date1);
		System.out.println(day1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��mm��dd�� hh��mm��ss��");
		String date2 = sdf2.format(date1);
		System.out.println(date2);
		// -1900, ���� 0����
		Date date3 = new Date(124, 0, 15, 17, 10, 10);
		System.out.println(date3);

		SimpleDateFormat sdf3 = new SimpleDateFormat("yy/M/d HH-mm-ss");

		String day3 = sdf3.format(date3);
		System.out.println(day3);
	}

}
