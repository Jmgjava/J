package org.java.oopEx;

public class Car {

	public String carName;
	public int carYear;
	public int carWeight;

	public void carMethod(String carName, int carYear, int carWeight) {

		System.out.println("�� �̸�: " + carName);
		System.out.println("���۳⵵: " + carYear);
		System.out.println("��ⷮ: " + carWeight);
	}

	public String carMethod2(String carName, int carYear, int carWeight) {

		String result = "���̸�: " + carName + ", " + "������: " + carYear + ", " + "����ⷮ: " + carWeight;
		
		return result;
	}

}
