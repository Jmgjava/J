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

		// ȸ������
//		ExcuteCommand e1 = new ExcuteCommand();
//		e1.excuteQueryCommand();

		boolean bool = true;

		while (bool) {

			System.out.println("insert, update, select, delete, exit \n �۾��� �Է��Ͻÿ�:");
			String query = scn.next();

			if (query.equals("insert")) {
				// ȸ������
				service = new ActionInsert();
				service.excuteQueryCommand();

			} else if (query.equals("update")) {
				// ȸ������
				service = new ActionUpdate();
				service.excuteQueryCommand();

			} else if (query.equals("select")) {
				// ȸ����ȸ
				service = new ActionSelect();
				service.excuteQueryCommand();

			} else if (query.equals("delete")) {
				// ȸ������
				service = new ActionDelete();
				service.excuteQueryCommand();

			} else if (query.equals("exit")) {
				System.out.println("���α׷� ����");
				bool = false;

			} else {
				System.out.println("�ٽ� �Է��ϼ���.");

			}

		}
		scn.close();
	}

}
