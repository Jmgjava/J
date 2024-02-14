package org.java.arrayEx;

public class LottoEx {

	public static void main(String[] args) {
		
		System.out.println("lotto");
		
		// 1. 1~45 정수 저장
		int[] lotto=new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;		
			
			if(i%15==0) System.out.println();			
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		int temp=0;// 임지 저장
		
		// 1000번 섞에 준다
		for(int i=0;i<10000;i++) {			
			int index=(int)(Math.random()*45);// 0~44 랜덤 정수
			// 배열의 데이터를 교환하는 방법 -> "섞어준다~"
			temp=lotto[index];// 랜덤인덱스 값을 temp 
			lotto[index]=lotto[0];// 0번지 값을 랜덤인덱스 값으로 초기화
			lotto[0]=temp;			
		}
		
		System.out.println("섞은 후에 출력");
		
		for(int i=0;i<lotto.length;i++) {				
			if(i%15==0) System.out.println();			
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("로또 번호 출력");
		for(int i=0;i<6;i++) {			
			System.out.print(lotto[i]+" ");			
		}
		
	}
}
