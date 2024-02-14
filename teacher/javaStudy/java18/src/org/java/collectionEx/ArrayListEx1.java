package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		// ��ü�� ����
		// ������ �ְ� 0~
		// ���̰� �ڵ� ����
//		ArrayList<String> arr1= new ArrayList<String>();
		List<String> arr1 = new ArrayList<String>();
		String s1 = "���ڿ�3";

		arr1.add("���ڿ�1");
		arr1.add(new String("���ڿ�2"));
		arr1.add(s1);
		arr1.add("���ڿ�4");
		arr1.add("���ڿ�5");

		
		System.out.println("Ȯ��� for�� -> foreach��");
		// Ȯ��� for�� -> foreach��
		for (String str : arr1) {
			System.out.println(str);
		}
		System.out.println("Iterator");
		// Iterator
		Iterator<String> iter=arr1.iterator();
		while(iter.hasNext()) {
			String str= iter.next();
			System.out.println(str);
		}
				
		System.out.println(arr1);
		System.out.println(arr1.size());
		System.out.println(arr1.contains("���ڿ�1"));
		System.out.println(arr1.indexOf("���ڿ�1"));
		System.out.println(arr1.isEmpty());
		System.out.println(arr1.remove(0));
		System.out.println(arr1);
//		arr1.clear();
		System.out.println(arr1);
		System.out.println(arr1.hashCode());

		// forEach -> ��� �÷��� ��Ҹ� ��ȸ , Ÿ���� X
		// �̸� Ÿ���� ������ ���¿��� ��� ,���ٽ�
		arr1.forEach(element -> {
			if (element.equals("���ڿ�2"))
				System.out.println(element);
		});

	}
}
