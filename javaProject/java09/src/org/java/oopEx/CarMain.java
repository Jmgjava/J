package org.java.oopEx;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Car car2 = new Car();
		car2.setCarName("���");

		// setters, getters
		Car car = new Car("����", 12000, 2022);
		System.out.println(car.getCarName());

		//
		Scanner scn = new Scanner(System.in);
		// ���� ��� ���α׷�
		System.out.println("�ڵ��� �̸�: ");
		String carName = scn.next();

		System.out.println("�ڵ��� �߷�: ");
		int carWeight = scn.nextInt();

		System.out.println("�ڵ��� ����: ");
		int carYear = scn.nextInt();

		Car car3 = new Car(carName, carWeight, carYear);

		String info = car3.toString();

		System.out.println(info);

		scn.close();

	}

}
