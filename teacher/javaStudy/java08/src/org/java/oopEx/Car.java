package org.java.oopEx;

public class Car {

	public String carName;
	public int carYear;
	public int weight;

	public void carMethod(String carName, int carYear, int weight) {

		System.out.println("���̸�: " + carName);
		System.out.println("�����: " + carYear);
		System.out.println("����ⷮ: " + weight);
//		return;
	}

	public String carMethod2(String carName, int carYear, int weight) {
		String result = "���̸�: " + carName + ", �����: " + carYear + "����ⷮ: " + weight;

		return result;
	}

}
