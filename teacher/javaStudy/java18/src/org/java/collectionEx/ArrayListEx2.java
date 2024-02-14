package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		System.out.println("ArrayList");

//		ArrayList<MemberDto> members= new ArrayList<MemberDto>();
		List<MemberDto> members = new ArrayList<MemberDto>();
//		MemberDto dto= new MemberDto();
//		dto.setAge(11);
//		dto.setName("m1");
		members.add(new MemberDto(11, "m1"));
		members.add(new MemberDto(21, "m2"));
		members.add(new MemberDto(31, "m3"));
		members.add(new MemberDto(41, "m4"));
		members.add(new MemberDto(51, "m5"));

		System.out.println(members);
		// foreach�� -> Ȯ���� for��
		for (MemberDto member : members) {
			System.out.print("����: " + member.getAge());
			System.out.println(" �̸�: " + member.getName());
		}
		System.out.println();
		// Iterator
		Iterator<MemberDto> iter = members.iterator();
		while (iter.hasNext()) {
			MemberDto member = iter.next();
			System.out.print("����: " + member.getAge());
			System.out.println(" �̸�: " + member.getName());
		}
		////////////////////////////////////////////////////
		System.out.println();
		System.out.println("ȸ������");

		List<MemberDto> members2 = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);

		// while���̿��ؼ� 5���� ȸ���� ��� �ϰ� foreach������ �ֿܼ� ���
		boolean bool = true;

		int cnt = 0;

		while (bool) {
			// cnt++;
//			System.out.println("Ƚ��: "+cnt);

			System.out.print("���� �Է�: ");
			int age = input.nextInt();
			System.out.print("�̸� �Է�: ");
			String name = input.next();

			members2.add(new MemberDto(age, name));
			for (MemberDto member : members2) {
				System.out.print("����: " + member.getAge());
				System.out.println(", �̸�: " + member.getName());
			}
			// 5�� ���� ->
//			if(cnt>=5 ) bool=false;

			System.out.println("List����: " + members2.size());
			if (members2.size() >= 5)
				bool = false;

		}

	}
}
