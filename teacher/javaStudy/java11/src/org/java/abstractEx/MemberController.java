package org.java.abstractEx;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		
		// ������ -> �θ�Ÿ���� ��ü ���� ������ �ڽİ�ü�� �����Ҽ� �ִ�.
		MemberService service=null;

		Scanner input=new Scanner(System.in);
		
		boolean bool=true;
		
		while(bool) {
			System.out.println("������ �Է�");
			
			String query =input.next();
			
			if (query.equals("insert")) {
				service = new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelect();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service = new MemberDelete();
				service.excuteQueryService();
			}else if(query.equals("exit")) {
				System.out.println("����");
				bool=false;
			}else {
				System.out.println("������ �Է¿���");
			}
			System.out.println(service);
		}

	}
}
