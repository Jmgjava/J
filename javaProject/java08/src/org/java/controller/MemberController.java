package org.java.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// 다른 패키지에서 클래스를 조회할 경우
// import 패키지 전체경로를 작성 해주어야 한다.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {

		MemberDto member1 = new MemberDto();

		member1.setNo(1);// 회원번호 -> 실제는 자동으로 설정(시퀀스, auto_increment)
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setName("조민근");
		member1.setEmail("JMG@naver.com");
		member1.setPhone("010-1234-5678");
		member1.setDate(new Date(2024, 1, 5));

		System.out.println("회원 번호: " + member1.getNo());
		System.out.println("회원 아이디: " + member1.getUserId());
		System.out.println("회원 비밀번호: " + member1.getUserPw());
		System.out.println("회원 이름: " + member1.getName());
		System.out.println("회원 이메일: " + member1.getEmail());
		System.out.println("회원 핸드폰: " + member1.getPhone());
		System.out.println("회원가입 날짜: " + member1.getDate());

		String info = member1.toString();// 객체 정보 조회

		System.out.println(info);

		MemberDto member2 = new MemberDto();
		String info2 = member2.toString();
		System.out.println(info2);

		System.out.println("회원가입을 수행 하세요");

		Scanner scn = new Scanner(System.in);

		// no
		System.out.println("회원번호");
//		member2.setNo(scn.next());
		int userNo1 = scn.nextInt();
		member2.setNo(userNo1);

		// id
		System.out.println("회원아이디");
//		member2.setUserId(scn.next());
		String userId = scn.next();
		member2.setUserId(userId);

		// pw
		System.out.println("회원비밀번호");
//		member2.setUserPw(scn.next());
		String userPw = scn.next();
		member2.setUserPw(userPw);

		// name
		System.out.println("회원이름");
//		member2.setName(scn.next());
		String userName = scn.next();
		member2.setName(userName);

		// email
		System.out.println("회원이메일");
//		member2.setEmail(scn.next());
		String userEmail = scn.next();
		member2.setEmail(userEmail);

		// phone
		System.out.println("회원핸드폰");
//		member2.setPhone(scn.next());
		String userPhone = scn.next();
		member2.setPhone(userPhone);

		// Date
		System.out.println("회원가입날짜");
//		member2.setDate(new Date(scn.nextInt()));
		int userDate = scn.nextInt();
		member2.setDate(new Date(userDate));

//		System.out.println("회원번호: "+member2.getNo());
//		System.out.println("회원아이디: "+member2.getUserId());
//		System.out.println("회원비밀번호: "+member2.getUserPw());
//		System.out.println("회원이름: "+member2.getName());
//		System.out.println("회원이메일: "+member2.getEmail());
//		System.out.println("회원핸드폰: "+member2.getPhone());
//		System.out.println("회원가입날짜: "+member2.getDate());

		System.out.println(member2);

		scn.close();
	}
}
