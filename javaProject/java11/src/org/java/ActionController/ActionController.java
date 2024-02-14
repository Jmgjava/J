package org.java.ActionController;

import java.util.Scanner;

import org.java.controller.ActionDelete;
import org.java.controller.ActionInsert;
import org.java.controller.ActionSelect;
import org.java.controller.ActionUpdate;
import org.java.service.ExcuteCommand;

public class ActionController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		ExcuteCommand service = null;

		// 회원관리
//		ExcuteCommand e1 = new ExcuteCommand();
//		e1.excuteQueryCommand();

		boolean bool = true;

		while (bool) {

			System.out.println("insert, update, select, delete, exit \n 작업을 입력하시오:");
			String query = scn.next();

			if (query.equals("insert")) {
				// 회원가입
				service = new ActionInsert();
				service.excuteQueryCommand();

			} else if (query.equals("update")) {
				// 회원수정
				service = new ActionUpdate();
				service.excuteQueryCommand();

			} else if (query.equals("select")) {
				// 회원조회
				service = new ActionSelect();
				service.excuteQueryCommand();

			} else if (query.equals("delete")) {
				// 회원삭제
				service = new ActionDelete();
				service.excuteQueryCommand();

			} else if (query.equals("exit")) {
				System.out.println("프로그램 종료");
				bool = false;

			} else {
				System.out.println("다시 입력하세요.");

			}

		}
		scn.close();
	}

}
