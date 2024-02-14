package org.java.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// 다른 패키지에서 클래스를 조회할 경우 
// import 패키지 전체경로를 작성 해주어야 된다.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {

		MemberDto member1 = new MemberDto();

		member1.setNo(1); // 회원번호 -> 실제는 자동으로 설정(시퀀스,auto_increment)
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setName("김이름");
		member1.setEmail("m1@email.com");
		member1.setPhone("010-0000-0000");
		member1.setDate(new Date(2024, 2, 5));

		System.out.println("회원번호: " + member1.getNo());
		System.out.println("회원ID: " + member1.getUserId());
		System.out.println("회원PW: " + member1.getUserPw());
		System.out.println("회원이름: " + member1.getName());
		System.out.println("회원이메일: " + member1.getEmail());
		System.out.println("회원전화: " + member1.getPhone());
		System.out.println("회원생일: " + member1.getDate());

		String info = member1.toString();// 객체 정보 조회
		System.out.println(info);

		//
		MemberDto member2 = new MemberDto();

		System.out.println("회원가입을 수행 하세요");

		Scanner input = new Scanner(System.in);

		System.out.print("회원번호: ");
		int no2 = input.nextInt();
		member2.setNo(no2);

		// id
		System.out.print("아이디: ");
		String userId2 = input.next();
		member2.setUserId(userId2);
		// pw
		System.out.print("비빌번호: ");
		String userPw2 = input.next();
		member2.setUserPw(userPw2);
		// name
		System.out.print("이름: ");
		String name2 = input.next();
		member2.setName(name2);
		// email
		System.out.print("이메일: ");
		String email2 = input.next();
		member2.setEmail(email2);
		// 전화
		System.out.print("전화: ");
		String phone2 = input.next();
		member2.setPhone(phone2);
//		// 생일
//		System.out.print("생일: ");

		String info2 = member2.toString();// 객체 정보 조회
		System.out.println(info2);

	}
}
