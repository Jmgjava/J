package org.java.collectionEx;

import java.util.Vector;

import javax.lang.model.element.Element;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
//		1. List �������̽� �θ�
//		2. ������ �ִ�.
//		3. ���̰� �ڵ� ����
//		4. ��Ұ� ��ü�� ����
//		5. �ߺ����� ���

		Vector<Integer> v1 = new Vector<Integer>();

		System.out.println(v1);

		Integer i1 = new Integer(10); // �ڽ�, �⺻Ÿ��(10) -> ��ü
		Integer i2 = 10;
		// �߰�
//		v1.add(i1);
//		v1.add(new Integer(20));
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		int size = v1.size(); // ������ ����
		System.out.println(size);
		System.out.println(v1);

		System.out.println("======1======");
		// �� ��Ҹ� ��ȸ
		System.out.print(v1.get(0));
		System.out.print(v1.get(1));
		System.out.print(v1.get(2));
		System.out.print(v1.get(3));
		System.out.print(v1.get(4));

		System.out.println();

		System.out.println("======2======");
		// for
		for (int i = 0; i < size; i++) {
			System.out.print(v1.get(i));
		}

		System.out.println();
		System.out.println("======3======");
		// ��ü �ݺ��� -> for-each
		// ��� ��Ҹ� ->
		for (Integer i : v1) {
			System.out.print(i);
		}

		System.out.println();
		System.out.println("======4======");
		v1.add(1, 100); // (1���� �տ�, 100�� ���� ����)

		System.out.println(v1);
		System.out.println(v1.capacity());

		System.out.println();
		System.out.println("======5======");
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		v2.add(400);
		v2.add(500);
		System.out.println(v2);
		System.out.println(v1);
		// v1 ���� �ڿ� v2 ���� �߰�
		System.out.println(v1.addAll(v2));
		System.out.println(v1);

//		v1.clear(); // ��� ��� ����

		System.out.println(v1);

		// �˻� ��� ����
		System.out.println(v1.contains(100)); // ****
		System.out.println(v1.elementAt(0)); // �ε����� �ش��ϴ� ���
		System.out.println(v1.indexOf(100)); // ��Ұ� �����?

		System.out.println(v1.isEmpty()); // **** ���Ϳ� ��Ұ� ����
		if (v1.isEmpty()) {
			System.out.println("���Ϳ� ��Ұ� null.");
		} else {
			System.out.println("���Ϳ� ��Ұ� ����");
		}

		System.out.println(v1);
		v1.remove(1); // �ε���
		System.out.println(v1);
		v1.remove(new Integer(200)); // ��� ����
		System.out.println(v1);

		// ���� -> �迭
		Integer[] vArr = (Integer[]) v1.toArray();

	}

}
