package org.java.collectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	//	����) while��,  Scanner�� �̿��Ͽ� insert,select,update,delete�� �Է� �Ͽ� ������� �ֿܼ� ��� �Ͻÿ�.//
	//	����)
	//	insert -> ȸ������ ����
	//		** ȸ�� ������  MemberDtoŬ����,ArrayList�� �̿��ؼ� �߰� �Ͻÿ�
	//	select -> ��üȸ�� ��ȸ
	//		** foreach�� �Ǵ� Iiterator�� �̿��Ͻÿ�.(�ϳ��� ����)
	//	update -> "ȸ������" �ܼ� ���
	//	delete  -> "ȸ��Ż��" �ܼ� ���
	//	exit      ->    while�� ����
	//	�� 5�� �̿��� ���� �Է� �ϸ� "�Է°����� -> �ٽ� �Է��ϼ���"�� �ֿܼ� ��� �ϰ� �ٽ� Scanner�� ���� �ؾߵȴ�.

		List<MemberDto> members2 = new ArrayList<MemberDto>();
		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("�������� �Է� �ϼ���.");
			String query = input.next();
			if (query.equals("insert")) {
				System.out.print("���� �Է�: ");
				int age = input.nextInt();
				System.out.print("�̸� �Է�: ");
				String name = input.next();

				members2.add(new MemberDto(age, name));
				
			} else if (query.equals("select")) {
				for (MemberDto member : members2) {
					System.out.print("����: " + member.getAge());
					System.out.println(", �̸�: " + member.getName());
				}
			} else if (query.equals("update")) {
				System.out.println("ȸ������");
			} else if (query.equals("delete")) {
				System.out.println("ȸ��Ż��");
			} else if (query.equals("exit")) {
				System.out.println("while�� ����");
				bool = false;
			} else {
				System.out.println("�Է°����� -> �ٽ� �Է��ϼ���");

			}

		}
	}
}
