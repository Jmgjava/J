package org.java.conditionEx;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		System.out.println("���ĺ��Է� �Ͻÿ�.");
		Scanner scn=new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String alpha= scn.next();
		
		switch(alpha) {
		case "a":
			//break;
		case "A":
			System.out.println("A");
			break;// switch�� ����
		//if("a" || "A")
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("A,B,C�̿��� �� �Է�");
		}//break;
		
		//. if(90>=) -> A
		//switch(��){
		//    case 99 , 98 , 97 ,96,95,94,93 ,92 ,91,90:
		
		//	}
		
		
		
		
	}
}
