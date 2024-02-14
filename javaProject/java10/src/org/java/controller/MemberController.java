package org.java.controller;

import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberUpdate;

// �����(Ŭ���̾�Ʈ) ��û �޾Ƽ� -> ���񽺿� ���� ��Ű��
// -> ���񽺿��� ������� �޾Ƽ� -> �����(Ŭ���̾�Ʈ)���� �ǵ�����(View)
public class MemberController {

	public static void main(String[] args) {

		// ������
		// �θ�Ÿ�� ��ü ���� ������ �ڽİ�ü ����
		MemberService mService = null;
		Scanner scn = new Scanner(System.in);

		// query�� insert�� MemberInsert "ȸ������"
		// query�� select�� MemberSelect "ȸ����ȸ"
		// query�� update�� MemberUpdate "ȸ������"
		// query�� delete�� MemberDelete "ȸ������"
		// query�� exit�� "query�� ����"
		// query�� ���� �� �ܶ�� "query�� �Է¿���"
		// �� ���� �ش��ϴ� excuteQueryService ��µǵ���
		// if-else if~else Ȱ���ؼ�
		// ���α׷��� �غ�����.

		// while�� �̿��ؼ� -> exit -> while�� ����

		boolean bool = true;

		while (bool) {

			System.out.println("insert, select, update, delete, exit \n �۾��� �Է��ϼ���: ");

			String query = scn.next();

			if (query.equals("insert")) {
				// ȸ������ ���� ��Ų��.
				mService = new MemberInsert();
				mService.excuteQueryService();

			} else if (query.equals("select")) {
				// ȸ����ȸ ���� ��Ų��.
				mService = new MemberSelect();
				mService.excuteQueryService();

			} else if (query.equals("update")) {
				// ȸ������ ���� ��Ų��.
				mService = new MemberUpdate();
				mService.excuteQueryService();

			} else if (query.equals("delete")) {
				// ȸ��Ż�� ���� ��Ų��.
				mService = new MemberDelete();
				mService.excuteQueryService();

			} else if (query.equals("exit")) {
				System.out.println("query�� ����");
				bool = false;
			} else {
				System.out.println("query�� �Է¿���");
			}

		}
		scn.close();
	}

}
