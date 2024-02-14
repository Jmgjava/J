package org.java.basicApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		System.out.println("SimpleDateFormatEx");
		
		// JSP -> 날짜를 표시 할 때 자주 사용
		// 1.날짜
		Date date1 = new Date();
		// 2.포맷
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		// 3.포맷<-날짜
		String day1 = sdf1.format(date1);
		System.out.println(day1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년mm월dd일 hh시mm분ss초");
		String date2 = sdf2.format(date1);
		System.out.println(date2);
		// -1900, 월은 0부터
		Date date3 = new Date(124, 0, 15, 17, 10, 10);
		System.out.println(date3);

		SimpleDateFormat sdf3 = new SimpleDateFormat("yy/M/d HH-mm-ss");

		String day3 = sdf3.format(date3);
		System.out.println(day3);
	}

}
