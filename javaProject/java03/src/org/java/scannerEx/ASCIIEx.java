package org.java.scannerEx;

public class ASCIIEx {

	public static void main(String[] args) {
		System.out.println("�ƽ�Ű �ڵ�");
		
		char ch1='A';
		
		System.out.println(ch1);
		
		int i1='A';
		System.out.println(i1);
		
		int i2='A'+2; //char+int -> int+int
		System.out.println(i2);
		
		char ch2='A'+2; // 65+2 -> 67=�ƽ�Ű �ڵ�C
		System.out.println(ch2);
		
		System.out.println("�빮�� -> �ҹ��� + 32");
		System.out.println((char)('A'+32));
		System.out.println((char)('B'+32));
		System.out.println((char)('C'+32));
		// �빮�� Z -> �ҹ���
		System.out.println((char)('Z'+32));
		System.out.println((int)'Z');
		
		System.out.println("�ҹ��� -> �빮�� -32");
		System.out.println((char)('a'-32));
		System.out.println((char)('b'-32));
		System.out.println((char)('c'-32));
		
	}
}
