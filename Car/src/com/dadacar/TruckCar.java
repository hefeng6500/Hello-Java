package com.dadacar;

/*
 * 定义货车类
 * */
public class TruckCar extends Car {
	int loadWeight;
	
	public TruckCar(String name, int cash, int loadWeight) {
		this.name = name;
		this.cash = cash;
		this.setWeight(loadWeight);
	}
	
	public void setWeight(int loadWeight) {
		this.loadWeight = loadWeight;
	}
	public int getWeight() {
		return loadWeight;
	}
}