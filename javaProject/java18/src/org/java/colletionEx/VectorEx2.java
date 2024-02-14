package org.java.colletionEx;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		System.out.println("Vector iterator");

		Vector<MemberDto> members = new Vector<MemberDto>();
//		Lisy<MemberDto> �̸� = new List<MemberDto>();
		members.add(new MemberDto(10, "m1"));
		members.add(new MemberDto(20, "m2"));
		members.add(new MemberDto(30, "m3"));
		members.add(new MemberDto(40, "m4"));
		members.add(new MemberDto(50, "m5"));
		System.out.println(members);

		System.out.println("for��");
		// ��ȸ���
		// for
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}

		System.out.println("for-each��");
		// for-each -> ��ü
		for (MemberDto i : members) {
			System.out.println(i);
		}

		System.out.println("Iterator");
		// Iterator -> ����Ʈ�� ��ü�� ��ȸ
		// Iterator<���Ÿ��> �̸� = �÷���.Iterator();
		Iterator<MemberDto> iter = members.iterator();
		// Iterator ��ȸ�� ��Ұ� ������ while�� ����
		while (iter.hasNext()) {
			// ��� Ÿ��
			MemberDto dto = iter.next(); // �ϳ��� ��Ҹ� ��ȸ
			System.out.println(dto);
		}

	}

}
