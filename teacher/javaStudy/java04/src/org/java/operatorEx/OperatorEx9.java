package org.java.operatorEx;

public class OperatorEx9 {

	public static void main(String[] args) {
		System.out.println("��Ʈ������");
		
		System.out.println("&");
		System.out.println(12&5);
		System.out.println(Integer.toBinaryString(12)+"&"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12&5));// 2���� ���ڿ�
		/*
		      1100   
		   &   101
		       100    -> 4
		*/
		
		System.out.println("|");
		System.out.println(12|5);
		System.out.println(Integer.toBinaryString(12)+"|"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12|5));// 2���� ���ڿ�
		/*
		 |	-> �ϳ��̻��� 1�̸� 1
			12    |	5    -> 13
			   1100   
			|     101
			    1101    ->  13 
		 
		 */
		
		System.out.println("^");
		System.out.println(12^5);
		System.out.println(Integer.toBinaryString(12)+"^"+Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(12^5));// 2���� ���ڿ�
		/*
		^	-> ���� �ٸ��� 1
		12    ^	5    -> 9
		   1100   
		^    101
		    1001    ->  9
		*/
		
		
		
		
	}
}
