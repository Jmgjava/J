package org.java.loopEx;

public class LoopEx {
	public static void main(String[] args) {
		System.out.println("break, continue");

		for (int i = 0; i < 10; i++) {
			if(i==5) break; // break 이후 명령문 X 멈춤
			System.out.print(i+" ");
		}// break;
		System.out.println();
		
		System.out.println("continue");
		for (int i = 0; i < 10; i++) {
			System.out.println("i-> "+i);
			if(i>=5) continue; // continue 이후 명령문 X  다시 돌아감
			System.out.print(i+" ");
		} // continue;
		
	}

}
