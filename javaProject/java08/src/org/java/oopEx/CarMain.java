package org.java.oopEx;

public class CarMain {

	public static void main(String[] args) {

		Car hCar = new Car();
		hCar.carName = "HCar";
		hCar.carYear = 2002;
		hCar.carWeight = 15000;

		System.out.println("차 이름: " + hCar.carName);
		System.out.println("제작년도: " + hCar.carYear);
		System.out.println("배기량: " + hCar.carWeight);

		Car mCar = new Car();
		mCar.carName = "MCar";
		mCar.carYear = 2020;
		mCar.carWeight = 21000;

		System.out.println("차 이름: " + mCar.carName);
		System.out.println("제작년도: " + mCar.carYear);
		System.out.println("배기량: " + mCar.carWeight);

		Car car = new Car();

		car.carMethod("Car", 2024, 10000);

		Car bCar = new Car();

		car.carMethod("bCar", 1999, 12000);

		String result = car.carMethod2("cCar", 2010, 14400);
		System.out.println(result);
	}

}
