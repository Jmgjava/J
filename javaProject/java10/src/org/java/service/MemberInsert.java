package org.java.service;

import java.util.Scanner;

import org.java.controller.MemberService;
import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {

	public int a;

	@Override
	public void excuteQueryService() {
		System.out.println("회원 가입");

		// DB에 접속해 회원정보를 입력받아서 데이터베이스에 저장 -> DAO
		MemberDao dao = new MemberDao();

		boolean bool = true;
		Scanner scn = new Scanner(System.in);

		while (bool) {

			System.out.println("회원번호: ");
			int no = scn.nextInt();// 회원번호

			System.out.println("회원ID: ");
			String userId = scn.next(); // 회원 Id

			System.out.println("회원PW: ");
			String userPw = scn.next(); // 회원 PW

			System.out.println("회원이름: ");
			String name = scn.next(); // 회원 이름

			System.out.println("전화번호: ");
			String number = scn.next(); // 전화번호

			// 반환값이 1이면 회원가입 성공, 1이 아니면 회원가입 실패
			int result = dao.insert(no, userId, userPw, name, number);

			if (result == 1) {
				System.out.println("회원가입 성공");
				bool = false;
			} else {
				System.out.println("회원가입 실패");

			}
		}
		scn.close();

	}

}
