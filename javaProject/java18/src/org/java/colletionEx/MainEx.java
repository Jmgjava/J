package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		
//		����) while��,  Scanner�� �̿��Ͽ� insert,select,update,delete�� �Է� �Ͽ� ������� �ֿܼ� ��� �Ͻÿ�.
//
//	����)
//	insert -> ȸ������ ����
//		** ȸ�� ������  MemberDtoŬ����,ArrayList�� �̿��ؼ� �߰� �Ͻÿ�
//	select -> ��üȸ�� ��ȸ
//		** foreach�� �Ǵ� Iiterator�� �̿��Ͻÿ�.(�ϳ��� ����)
//	update -> "ȸ������" �ܼ� ���
//	delete  -> "ȸ��Ż��" �ܼ� ���
//	exit      ->    while�� ����
//	�� 5�� �̿��� ���� �Է� �ϸ� "�Է°����� -> �ٽ� �Է��ϼ���"�� �ֿܼ� ��� �ϰ� �ٽ� Scanner�� ���� �ؾߵȴ�.
//
//	** ���� ���  �ڹ������� ���ε� �Ͻÿ�

		Scanner scn = new Scanner(System.in);
		boolean bool = true;
		List<MemberDtoEx> in = new ArrayList<MemberDtoEx>();

		while (bool) {
			System.out.println("insert, update, select, delete \n��ɹ��� �Է��Ͻÿ�: ");
			String input = scn.next();

			if (input.equals("insert")) {
				System.out.println("ȸ������");
				System.out.println("��ȣ: ");
				int no = scn.nextInt();
				System.out.println("���̵�: ");
				String Id = scn.next();
				System.out.println("��й�ȣ: ");
				String Pw = scn.next();
				System.out.println("�̸�: ");
				String name = scn.next();
				System.out.println("����: ");
				int age = scn.nextInt();

				in.add(new MemberDtoEx(no, Id, Pw, name, age));
				
				if(!in.isEmpty()) {
					System.out.println("ȸ�����Լ���");
				}else {
					System.out.println("ȸ������ ����");
				}

			} else if (input.equals("update")) {
				System.out.println("ȸ������");
			} else if (input.equals("select")) {
				System.out.println("ȸ����ȸ");
				
				for (MemberDtoEx i : in) {
					System.out.println("��ȣ: " + i.getNo());
					System.out.println("���̵�: " + i.getId());
					System.out.println("��й�ȣ: " + i.getPw());
					System.out.println("�̸�: " + i.getName());
					System.out.println("����: " + i.getAge());
				}

			} else if (input.equals("delete")) {
				System.out.println("ȸ��Ż��");
			} else if (input.equals("exit")) {
				System.out.println("���α׷� ����");
				bool = false;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}

	}

}
