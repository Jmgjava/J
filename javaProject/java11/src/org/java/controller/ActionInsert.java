package org.java.controller;

import java.util.Scanner;

import org.java.service.ExcuteCommand;

public class ActionInsert extends ExcuteCommand {

	@Override
	public void excuteQueryCommand() {
		System.out.println("회원가입");

//		boolean bool = true;

//		while (bool) {

		Scanner input = new Scanner(System.in);

		System.out.println("회원 no: ");
		int no = input.nextInt();

		System.out.println("회원 ID: ");
		String id = input.next();

		System.out.println("회원 PW: ");
		String pw = input.next();

		System.out.println("회원 나이: ");
		int age = input.nextInt();

		System.out.println("회원 Name: ");
		String name = input.next();

		System.out.println("회원 Phone: ");
		String phone = input.next();

		// 회원가입 회원정보를 입력
		System.out.println("회원번호: " + no);
		System.out.println("회원ID: " + id);
		System.out.println("회원PW: " + pw);
		System.out.println("회원나이: " + age);
		System.out.println("회원이름: " + name);
		System.out.println("회원번호: " + phone);
//		}
	}

}
