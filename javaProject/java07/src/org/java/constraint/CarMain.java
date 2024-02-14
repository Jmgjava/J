package org.java.constraint;

public class CarMain {

	public static void main(String[] args) {
		// 공통, 변경 불가 -> static final 작성**
		System.out.println("제작년도: " + CarCommon.CARYEAR);
		System.out.println("자동차명: " + CarCommon.CARNAME);
		System.out.println("배기량: " + CarCommon.CARWEIGHT);
		System.out.println("제작사: " + CarCommon.PJNAME);
		
		//엔진
		CarEn cn1 = new CarEn();
		cn1.enName = "en1";
		cn1.enWeight = 100;
		cn1.enCoin = 20000;
		// 본네트
		CarB cb1 = new CarB();
		cb1.bName = "cb1";
		cb1.bwidth = 200;
		cb1.bCoin = 18000;
		// 문
		CarD cd1 = new CarD();
		cd1.dName = "cd1";
		cd1.dweight = 170;
		cd1.dCoin = 30000;
		// 바퀴
		CarH ch1 = new CarH();
		ch1.hName = "ch1";
		ch1.hWidth = 110;
		ch1.hCoin = 12000;
		
		System.out.println("엔진 사양: "+cn1.enName+","+cn1.enWeight+","+cn1.enCoin);
		System.out.println("엔진 사양: "+cb1.bName+","+cb1.bwidth+","+cb1.bCoin);
		System.out.println("엔진 사양: "+ch1.hName+","+ch1.hWidth+","+ch1.hCoin);
		System.out.println("엔진 사양: "+cd1.dName+","+cd1.dweight+","+cd1.dCoin);

	}
}
