package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		System.out.println("���� Excetption 1");		
		
		int num1 = 10;
		int[] arrInt = new int[5];
		
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("���ڸ� �Է�: ");
			int num2 = input.nextInt();			
			System.out.println(num2);   // �߸��� ���� �Է� 
			System.out.println(num1 / num2);// 0���� ����
			System.out.println(arrInt[5]);//�迭 �ε��� �ʰ�
			System.out.println("OK");
			
		}catch (ArithmeticException e1) { //0���� ������
			e1.printStackTrace();
		}catch (InputMismatchException e2) { // �Է°� Ÿ�Կ���
			e2.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e3) {// �迭 �ε��� ����
			e3.printStackTrace();
		}finally {
			System.out.println("�⺻����");
		}
		System.out.println("���α׷� ���� ����");

	}
}
