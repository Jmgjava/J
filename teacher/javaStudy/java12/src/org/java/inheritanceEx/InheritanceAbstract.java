package org.java.inheritanceEx;

abstract class Ab1{
	int a;
	// �߻�ż���(�̿ϼ�) -> �ݵ�� �������̵� ����
	abstract void ab(); 
	void m1() {
		System.out.println("m1 �Ϲݸż���");
	}
}

class Ab1Sub1 extends Ab1{
	int b;
	@Override
	void m1() {
		System.out.println("�θ� ���� �ż���  m1");
	}
	@Override
	void ab() {
		System.out.println("�߻�ż��� �ݵ�� ����");		
	}	
}
public class InheritanceAbstract {

	public static void main(String[] args) {
		
//		new Ab1();
		// ������ �̿�
		Ab1 ab1= new Ab1Sub1();
		ab1.a=10;
		ab1.ab();
		ab1.m1();
		
		Ab1Sub1 ab1sub1=new Ab1Sub1();
		ab1sub1.a=10;
		ab1sub1.b=20;
		ab1sub1.ab();
		ab1sub1.m1();
		
		
		
	}
}