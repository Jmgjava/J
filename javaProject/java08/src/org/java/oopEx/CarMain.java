package org.java.oopEx;

public class CarMain {

	public static void main(String[] args) {

		Car hCar = new Car();
		hCar.carName = "HCar";
		hCar.carYear = 2002;
		hCar.carWeight = 15000;

		System.out.println("�� �̸�: " + hCar.carName);
		System.out.println("���۳⵵: " + hCar.carYear);
		System.out.println("��ⷮ: " + hCar.carWeight);

		Car mCar = new Car();
		mCar.carName = "MCar";
		mCar.carYear = 2020;
		mCar.carWeight = 21000;

		System.out.println("�� �̸�: " + mCar.carName);
		System.out.println("���۳⵵: " + mCar.carYear);
		System.out.println("��ⷮ: " + mCar.carWeight);

		Car car = new Car();

		car.carMethod("Car", 2024, 10000);

		Car bCar = new Car();

		car.carMethod("bCar", 1999, 12000);

		String result = car.carMethod2("cCar", 2010, 14400);
		System.out.println(result);
	}

}
