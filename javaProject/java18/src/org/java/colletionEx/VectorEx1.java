package org.java.colletionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
		// ������ �����͸� ������ �� �ִ� Vector ����
		Vector<Integer> v1 = new Vector<Integer>();

		Integer i1 = new Integer(10); // �ڽ�
		Integer i2 = 20; // �ڵ��ڽ�

		v1.add(i1); // ������ ��ü�� �����ϴ� �ν��Ͻ� �߰�
		v1.add(new Integer(30)); // ������ ��ü�� �ٷ� �߰�
		v1.add(40); // �ڵ� �ڽ�
		// Vector ��ҽ� Ÿ�� -> Integer
		// v1 -> ���Ͱ�ü
		for (Integer i : v1) {
			// ��� ���Ϳ�Ҹ� ��ȸ
			System.out.println(i);
		}

		System.out.println("========");

		// �÷��ǿ� ��ü�� �δ� ���
		// 1. �⺻�ڷ���(8����) -> Wrapper, �ν��Ͻ�, new, �ڵ� �ڽ�

		Vector<Double> v2 = new Vector<Double>();
		// �ν��Ͻ�
		Double d = new Double(1.1); // �ڽ�
		Double d2 = 3.3; // �ڵ��ڽ�
		v2.add(2.2);
		v2.add(d);
		v2.add(d2);
		v2.add(4.4); // �ڵ��ڽ�

		// v2�� ��� ��Ҹ� �ֿܼ� ���

		for (Double i : v2) {
			System.out.println(i);
		}

		System.out.println("========");

		Vector<Float> v3 = new Vector<Float>();
		v3.add(new Float(6.6));
		v3.add(5.5F);

		for (Float i : v3) {
			System.out.println(i);
		}

		System.out.println("========");

		// 2.String -> new, " "

		Vector<String> v4 = new Vector<String>();
		String str1 = new String("���ڿ�1");
		String str2 = "���ڿ�2";
		v4.add(str1);
		v4.add(str2);
		v4.add(new String("���ڿ�3"));
		v4.add("���ڿ�4");

		for (String s : v4) {
			System.out.print(s);
			System.out.print("����: " + s.length() + " ");
			System.out.println(s.equals("���ڿ�1"));
		}

		System.out.println("========");

		// 3.�Ϲ�Ŭ���� -> new, Ÿ�� ����

		MemberDto member1 = new MemberDto(10, "m1");
		MemberDto member2 = new MemberDto(20, "m2");
		MemberDto member3 = new MemberDto(30, "m3");
		MemberDto member4 = new MemberDto(40, "m4");
		MemberDto member5 = new MemberDto(50, "m5");

		Vector<MemberDto> vDto = new Vector<MemberDto>();
		vDto.add(member1);
		vDto.add(member2);
		vDto.add(member3);
		vDto.add(member4);
		vDto.add(member5);

		System.out.println(vDto.size());
		System.out.println(vDto.get(0).getA()); // vDto ������ 0���� ����� int a�� �ҷ���
		System.out.println(vDto.get(0).getName());

		for (MemberDto i : vDto) {
			System.out.println(i);
			// age(����), name(�̸�)�� ���� ���
			System.out.println("�̸�: " + i.getName() + ", ����: " + i.getA());
		}

		System.out.println("========");

		Vector<MemberDto> vDto2 = new Vector<MemberDto>();

		vDto2.add(new MemberDto(110, "m11"));
		vDto2.add(new MemberDto(120, "m12"));
		vDto2.add(new MemberDto(130, "m13"));
		vDto2.add(new MemberDto(140, "m14"));
		vDto2.add(new MemberDto(150, "m15"));
		System.out.println(vDto2);

		// for -> ��ȸ ������ ����
		for (int i = 0; i < vDto2.size(); i++) {
			System.out.println(vDto2.get(i));
		}
		// for-each -> ��� �÷��� ��Ҹ� ��ȸ -> �ϳ��� ��Ҹ� ��ȸ
		for (MemberDto i : vDto2) {
			System.out.println(i);
		}

	}

}
