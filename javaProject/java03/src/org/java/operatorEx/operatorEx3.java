package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx3 {

	public static void main(String[] args) {
		
		System.out.println("�� ������");
		
		int num1=10;
		int num2=20;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2); // ������?
		System.out.println(num1!=num2); // ���� ������?
		// ���� �ϳ��� if�� ������ true�� ��쿡�� ���� ����
		if(num1<num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
		}
		
		//������ �ΰ�
		if(num1>num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
		}else {
			System.out.println("num1�� num2���� ũ�� �ʽ��ϴ�.");			
		}
		
		// ���̵� ��ġ�ϴ��� Ȯ��
		
		String userId="m1111";
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���̵�: ");
		// . <- ***��ü ���� ������
		String input=scn.next();
		
		// ���̵� ��ġ�ϸ� -> "�ߺ����̵��Դϴ�" �ֿܼ� ���
		// ���̵� ��ġ���������� -> "���̵� ����� �� �ֽ��ϴ�" �ֿܼ� ���
		
		if(userId.equals(input)) {
			System.out.println("�ߺ����̵��Դϴ�.");
		} else {
			System.out.println("���̵� ����� �� �ֽ��ϴ�");
		}
		
		
		
	}
}
