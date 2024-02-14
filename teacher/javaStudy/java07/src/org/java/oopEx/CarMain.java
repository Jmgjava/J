package org.java.oopEx;

public class CarMain {

	public static void main(String[] args) {
		// 공통, 변경 불가 -> static final로 작성
		System.out.println("제작사: " + CarCommon.PRNAME);
		System.out.println("제작년도: " + CarCommon.CARYEAR);
		System.out.println("자동차명: " + CarCommon.CARNAME);
		System.out.println("배기중량: " + CarCommon.CARWEIGHT);

		// 자동차1
		// 엔진
		CarEn cn1 = new CarEn();
		cn1.enName = "en1";
		cn1.enWeight = 100;
		cn1.enCoin = 20000;
		// 본넷
		CarB cb1 = new CarB();
		cb1.bName = "cb1";
		cb1.bWeight = 200;
		cb1.bCoin = 100000;
		// 문
		CarD cd1 = new CarD();
		cd1.dName = "cd1";
		cd1.dWeight = 50;
		cd1.dCoin = 100;
		// 휠
		CarH ch1 = new CarH();
		ch1.hName = "ch1";
		ch1.hWidth = 200;
		ch1.hCoin = 10000;

		System.out.println("엔진 사양: 이름:" + cn1.enName + ",중량:" + cn1.enWeight + ",가격:" + cn1.enCoin);
		System.out.println("본넷 사양: 이름:" + cb1.bName + ",중량:" + cb1.bWeight + ",가격:" + cb1.bCoin);
		System.out.println("차문 사양: 이름:" + cd1.dName + ",중량:" + cd1.dWeight + ",가격:" + cd1.dCoin);
		System.out.println("바퀴 사양: 이름:" + ch1.hName + ",중량:" + ch1.hWidth + ",가격:" + ch1.hCoin);

	}
}
