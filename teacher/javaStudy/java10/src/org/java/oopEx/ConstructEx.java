package org.java.oopEx;

public class ConstructEx {

	//ConstructExŬ������ �ɹ�
	//�ʵ�
	private int num1;
	private int num2;
	
	//NoArgsConstruct
	public ConstructEx() {
		System.out.println("�⺻������");
	}
					//�Ű����� -> ��������
	public ConstructEx(int num1) {
		this.num1=num1;
	}
	//AllArgsConstruct
	public ConstructEx(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	
}
