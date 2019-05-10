package com.dadacar;

/*
 * 定义客车类
 * */
public class PassengerCar extends Car {
	int countPeople;

	public PassengerCar(String name, int cash, int countPeople) {
		this.name = name;
		this.cash = cash;
		this.setCountPeople(countPeople);
	}
	
	public int getCountPeople() {
		return countPeople;
	}
	public void setCountPeople(int countPeople) {
		this.countPeople = countPeople;
	}
	
}
