package org.java.basicApi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		// ��¥��
		// �̱��� ���� -> �ѹ��� ��ü�� ���� �ϴ� ���
		LocalDate date1 = LocalDate.now();// ���ó�¥ // �ڵ�		
		System.out.println("LocalDate.now() -> "+date1);
		// ������
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());// 1
		System.out.println(date1.getMonth());// JANUARY
		System.out.println(date1.getDayOfYear());// 16/365 2��1�� -> 32
		System.out.println(date1.getDayOfMonth());// 1�� 16�� 2��1�� -> 1
		System.out.println(date1.getDayOfWeek());// TUESDAY
		System.out.println(date1.isLeapYear()); // ����?
		// ���� �߰�
		LocalDate date2= LocalDate.of(2024, 2, 1);
		System.out.println("LocalDate.of(2024, 2, 1)-> "+date2);
		System.out.println(date2.getYear());
		System.out.println(date2.getMonthValue());// 1
		System.out.println(date2.getMonth());// JANUARY
		System.out.println(date2.getDayOfYear());// 16/365 2��1�� -> 32
		System.out.println(date2.getDayOfMonth());// 1�� 16�� 2��1�� -> 1
		System.out.println(date2.getDayOfWeek());// TUESDAY
		System.out.println(date2.isLeapYear()); // ����?
		
		
		
		
		
		
		
		
		
		
		

	}
}
