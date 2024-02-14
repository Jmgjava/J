package org.java.oopEx;

public class Car {

	public String carName;
	public int carYear;
	public int weight;

	public void carMethod(String carName, int carYear, int weight) {

		System.out.println("차이름: " + carName);
		System.out.println("차년식: " + carYear);
		System.out.println("차배기량: " + weight);
//		return;
	}

	public String carMethod2(String carName, int carYear, int weight) {
		String result = "차이름: " + carName + ", 차년식: " + carYear + "차배기량: " + weight;

		return result;
	}

}
