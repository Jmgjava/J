package org.java.conditionEx;

public class If_ex2 {

	public static void main(String[] args) {
		System.out.println("if");
		// 2.������ 2��
		String dbId = "green";
		String dbPw = "1111";

		if (dbId.equals("green") && dbPw.equals("1111")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		if (dbId.equals("green") && dbPw.equals("1111"))
			System.out.println("�α��� ����");
		else
			System.out.println("�α��� ����");

	}
}