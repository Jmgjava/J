package org.java.loopEx;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		System.out.println("while");
		
		// �׽�Ʈ �ڵ� ��� �Ҽ� �ִ�.
		//  �Է°��� insert�� -> ȸ������
		//  �Է°��� select�� -> ȸ����ȸ
		//  �Է°��� update�� -> ȸ������
		//  �Է°��� delete�� -> ȸ��Ż��
		//  �Է°��� exit�� -> ���α׷� ����
		//  �Է°��� �� 5���� �����ϸ� -> �ٽ� �Է����ּ��� -> �ֿܼ� ���
		// if~else if~ else�̿��ؼ� ���� �غ�����
		
		
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է����ּ���");
			System.out.print("������: ");
			
			String query=scn.next();			
			// if~else if~ else�̿��ؼ� ���� �غ�����
			
			// Create Read Update Delete -> CRUD
			if(query.equals("insert")) {
				System.out.println("ȸ������");// ��ǰ���, ��ٱ���,�Խñ۵��
			}else if(query.equals("select")) {
				System.out.println("ȸ����ȸ");// ��ǰ��ȸ,��ٱ���, �Խñ� ��ȸ,�˻�
			}else if(query.equals("update")) {
				System.out.println("ȸ������");// ��ǰ����,��ٱ��ϼ���, �Խñ� ����
			}else if(query.equals("delete")) {
				System.out.println("ȸ��Ż��");// ��ǰ����,��ٱ��ϻ���, �Խñ� ����
			}else if(query.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		
		scn.close();
		System.out.println("main����");
		
		
		
	}
}
