package org.java.var;

public class VarEx1 {

	public static void main(String[] args) {
		
		//syso
		System.out.println("����");
		System.out.println("�⺻�ڷ���(Primititve Type");
		
		// ������
		byte b; //byte�� ���� b�� �����ߴ�. 1byte
		b=10;   //byte�� ������ 10�� ���� b�� �ʱ�ȭ �ߴ�.
		System.out.println("byte b="+b); // ���ڿ�""+ ����
		
		short s; //short�� ���� s�� ����, 2byte
		s=10;    //short�� ������ 10�� ����s�� �ʱ�ȭ�ߴ�.
		System.out.println("short s="+s);
		
		int i;//int�� ���� i�� ����, 4byte
		i=10; //int�� ������ 10�� ����i�� �ʱ�ȭ�ߴ�.
		System.out.println("int i="+i);

		long l;// long�� ���� l�� ����, 8byte
		l=10; //long�� ������ 10�� ����l�� �ʱ�ȭ�ߴ�.
		System.out.println("long l="+l);
		
		//�Ǽ���
		float f; // float�� ���� f ����, 4byte
		f=(float)1.1;  //�Ǽ��� �⺻�� double(8byte) ->1.1f, (float)1.1
		System.out.println("float f="+f);
		
		double d;// double�� ���� d ����, 8byte
		d=1.1;   // double�� ������1.1�� ���� d�� �ʱ�ȭ
		System.out.println("double d="+d);
		
		//������
		char ch;// char�� ���� ch�� ����, 2byte
		ch='a';// char�� ������ 'a'�� ���� ch�� �ʱ�ȭ
		System.out.println("char ch="+ch);
		
		//����(true,false)
		boolean bool; // boolean�� ���� bool�� ����, 1byte
		bool=true;    // boolean�� true,false
		System.out.println("boolean bool="+bool);
		
	}
}
