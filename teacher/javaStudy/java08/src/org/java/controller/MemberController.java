package org.java.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// �ٸ� ��Ű������ Ŭ������ ��ȸ�� ��� 
// import ��Ű�� ��ü��θ� �ۼ� ���־�� �ȴ�.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {

		MemberDto member1 = new MemberDto();

		member1.setNo(1); // ȸ����ȣ -> ������ �ڵ����� ����(������,auto_increment)
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setName("���̸�");
		member1.setEmail("m1@email.com");
		member1.setPhone("010-0000-0000");
		member1.setDate(new Date(2024, 2, 5));

		System.out.println("ȸ����ȣ: " + member1.getNo());
		System.out.println("ȸ��ID: " + member1.getUserId());
		System.out.println("ȸ��PW: " + member1.getUserPw());
		System.out.println("ȸ���̸�: " + member1.getName());
		System.out.println("ȸ���̸���: " + member1.getEmail());
		System.out.println("ȸ����ȭ: " + member1.getPhone());
		System.out.println("ȸ������: " + member1.getDate());

		String info = member1.toString();// ��ü ���� ��ȸ
		System.out.println(info);

		//
		MemberDto member2 = new MemberDto();

		System.out.println("ȸ�������� ���� �ϼ���");

		Scanner input = new Scanner(System.in);

		System.out.print("ȸ����ȣ: ");
		int no2 = input.nextInt();
		member2.setNo(no2);

		// id
		System.out.print("���̵�: ");
		String userId2 = input.next();
		member2.setUserId(userId2);
		// pw
		System.out.print("�����ȣ: ");
		String userPw2 = input.next();
		member2.setUserPw(userPw2);
		// name
		System.out.print("�̸�: ");
		String name2 = input.next();
		member2.setName(name2);
		// email
		System.out.print("�̸���: ");
		String email2 = input.next();
		member2.setEmail(email2);
		// ��ȭ
		System.out.print("��ȭ: ");
		String phone2 = input.next();
		member2.setPhone(phone2);
//		// ����
//		System.out.print("����: ");

		String info2 = member2.toString();// ��ü ���� ��ȸ
		System.out.println(info2);

	}
}
