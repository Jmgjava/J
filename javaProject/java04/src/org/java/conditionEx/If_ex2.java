package org.java.conditionEx;

public class If_ex2 {

	public static void main(String[] args) {
		System.out.println("if");
		// 2. 조건이 2개
		String dbId = "yellow";
		String dbPw = "2222";

		if (dbId.equals("green") && dbPw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		if (dbId.equals("green") && dbPw.equals("1111"))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
	}

}
