package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		
//		문제) while문,  Scanner를 이용하여 insert,select,update,delete를 입력 하여 결과값을 콘솔에 출력 하시오.
//
//	예시)
//	insert -> 회원가입 실행
//		** 회원 가입은  MemberDto클래스,ArrayList를 이용해서 추가 하시오
//	select -> 전체회원 조회
//		** foreach문 또는 Iiterator를 이용하시오.(하나만 선택)
//	update -> "회원수정" 콘솔 출력
//	delete  -> "회원탈퇴" 콘솔 출력
//	exit      ->    while문 종료
//	위 5개 이외의 값을 입력 하면 "입력값오류 -> 다시 입력하세요"를 콘솔에 출력 하고 다시 Scanner를 수행 해야된다.
//
//	** 수행 결과  자바파일을 업로드 하시오

		Scanner scn = new Scanner(System.in);
		boolean bool = true;
		List<MemberDtoEx> in = new ArrayList<MemberDtoEx>();

		while (bool) {
			System.out.println("insert, update, select, delete \n명령문을 입력하시오: ");
			String input = scn.next();

			if (input.equals("insert")) {
				System.out.println("회원가입");
				System.out.println("번호: ");
				int no = scn.nextInt();
				System.out.println("아이디: ");
				String Id = scn.next();
				System.out.println("비밀번호: ");
				String Pw = scn.next();
				System.out.println("이름: ");
				String name = scn.next();
				System.out.println("나이: ");
				int age = scn.nextInt();

				in.add(new MemberDtoEx(no, Id, Pw, name, age));
				
				if(!in.isEmpty()) {
					System.out.println("회원가입성공");
				}else {
					System.out.println("회원가입 실패");
				}

			} else if (input.equals("update")) {
				System.out.println("회원수정");
			} else if (input.equals("select")) {
				System.out.println("회원조회");
				
				for (MemberDtoEx i : in) {
					System.out.println("번호: " + i.getNo());
					System.out.println("아이디: " + i.getId());
					System.out.println("비밀번호: " + i.getPw());
					System.out.println("이름: " + i.getName());
					System.out.println("나이: " + i.getAge());
				}

			} else if (input.equals("delete")) {
				System.out.println("회원탈퇴");
			} else if (input.equals("exit")) {
				System.out.println("프로그램 종료");
				bool = false;
			} else {
				System.out.println("다시 입력하세요");
			}

		}

	}

}
