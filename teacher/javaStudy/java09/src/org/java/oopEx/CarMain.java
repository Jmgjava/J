package org.java.oopEx;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCarName("HCar");
		car1.setWeight(2000);
		car1.setYear(2024);

		// setters,getters
		Car car2 = new Car("CCar", 3000, 2404);
		car2.setCarName("ACar");

//		new Car().toString();

		//
		Scanner scn = new Scanner(System.in);
		// 차량등록 프로그램
		System.out.print("자동차이름: ");
		String carName = scn.next();

		System.out.print("자동차중량: ");
		int carWeight = scn.nextInt();

		System.out.print("자동차년식: ");
		int carYear = scn.nextInt();

		Car car3 = new Car(carName, carWeight, carYear);

		String info = car3.toString();

		System.out.println(info);

	}
}
