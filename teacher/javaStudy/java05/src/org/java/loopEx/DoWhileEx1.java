package org.java.loopEx;

public class DoWhileEx1 {

	public static void main(String[] args) {
		System.out.println("do~while");
		// 반드시 한번은 실행 해야되는 경우
		int i=0;

		do{
			i++;
			System.out.print(i);
			
		}while(i<10);
		
		System.out.println();
		
		//구구단		
		System.out.println("구구단");
		//2~9단
		int i2=2;
		do {
			
			System.out.println(i2+"단입니다");
			int j=1;			
			do {
				System.out.print(i2+"*"+j+"="+(i2*j)+" ");
				j++;
			}while(j<10);
			
			System.out.println();
			i2++;
			
		}while(i2<10);	
		
		

	}
}
