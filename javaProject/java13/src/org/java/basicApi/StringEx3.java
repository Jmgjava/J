package org.java.basicApi;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println("String");

		System.out.println("subString()");

		String str1 = "Java 2024 Project";
		System.out.println("substring(�ε���) -> ���ڿ��� �ε������� ��ȯ(return(get))");
		System.out.println(str1.length()); // 17
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(10));
		System.out.println("project".length()); // project ����

		// 10 3 < - ���ڸ� ������ ���ڿ�
		// 10 - 3 => 7 -> �ε��� ��ȣ 7 -> ���� ���ڿ� ����(8��°)
		String insert = "/member_insert.do";
		String dolength = ".do";

		// ���� -> ��ü���ڿ�����-�����ù��ڿ�(�����ڿ�)
		// -> ������ ���۹���
		// substring(���۹���)
		System.out.println(insert.length());
		System.out.println(insert.substring(7));

		// ��ü ���ڿ� ���� - ".do"
		System.out.println(insert.length() - dolength.length());
		int index = insert.length() - dolength.length();
		System.out.println(insert.substring(index));

		System.out.println("===����===");

		// ����
		// update, select, delete ���ڿ����� ������ .do �� �ֿܼ� ���
		// substring() �̿��ؾ���

		String update = "/member_update.do";
		int up = update.length() - ".do".length();
		System.out.println(update.substring(up));

		String select = "/member_select.do";
		int se = select.length() - ".do".length();
		System.out.println(update.substring(se));

		String delete = "/member_delete.do";
		int de = delete.length() - ".do".length();
		System.out.println(update.substring(de));
		
		// ����

		System.out.println("����� ��û ���� �Է�");

		Scanner scn = new Scanner(System.in);

		System.out.println("�Է�(�ݵ�� ���� .do �Է�) : ");

		String query = scn.next();
		System.out.println(query);

		// query���� .do�� query2�� ����
		int index2 = query.length()	-".do".length();
		String query2 = query.substring(index2); // .do
		
		System.out.println(query2);



	}

}
