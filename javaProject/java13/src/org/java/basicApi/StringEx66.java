package org.java.basicApi;

import java.util.Scanner;

public class StringEx66 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("����� ��û �����Դϴ�. (/insert.do �Է�)");

		boolean bool = true;
		while (bool) {
			System.out.println("/insert.do, /update.do, /select.do, /delete.do\n��û�����Է�: ");
			
			String order = input.next();
//			System.out.println(order);

			String rsOrder = order.substring(order.length() - 3);
//			System.out.println(rsOrder);

			if (rsOrder.equals(".do")) {
				
//				System.out.println("��û ���� ->" + order);
				String url = order.substring(0, order.length() - 3);
//				System.out.println(".do ���� ->" + url);

				if (url.equals("/insert")) {
					System.out.println("ȸ������");
				} else if (url.equals("/update")) {
					System.out.println("ȸ������");
				} else if (url.equals("/select")) {
					System.out.println("ȸ����ȸ");
				} else if (url.equals("/delete")) {
					System.out.println("ȸ������");
				} else {
					System.out.println("�ٽ� �Է�");
				}

			} else if (order.equals("exit")) {
				System.out.println("���� ����");
				bool = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		
	}

}
