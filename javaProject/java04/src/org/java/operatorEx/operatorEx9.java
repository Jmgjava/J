package org.java.operatorEx;

public class operatorEx9 {

	public static void main(String[] args) {
		System.out.println("��Ʈ ������");
		System.out.println("==== & ===");
		System.out.println(12 & 5); // 2���� -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5)); // 2���� ���ڿ�
		System.out.println(Integer.toBinaryString(12&5));
		/*
		 	   1100
		     & 	101 
		     =	100 -> 4
		*/
		
		System.out.println("=== | ===");
		System.out.println(12 | 5); // 2���� -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"|"+Integer.toBinaryString(5)); // 2���� ���ڿ�
		System.out.println(Integer.toBinaryString(12|5));
		/*
		 	   1100
		     | 	101 
		     = 1101 -> 13
		*/
		
		System.out.println("== ^ ===");
		System.out.println(12 ^ 5); // 2���� -> 1100(12) & 101(5) = 100(4)
		System.out.println(Integer.toBinaryString(12)+"^"+Integer.toBinaryString(5)); // 2���� ���ڿ�
		System.out.println(Integer.toBinaryString(12^5));
		/*
		 	   1100
		     ^ 	101 
		     = 1001 -> 9
		*/
		
		
		
	}

}
