package org.java.oopEx;

public class Car {

	private String carName;
	private int weight;
	private int year;

	public Car() {
//		this("", 11, 22);
		System.out.println("기본생성자");
	}

	public Car(String carName, int weight, int year) {
		super();
		this.carName = carName;
		this.weight = weight;
		this.year = year;
	}

	// setters,getters
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		if (carName == null)
			return "조회할 자동차가 없습니다";

		return "자동차이름=" + carName + ", 자동차중량=" + weight + ", 자동차년식=" + year;
	}

}
