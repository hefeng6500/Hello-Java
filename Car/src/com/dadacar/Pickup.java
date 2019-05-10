package com.dadacar;

/*
 * ∂®“Â∆§ø®¿‡
 * */
public class Pickup extends Car {
	int countPeople;
	int loadWeight;

	public Pickup(String name, int cash, int countPeople, int loadWeight) {
		this.name = name;
		this.setCountPeople(countPeople);
		this.setWeight(loadWeight);
		this.cash = cash;
	}

	public void setCountPeople(int countPeople) {
		this.countPeople = countPeople;
	}

	public int getCountPeople() {
		return countPeople;
	}

	public void setWeight(int loadWeight) {
		this.loadWeight = loadWeight;
	}

	public int getWeight() {
		return loadWeight;
	}
}
