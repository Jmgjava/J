package org.java.basicApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		System.out.println("Date -> DateFormat");
		
		//1.날짜 생성
		Date date= new Date();
		//2.날짜 포맷
		SimpleDateFormat spf= new SimpleDateFormat("yyyy-mm-dd");//2024-01-15
		//3.날짜 포맷에 날짜데이터를 추가
		String df=spf.format(date);		
		System.out.println(df);
		
		
		
	}
}
