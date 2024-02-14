package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		// ��ü�� ����
		// ������ �ְ� 0~
		// ���̰� �ڵ� ����
//		ArrayList<String> arrs = new ArrayList<String>();
		List<String> arrs = new ArrayList<String>();
		String s1 = "���ڿ�1";
		arrs.add(s1);
		arrs.add(new String("���ڿ�2"));
		arrs.add("���ڿ�3");
		arrs.add("���ڿ�4");
		arrs.add("���ڿ�5");

		System.out.println("Ȯ���� for�� -> for-each��");
		for (String i : arrs) {
			System.out.println(i);
		}

		System.out.println(arrs);
		System.out.println(arrs.size());
		System.out.println(arrs.contains("���ڿ�1"));
		System.out.println(arrs.indexOf("���ڿ�1"));
		System.out.println(arrs.isEmpty());
		System.out.println(arrs.remove(0));
		System.out.println(arrs);
		arrs.clear();
		System.out.println(arrs);

		// forEach -> ��� �÷��� ��Ҹ� ��ȸ, Ÿ���� X
		// �̸� Ÿ���� ������ ���¿��� ���, ���ٽ�
		arrs.forEach(element -> {
			if (element.equals("���ڿ�1"))
				System.out.println(element);
		});

		// Iterator
		Iterator<String> iter = arrs.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}

}
