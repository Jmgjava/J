package org.java.arayEx;

public class lottoEx {

	public static void main(String[] args) {

		// 섞어 주어야 한다. -> 인덱스를 랜덤하게 추출(선택,조회)
		// 6개의 숫자를 뽑아서 정렬

		System.out.println("로또");

		// 1~45 까지 정수값 저장
		int[] lotto = new int[45];

		int temp = 0;// 임시저장

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

//			if(i%15==0) System.out.println();
//			System.out.print(lotto[i]+" ");

			int index = (int) (Math.random() * lotto.length);

			// 배열의 데이터를 교환하는 방법 -> 섞어주기
			temp = lotto[index];// 랜덤 index값을 temp에 넣음
			lotto[index] = lotto[0];// 0번지 값을 랜덤 인덱스(index) 값으로 초기화
			lotto[0] = temp; //
		}

		System.out.println("섞은 후에 출력");

		for (int i = 0; i < lotto.length; i++) {
			if (i % 15 == 0)
				System.out.println();
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		System.out.println("로또 번호 출력");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}

	}
}
