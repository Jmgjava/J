package org.java.loopEx;

public class LoopEx {

	public static void main(String[] args) {
		System.out.println("break, continue");
		
		System.out.println("break");
		for(int i=0;i<10;i++) {
			System.out.println("i-> "+i);
//			if(i==5) break;// 5-> breakX
			if(i>=5) break;// 5-> breakX
			System.out.print(i+" ");
		}//break
		
		System.out.println();
		System.out.println("continue");
		
		for(int i=0;i<10;i++) {
			System.out.println("i-> "+i);
//			if(i==5) continue;	// continue���� X		
			if(i>=5) continue;	// continue���� X		
			System.out.print(i+" ");
		}//continue 
		
	}
}
