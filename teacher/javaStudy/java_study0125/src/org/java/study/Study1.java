package org.java.study;

interface In1{	
	void ab1(); // �������� �̿��ؼ� ������Ʈ �۾� ȿ�������� ����
}
class In1Sub implements In1{
	// ������ -> �ϳ��� �̸����� ���� ���� ����?
	//����� ���ؼ� �θ��� �ż��带 ������ ���α׷��� ���(�������̵�)
	@Override
	public void ab1() {
		System.out.println("�߻�ż���-> �������̵�");
	}	
}
class In1Sub2 implements In1{

	@Override
	public void ab1() {
		System.out.println("�߻�ż���-> �������̵�");
	}
	
}
class A{
	int a;//�ɹ� -> �ʵ�
	static int b;//�ɹ� -> �ʵ�
	// ������ -> �ϳ��� �̸����� ���� ���� ����?
	//�ż����̸� �Ȱ��� �Ű����� �����Ǵ� Ÿ���� �ٸ� ���� ���
	// �����ε�
	//�ɹ� -> ������
	public A() {
		System.out.println("�⺻������");
	}
	public A(int a) {
		this.a=a;
	}
	//�ɹ� -> �ż���
	void m1(int num) { // int num -> �Ű�����(����) -> ��������
		int num2=10;// ��������
		System.out.println("m1");
	}
}

public class Study1 {
	
	int num1;
	int num2;
	static int num3;
	
	public Study1() {
		System.out.println("�⺻"); 
	}
	
	void me1() {
		
	}
	
	public static void main(String[] args) {
		
		new Study1();
		
		System.out.println("java Study");
		//Ÿ��
		int i=10;
		double d=1.1;
		
		A a1=new A();
		A a2=new A();
		
		// �������̽� ��ü�� ���� X new X
		// �ϳ��� �̸�(Ÿ��)���� ������ü�� ���� �Ҽ� �ִ� ���α׷��� ���
		In1 in1=new In1Sub();
		in1=new In1Sub2();
		
				
		
	}
	
}
