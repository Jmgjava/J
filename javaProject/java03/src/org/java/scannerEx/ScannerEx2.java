package org.java.scannerEx;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		// ���� 2���� �Է��� �޾Ƽ� ����
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է�: ");
		int firstNum=scn.nextInt();
		
		System.out.print("�� ��° ���� �Է�: ");
		int secondNum=scn.nextInt();
		
		int sum=firstNum+secondNum;
		
		System.out.println(firstNum+"+"+secondNum+"="+sum);
		
		// �μ��� ����� ��� �غ��� -> 55+50 -> 52.5
		
		double ave=(double)sum/2;
		
		System.out.println("���: "+ave);
	}

}
