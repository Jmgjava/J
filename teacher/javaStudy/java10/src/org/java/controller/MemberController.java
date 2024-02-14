package org.java.controller;

import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

//�����(Ŭ���̾�Ʈ) ��û �޾Ƽ� -> ���񽺿� ���� ��Ű��
//-> ���񽺿��� ��� ���� ��ȯ �޾Ƽ� -> �����(Ŭ���̾�Ʈ)�� �ǵ�����(View)
public class MemberController {

	public static void main(String[] args) {

		// query�� insert�� "ȸ������"
		// query�� select�� "ȸ����ȸ"
		// query�� update�� "ȸ������"
		// query�� delete�� "ȸ��Ż��"
		// query�� exit�� "������ ����"
		// query�� ��4���� �̿ܿ��� "�������Է¿���"
		// �� ������ �ش��ϴ� excuteQueryService ��� �ǵ���
		// if~else if~elseȰ���ؼ�
		// ���α׷��� �غ����� ~3��~ 50�б���

		// ������
		// �θ�Ÿ�� ��ü ���� ������ �ڽİ�ü ����
		MemberService mService = null;
		Scanner input = new Scanner(System.in);
		// while���̿��ؼ� -> exit-> while�� ����		
		boolean bool=true;
		
		while(bool) {			
			System.out.println("������ �Է��ϼ���");
			System.out.print("QUREY: ");
			String query = input.next();
			
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
				System.out.println("������ ����");
				bool=false;
			} else {
				System.out.println("������ �Է� ����");
			}
		}

	}
}
