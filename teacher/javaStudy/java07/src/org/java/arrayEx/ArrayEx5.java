package org.java.arrayEx;

public class ArrayEx5 {

	public static void main(String[] args) {
		System.out.println("�迭");

		int[] lotto = new int[45];
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;// 1~45 �ʱ�ȭ
		}
		//
		int temp = 0;
		for (int i = 0; i < 1000; i++) {
			int idx = (int) (Math.random() * 45);
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		// ��� �迭�� ��� ��ȸ
		int j = 0;
		for (int i : lotto) {
			j++;
//			if(j%6==0) {
//				System.out.println(i+" ");
//			}else {				
//				System.out.print(i+" ");
//			}
			if (j % 6 == 0) {
				System.out.println(i + " ");
				continue;
			}
			System.out.print(i + " ");
		}// continue
		
		System.out.println();

		System.out.println("�ζ� ��÷ ��ȣ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
