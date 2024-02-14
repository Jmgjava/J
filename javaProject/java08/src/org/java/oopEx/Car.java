package org.java.oopEx;

public class Car {

	public String carName;
	public int carYear;
	public int carWeight;

	public void carMethod(String carName, int carYear, int carWeight) {

		System.out.println("차 이름: " + carName);
		System.out.println("제작년도: " + carYear);
		System.out.println("배기량: " + carWeight);
	}

	public String carMethod2(String carName, int carYear, int carWeight) {

		String result = "차이름: " + carName + ", " + "차연식: " + carYear + ", " + "차배기량: " + carWeight;
		
		return result;
	}

}
