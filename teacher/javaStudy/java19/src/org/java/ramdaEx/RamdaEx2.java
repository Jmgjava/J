package org.java.ramdaEx;

interface In2 {
	int m2();
}

interface In3 {
	int cal(int num1, int num2);
}

public class RamdaEx2 {
	public static void main(String[] args) {

		In3 i0 = new In3() {
			@Override
			public int cal(int num1, int num2) {
				return num1 + num2;
			}
		};
		int sum1 = i0.cal(100, 200);
		System.out.println(sum1);
		
		//�������̽� �����ż����� �Ű������� ���� �ϸ�
		In3 i01=(int num1, int num2)->{		
			System.out.println("���ٽ� ����");
			return num1+num2;			
		};
		int sum2=i01.cal(100, 300);
		System.out.println(sum2);
		
		
		In2 i2 = new In2() {
			@Override
			public int m2() {
				return 0;
			}
		};
		int rs1 = i2.m2(); // ��ȯ(return)�� int
		System.out.println(rs1);

		In2 i3 = () -> {
			return 10;
		};
		int rs2 = i3.m2();
		System.out.println(rs2);

	}
}
