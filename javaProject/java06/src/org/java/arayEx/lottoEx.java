package org.java.arayEx;

public class lottoEx {

	public static void main(String[] args) {

		// ���� �־�� �Ѵ�. -> �ε����� �����ϰ� ����(����,��ȸ)
		// 6���� ���ڸ� �̾Ƽ� ����

		System.out.println("�ζ�");

		// 1~45 ���� ������ ����
		int[] lotto = new int[45];

		int temp = 0;// �ӽ�����

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

//			if(i%15==0) System.out.println();
//			System.out.print(lotto[i]+" ");

			int index = (int) (Math.random() * lotto.length);

			// �迭�� �����͸� ��ȯ�ϴ� ��� -> �����ֱ�
			temp = lotto[index];// ���� index���� temp�� ����
			lotto[index] = lotto[0];// 0���� ���� ���� �ε���(index) ������ �ʱ�ȭ
			lotto[0] = temp; //
		}

		System.out.println("���� �Ŀ� ���");

		for (int i = 0; i < lotto.length; i++) {
			if (i % 15 == 0)
				System.out.println();
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		System.out.println("�ζ� ��ȣ ���");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}

	}
}
