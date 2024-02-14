package org.java.basicApi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		// ��¥�� ����
		// �̱��� ���� -> �ѹ��� ��ü�� �����ϴ� ���
		LocalDate date1 = LocalDate.now(); // ���� ��¥ // �ڵ�
		System.out.println(date1);
		System.out.println("=====================================");
		// ������
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth()); // January ��
		System.out.println(date1.getMonthValue()); // 1 ��
		System.out.println(date1.getDayOfYear()); // "16"�� / 365 ��
		System.out.println(date1.getDayOfMonth()); // 1�� "16" ��
		System.out.println(date1.getDayOfWeek()); // ����
		System.out.println(date1.isLeapYear()); // ����
		
		System.out.println("=====================================");
		
		// ���� �߰� // ����
		LocalDate date2 = LocalDate.of(2024, 2, 6);
		System.out.println(date2.getYear());
		System.out.println(date2.getMonth()); // January ��
		System.out.println(date2.getMonthValue()); // 1 ��
		System.out.println(date2.getDayOfYear()); // "16"�� / 365 ��
		System.out.println(date2.getDayOfMonth()); // 1�� "16" ��
		System.out.println(date2.getDayOfWeek()); // ����
		System.out.println(date2.isLeapYear()); // ����

	}

}
