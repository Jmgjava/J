package org.java.varEx;

public class VarEx1 {

	public static void main(String[] args) {
		System.out.println("����");
		//1. �ּҰ�
		//2. �ּҰ� ���� �ϴ� ��
		//3. ������ Ÿ�԰� �������� Ÿ���� ��ġ �ؾߵȴ�. 
		
		System.out.println("�ڹ��� �⺻�ڷ���(Primitive Type)");
		//������ �ڷ���(Ÿ��) -> 10 �⺻�� int
		// byte b; b=10;
		byte b=10;// byte�� ���� b�� �����ϰ� byte�� ���� 10���� �ʱ�ȭ �ߴ�. 1byte
		short s=10;//short�� ���� s�� �����ϰ� short�� ���� 10���� �ʱ�ȭ �ߴ�. 2byte
		int i=10;// int�� ���� i�� �����ϰ� int�� ���� 10���� �ʱ�ȭ �ߴ�. 4byte
		long l=10;//long�� ���� l�� �����ϰ� long�� ���� 10���� �ʱ�ȭ �ߴ�. 8byte
		
		//�Ǽ��� �ڷ���(Ÿ��) -> 1.1 �⺻ double(8byte)
		// (float)1.1 -> ���� ����ȯ
		float f=1.1f;//float�� ���� f�� �����ϰ� float�� �Ǽ�1.1���� �ʱ�ȭ �ߴ�.4byte
		double d=1.1;//double�� ���� d�� �����ϰ� double�� �Ǽ�1.1���� �ʱ�ȭ �ߴ�.8byte
		
		//������ �ڷ���(char) -> '', �ѱ���
		char ch='a';//char�� ���� ch�� �����ϰ� char�� ���� 'a'���� �ʱ�ȭ �ߴ�. 2byte
		boolean bool=false;//boolean�� ���� bool�� �����ϰ� boolean�� false�� �ʱ�ȭ �ߴ�. 1byte
				
		
		
	}
}
