package org.java.inheritanceEx;

public class CarCommon {

	private String carName;
	private int carCoin;
	private int carYear;

	//NoArgsConstruct 기본생성자
	public CarCommon() {
		// TODO Auto-generated constructor stub
	}
	
	// AllArgsContstruct
	public CarCommon(String carName, int carCoin, int carYear) {
		super();
		this.carName = carName;
		this.carCoin = carCoin;
		this.carYear = carYear;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarCoin() {
		return carCoin;
	}

	public void setCarCoin(int carCoin) {
		this.carCoin = carCoin;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

}
