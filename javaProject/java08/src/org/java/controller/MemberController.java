package org.java.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// �ٸ� ��Ű������ Ŭ������ ��ȸ�� ���
// import ��Ű�� ��ü��θ� �ۼ� ���־�� �Ѵ�.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {

		MemberDto member1 = new MemberDto();

		member1.setNo(1);// ȸ����ȣ -> ������ �ڵ����� ����(������, auto_increment)
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setName("���α�");
		member1.setEmail("JMG@naver.com");
		member1.setPhone("010-1234-5678");
		member1.setDate(new Date(2024, 1, 5));

		System.out.println("ȸ�� ��ȣ: " + member1.getNo());
		System.out.println("ȸ�� ���̵�: " + member1.getUserId());
		System.out.println("ȸ�� ��й�ȣ: " + member1.getUserPw());
		System.out.println("ȸ�� �̸�: " + member1.getName());
		System.out.println("ȸ�� �̸���: " + member1.getEmail());
		System.out.println("ȸ�� �ڵ���: " + member1.getPhone());
		System.out.println("ȸ������ ��¥: " + member1.getDate());

		String info = member1.toString();// ��ü ���� ��ȸ

		System.out.println(info);

		MemberDto member2 = new MemberDto();
		String info2 = member2.toString();
		System.out.println(info2);

		System.out.println("ȸ�������� ���� �ϼ���");

		Scanner scn = new Scanner(System.in);

		// no
		System.out.println("ȸ����ȣ");
//		member2.setNo(scn.next());
		int userNo1 = scn.nextInt();
		member2.setNo(userNo1);

		// id
		System.out.println("ȸ�����̵�");
//		member2.setUserId(scn.next());
		String userId = scn.next();
		member2.setUserId(userId);

		// pw
		System.out.println("ȸ����й�ȣ");
//		member2.setUserPw(scn.next());
		String userPw = scn.next();
		member2.setUserPw(userPw);

		// name
		System.out.println("ȸ���̸�");
//		member2.setName(scn.next());
		String userName = scn.next();
		member2.setName(userName);

		// email
		System.out.println("ȸ���̸���");
//		member2.setEmail(scn.next());
		String userEmail = scn.next();
		member2.setEmail(userEmail);

		// phone
		System.out.println("ȸ���ڵ���");
//		member2.setPhone(scn.next());
		String userPhone = scn.next();
		member2.setPhone(userPhone);

		// Date
		System.out.println("ȸ�����Գ�¥");
//		member2.setDate(new Date(scn.nextInt()));
		int userDate = scn.nextInt();
		member2.setDate(new Date(userDate));

//		System.out.println("ȸ����ȣ: "+member2.getNo());
//		System.out.println("ȸ�����̵�: "+member2.getUserId());
//		System.out.println("ȸ����й�ȣ: "+member2.getUserPw());
//		System.out.println("ȸ���̸�: "+member2.getName());
//		System.out.println("ȸ���̸���: "+member2.getEmail());
//		System.out.println("ȸ���ڵ���: "+member2.getPhone());
//		System.out.println("ȸ�����Գ�¥: "+member2.getDate());

		System.out.println(member2);

		scn.close();
	}
}
