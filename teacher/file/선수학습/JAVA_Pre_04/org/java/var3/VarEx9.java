package org.java.var3;

public class VarEx9 {

	public static void main(String[] args) {
		System.out.println("����ȯ");
		
		byte b=127;// -2^7~+2^7-1 (-128~+127)
		System.out.println(b);
		
		// -128~+127  
		//-> �ִ밪���� ������ �����(Ŀ����) ���->�����÷ο�
		//-> �ּҰ��Ʒ��� ������ �����(�۾�����) ���-> ����÷ο�
		
		b=(byte)(b+1);// 127+1	-> 127���� 1ũ�� �ּҰ�(-128)�� ��ȯ	
		System.out.println(b);
		
		b=(byte)129;// 127+1+1	-> 127���� 2ũ�� -127�� ��ȯ	
		System.out.println(b);
		
		
		b=(byte)-128;
		System.out.println(b);
		
		b=(byte)-129;// -128-1 -> -128���� 1������ �ִ�(+127) ��ȯ
		System.out.println(b);
				
		b=(byte)-130;// -128-1-1 ->-128���� 2������ +126 ��ȯ
		System.out.println(b);
		
		// ���ڿ�+����(�Ǽ�) -> ���ڿ�+���ڿ�-> ���ڿ�
		// ����+����+���ڿ�  -> ���� ���� ���� ���� ���� 1.(��+��),2.����+���ڿ�,3.���ڿ�
		
		System.out.println("100"+100);// "100"+"100"-> "100100"
		System.out.println(100+100+"100");//200+"100"->"200100"
		System.out.println(100+"100"+100+100);//"100100"+100+100
		System.out.println(100+"100"+(100+100));//"100100"+200-> "100100200"
		
		System.out.println("==========================");
		
		System.out.println(1.5+1.4);
		double b4= 1.5+1.4;
		System.out.println((int)1.5+1.4);
		double b5=(int)1.5+1.4;
		System.out.println(1.5+(int)1.4);
		double b6=1.5+(int)1.4;
		
		System.out.println((int)1.5+(int)1.4);
		int i4=(int)1.5+(int)1.4;		
		System.out.println(i4);
		double d7=(int)1.5+(int)1.4; //doble=int+int -> double
		System.out.println(d7);
		int i5= (int)1.5+(int)1.4;// int=int+int -> int
		
		
		int sum=55+100+63;
		System.out.println(sum);
		
//		int avg=sum/3;
		double avg=(double)sum/3;
		System.out.println(avg);
		
		
	}
}
