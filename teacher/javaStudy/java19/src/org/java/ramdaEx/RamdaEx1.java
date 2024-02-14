package org.java.ramdaEx;

interface In1 {
	void m1();
}

class In1Sub implements In1 {
	@Override
	public void m1() {
		System.out.println("m1�������̵�");
	}
}

public class RamdaEx1 {

	public static void main(String[] args) {
		// ������ü �̿��ؼ� m1�ż��� ����
		In1Sub i1 = new In1Sub();
		i1.m1();

		// ����Ŭ���� �������̽� ����
		In1 i2 = new In1() {
			@Override
			public void m1() {
				System.out.println("�͸�Ŭ���� �̿�(m1�������̵�)");
				
			}
		};
		i2.m1();

		// ���ٽ�
		// new �������̽�()
		In1 i3 = () -> {
			// �����Լ���-> ���ٽ� , ȭ��ǥ(arrow)
			System.out.println("���ٽ����� m1�ż��带 ����");
		};
		i3.m1();

	}

}
