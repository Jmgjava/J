package org.java.loopEx;

public class LoopEx {
	public static void main(String[] args) {
		System.out.println("break, continue");

		for (int i = 0; i < 10; i++) {
			if(i==5) break; // break ���� ��ɹ� X ����
			System.out.print(i+" ");
		}// break;
		System.out.println();
		
		System.out.println("continue");
		for (int i = 0; i < 10; i++) {
			System.out.println("i-> "+i);
			if(i>=5) continue; // continue ���� ��ɹ� X  �ٽ� ���ư�
			System.out.print(i+" ");
		} // continue;
		
	}

}
