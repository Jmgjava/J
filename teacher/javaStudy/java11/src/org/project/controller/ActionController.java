package org.project.controller;

import java.util.Scanner;

import org.project.service.ActionDelete;
import org.project.service.ActionInsert;
import org.project.service.ActionSelect;
import org.project.service.ActionUpdate;
import org.project.service.ExcuteCommend;

public class ActionController {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ExcuteCommend service = null;

		boolean bool = true;

		while (bool) {
			System.out.println("�������� �Է��ϼ���");
			String query = input.next();

			if (query.equals("insert")) {
				service = new ActionInsert();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new ActionSelect();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new ActionUpdate();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new ActionDelete();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("while�� ����");
				bool = false;
			} else {
				System.out.println("������ �Է� ����.. �ٽ��Է��ϼ���");
			}
		}

	}
}
