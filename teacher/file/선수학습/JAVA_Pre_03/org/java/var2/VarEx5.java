package org.java.var2;

public class VarEx5 {

	public static void main(String[] args) {
		System.out.println("����");
		System.out.println("��ü��������");
		
		int i=10;// �������� �����ϰ� ����Ҽ� ����.
		i=100;
		
		//int i=20; // ���� �������� �����̸� ������ �ȵȴ�.
		
					//new ��ü����������-> ��ü�� �ּһ���
		String str1=new String("���ڿ�1");
		//   str1->��ü��������(������ ��ü�� �ּҰ��� ����)
		
		char ch1=str1.charAt(1);// ���ڿ�(str1)�� �ε����� 1���� �ش��ϴ� ���� -> ��
		int len=str1.length(); // ���ڿ��� ����
		
		System.out.println("���ڿ��� ����: "+str1.length());
		System.out.println("���ڿ� �ε��� 1���� ����: "+str1.charAt(1));
		
		String str2="���ڿ�1";
		System.out.println("���ڿ��� ����: "+str2.length());
		System.out.println("���ڿ� �ε��� 1���� ����: "+str2.charAt(1));
	
		System.out.println(str1==str2);//str1�ּҰ�==str2�ּҰ�
		
		// str1.equals(str2) -> ���ڿ��� ���� �� 
		boolean bool=str1.equals(str2);
		System.out.println("str1.equals(str2) -> ����� "+bool);
		
		System.out.println("���̵�1".equals("���̵�1"));
		
		String userId=new String("m111");// �α��� ���̵� "m111"
		String inputId="m111";
		
		System.out.println( inputId.equals(userId));// ���ڿ��� ���� ��-> �α���,,,,
		
		System.out.println(inputId==userId); // �ּҰ���-> ���� ��� ����.
		
		System.out.println("=========================");
		
		
		String java1= new String("JAVA");
		String java2= new String("JAVA");
		
		System.out.println(java1==java2);
		System.out.println(java1.equals(java2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}
}
