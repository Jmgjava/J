package org.java.loopEx;

public class WhileEx1 {

	public static void main(String[] args) {
		System.out.println("while");
		
		for(int i=0;i<0;i++) {
			System.out.println(i);
		}
		
		int i=0;
		while(i<10) {
			i++;
			if(i==10) {
				// i가 마지막(10)일 경우 
				System.out.println(i);
				break;// while문 종료
			}
			System.out.print(i+",");
		}//break;
		
		System.out.println();
		
		int j=0;
		
		// 무조건 실행
		while(true) {			
			// 1~10 출력
			// if, break
			j++;		
			
			if(j>10)  break;
			
			System.out.print(j);// 1~10
			
		}
		
		
//		System.out.println();
		
//		System.out.println("main종료");
		
	}
}
