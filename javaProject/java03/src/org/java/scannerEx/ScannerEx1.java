package org.java.scannerEx;
/*
// �ٸ� ��Ű������ Ŭ������ ���� �� �� �ݵ��
// import ��Ű��.Ŭ����; ���� �ؾ��Ѵ�.
*/
import java.util.Scanner;

/*
// java.lang ��Ű�� -> �ڹ��� �⺻ ��Ű��
// ��, java.lang ��Ű���� �ڵ����� import�ȴ�.
// import���� ������ �� �ִ�.
// import java.lang.System
*/
public class ScannerEx1 {
	
	public static void main(String[] args) {
		System.out.println("Scanner");
		// ���α׷��Ӱ� ���� �Է�
		Scanner scn=new Scanner(System.in); // �ý��� �Է�(�ֿܼ� �Է�)
		System.out.println("�ּҸ� �Է��ϼ���.");
		String adress=scn.nextLine(); // �Է� ���� ���� -> enter -> String
		System.out.println("�ּ� : "+adress);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name=scn.next();
		System.out.println("�̸� : "+name);
		
		System.out.println("���̸� �Է��ϼ���.");
		int age=scn.nextInt(); // int������ �Է�
		System.out.println("���� : "+age);
		
		System.out.println("Ű�� �Է��ϼ���.");
		double height=scn.nextDouble();
		System.out.println("Ű : "+height);
		
	}

}
