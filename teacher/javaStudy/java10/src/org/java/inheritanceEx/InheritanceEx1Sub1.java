package org.java.inheritanceEx;

public class InheritanceEx1Sub1 extends InhertanceEx1 {

	public int num5;
	public int num6;
	
	public void sub1() {
		System.out.println("sub1�ż���");
	}
	
	// �θ��� �ż��带 �̸��� �����ϰ� ������ �ٸ� ǥ�� �ϰ� �ʹ�
	// �������̵�(Overriding)
	// �������̵�(Override) -> ����� ���ؼ� ������
	@Override
	public void superM1() {
		// TODO Auto-generated method stub
		super.superM1();
	}
	
	
	public static void main(String[] args) {
		
		//i1-> Object�ɹ�+InhertanceEx1�ɹ�
		InhertanceEx1 i1= new InhertanceEx1();
		i1.num1=10;
		i1.num2=20;
		i1.num3=30;
		i1.superM1();
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());
		
		InheritanceEx1Sub1 i2= new InheritanceEx1Sub1();
		i2.num1=20;
		i2.num2=30;
		i2.num3=20;		
		i2.num5=20;
		i2.num6=30;
		i2.superM1();
		System.out.println(i2.toString());
		System.out.println(i2.hashCode());
		
		
		
		
	}
	
}
