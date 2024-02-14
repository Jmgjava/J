package org.java.loopEx;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {

		System.out.println("while");

		// �׽�Ʈ �ڵ� ����� �� �ִ�.
		// �Է°��� insert�� -> ȸ������
		// �Է°��� select�� -> ȸ����ȸ
		// �Է°��� update�� -> ȸ������
		// �Է°��� delete�� -> ȸ������
		// �Է°��� exit�� -> ���α׷� ����
		// �Է°��� �� �װ��� �����ϸ� -> "Ʋ�� ��ɾ�"

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("�������� �Է����ּ���.");
			System.out.println("������: ");

			String query = scn.next();
			// if-else if ~else �̿��Ͽ� ���� �غ��ÿ�
			// CRUD( Create Read Update Delete )
			if (query.equals("insert")) {
				System.out.println("ȸ������"); // ��ǰ ���, ��ٱ���,�Խñ� ���
			} else if (query.equals("select")) {
				System.out.println("ȸ����ȸ"); // ��ǰ ��ȸ, ��ٱ���,�Խñ� ��ȸ,�˻�
			} else if (query.equals("update")) {
				System.out.println("ȸ������"); // ��ǰ ����, ��ٱ��ϼ���,�Խñ� ����
			} else if (query.equals("delete")) {
				System.out.println("ȸ������"); // ��ǰ ����, ��ٱ��� ����, �Խñ� ����
			} else if (query.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("Ʋ�� ��ɾ�. �ٽ� �Է����ּ���.");
			}
			scn.close();

		}
	}
}