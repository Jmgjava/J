package org.java.collectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	//	문제) while문,  Scanner를 이용하여 insert,select,update,delete를 입력 하여 결과값을 콘솔에 출력 하시오.//
	//	예시)
	//	insert -> 회원가입 실행
	//		** 회원 가입은  MemberDto클래스,ArrayList를 이용해서 추가 하시오
	//	select -> 전체회원 조회
	//		** foreach문 또는 Iiterator를 이용하시오.(하나만 선택)
	//	update -> "회원수정" 콘솔 출력
	//	delete  -> "회원탈퇴" 콘솔 출력
	//	exit      ->    while문 종료
	//	위 5개 이외의 값을 입력 하면 "입력값오류 -> 다시 입력하세요"를 콘솔에 출력 하고 다시 Scanner를 수행 해야된다.

		List<MemberDto> members2 = new ArrayList<MemberDto>();
		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문을 입력 하세요.");
			String query = input.next();
			if (query.equals("insert")) {
				System.out.print("나이 입력: ");
				int age = input.nextInt();
				System.out.print("이름 입력: ");
				String name = input.next();

				members2.add(new MemberDto(age, name));
				
			} else if (query.equals("select")) {
				for (MemberDto member : members2) {
					System.out.print("나이: " + member.getAge());
					System.out.println(", 이름: " + member.getName());
				}
			} else if (query.equals("update")) {
				System.out.println("회원수정");
			} else if (query.equals("delete")) {
				System.out.println("회원탈퇴");
			} else if (query.equals("exit")) {
				System.out.println("while문 종료");
				bool = false;
			} else {
				System.out.println("입력값오류 -> 다시 입력하세요");

			}

		}
	}
}
