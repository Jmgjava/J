package org.java.oopEx;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Car car2 = new Car();
		car2.setCarName("기아");

		// setters, getters
		Car car = new Car("현대", 12000, 2022);
		System.out.println(car.getCarName());

		//
		Scanner scn = new Scanner(System.in);
		// 차량 등록 프로그램
		System.out.println("자동차 이름: ");
		String carName = scn.next();

		System.out.println("자동차 중량: ");
		int carWeight = scn.nextInt();

		System.out.println("자동차 연식: ");
		int carYear = scn.nextInt();

		Car car3 = new Car(carName, carWeight, carYear);

		String info = car3.toString();

		System.out.println(info);

		scn.close();

	}

}
