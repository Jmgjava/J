package org.java.colletionEx;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		System.out.println("Vector");

		// ������ -> �θ�Ÿ���� ��ü �������� -> �ڽİ�ü
		// �����ε�(������), �������̵�(���)
		List<MemberDto> members = new Vector<MemberDto>();
//						members = new Stack<MemberDto>();

		members.add(new MemberDto(11, "m11"));
		members.add(new MemberDto(21, "m21"));
		members.add(new MemberDto(31, "m31"));
		members.add(new MemberDto(41, "m41"));
		members.add(new MemberDto(51, "m51"));

		System.out.println("for-each");
		for (MemberDto i : members) {
//			System.out.println(i);
			System.out.println("ȸ�� ����: " + i.getA());
			System.out.println("ȸ�� �̸�: " + i.getName());
		}

		System.out.println();
		// name -> m1
		for (MemberDto i : members) {
			// name�� m1�� ȸ���� ���
			if (i.getName().equals("m11")) {
				System.out.println("�̸�: " + i.getName());
				System.out.println("�̸��� m11�� ����� ����: " + i.getA());
			}
		}
		System.out.println();
		// ȸ�����̰� 30�̻��� ȸ������ ��ȸ
		for (MemberDto i : members) {
			if (i.getA() >= 30) {
				System.out.println("���̰� 30 �̻��� ȸ��: "+i.getName());
			}
		}

		System.out.println();

		System.out.println("Iterator");
		// Iterator -> ����ȭ -> Session, Cookie
		// �÷��� ��� Ÿ��
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto dto = iter.next();
			System.out.println("ȸ�� ����: " + dto.getA());
			System.out.println("ȸ�� �̸�: " + dto.getName());
		}

	}

}
