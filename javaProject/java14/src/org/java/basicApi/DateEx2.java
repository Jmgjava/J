package org.java.basicApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		System.out.println("Date -> DateFormat");

		// 1.��¥ ����
		Date date = new Date();
		// 2.��¥ ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); // 2024-01-15
		// 3.��¥ ���˿� ��¥�����͸� �߰�
		String df = sdf.format(date);
		System.out.println(df);
	}

}