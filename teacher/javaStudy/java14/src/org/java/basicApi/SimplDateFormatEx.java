package org.java.basicApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplDateFormatEx {

	public static void main(String[] args) {
		System.out.println("SimplDateFormatEx");
		// JSP -> 날짜를 표시 할 때 자주 사용
		// 1.날짜
		Date date1 = new Date();
		// 2.포맷
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 3.포맷<-날짜
		String day1 = df1.format(date1);
		System.out.println(day1);

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		String day2 = df2.format(date1);
		System.out.println(day2);
		// 1900, 월(0~)
		Date date3 = new Date(124, 0, 15, 17, 10, 10);
		System.out.println(date3);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy/M/d HH:mm:ss");

		String day3 = df3.format(date3);
		System.out.println(day3);

	}
}
