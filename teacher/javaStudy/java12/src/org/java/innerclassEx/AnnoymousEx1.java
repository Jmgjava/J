package org.java.innerclassEx;

interface In1 {
	void m1();
}

interface In2 {
	void m2();
}

interface In3 extends In1, In2 {
	void m3();
}

class In1Sub implements In1 {
	@Override
	public void m1() {
		System.out.println("m1����");
	}
}

class InterMain implements In3 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}

}

public class AnnoymousEx1 {

	public static void main(String[] args) {
		// annoymouse class -> �͸�(����) Ŭ����(�̸��̾��� Ŭ����)
		// �ϳ��� �ϸ� �Ѵ�. -> ������ü ��� ���

		In1 in1 = new InterMain();
		In2 in2 = new InterMain();
		In3 in3 = new InterMain();

		In1Sub insub1 = new In1Sub();
		insub1.m1();

//		new  �����Һθ�Ÿ��(�������̽�,Ŭ����,�߻�Ŭ����);

		In1 in12 = new In1() {
			// �������̵�(�������̽�)
			@Override
			public void m1() {
				System.out.println("anomymousŬ����(�͸�Ŭ����) ����");
			}
		};
		in12.m1();

		// In2����
		In2 i22 = new In2() {
			@Override
			public void m2() {
				System.out.println("anomymousŬ���� m1����");
			}
		};
		i22.m2();

		System.out.println("�͸�Ŭ���� �̿�");
		// In3
		In3 in33 = new In3() {

			@Override
			public void m2() {
				System.out.println("m2");
			}

			@Override
			public void m1() {
				System.out.println("m1");
			}

			@Override
			public void m3() {
				System.out.println("m3");

			}
		};
		in33.m1();
		in33.m2();
		in33.m3();

	}
}
