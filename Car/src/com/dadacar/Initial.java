package com.dadacar;

import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		System.out.println("欢迎进入答答租车系统！");
		System.out.println("您是否需要租车：1是 0否");
		Scanner scan = new Scanner(System.in);
		int use = scan.nextInt();
		
		if(use == 1) {
			System.out.println("请选择您车型：");
			Car[] cars = {new PassengerCar("福特客车", 2000, 4), new TruckCar("东风货车", 500, 20), new Pickup("长城皮卡", 800, 2, 5)};
			for(Car car: cars) {
				
				if(car instanceof PassengerCar) {
					System.out.println("品牌：" + car.getName() + "\t" + "载人：" +  ((PassengerCar) car).getCountPeople() + "人" + "\t\t" + "费用：" + ((PassengerCar) car).getCash() +"元/天");
				}
				if(car instanceof TruckCar) {
					System.out.println("品牌：" + car.getName() + "\t" + "载货：" +  ((TruckCar) car).getWeight() + "吨" + "\t\t" + "费用：" + ((TruckCar) car).getCash() +"元/天");
				}
				if(car instanceof Pickup) {
					System.out.println("品牌：" + car.getName() + "\t" + "载人：" +  ((Pickup) car).getCountPeople() + "人" + "\t" + "载货：" + ((Pickup) car).getWeight() + "吨"  + "\t" + "费用：" + ((Pickup) car).getCash() +"元/天");
				}
			}
			System.out.println("请选择你要租车的数量：");
			Scanner sc = new Scanner(System.in);
			int mountCar = sc.nextInt();
			Car[] choiceCar = new Car[mountCar];
			for(int i=0;i<mountCar;i++) {
				System.out.println("请选择第" + (i+1) + "辆车的序号");
				int carNumber = sc.nextInt();
				choiceCar[i] = cars[carNumber-1];
			}
			System.out.println("请输入您要租汽车的天数：");
			int totalDays = scan.nextInt();
			int totalCash = 0;
			int totalLoadWeight = 0;
			int totalCountPeople = 0;
			
			for(Car car: choiceCar) {
				if(car instanceof PassengerCar) {
					totalCash += car.getCash();
					totalCountPeople += ((PassengerCar) car).getCountPeople();
				}
				if(car instanceof TruckCar) {
					totalCash += car.getCash();
					totalLoadWeight += ((TruckCar) car).getWeight();
				}
				if(car instanceof Pickup) {
					totalCash += car.getCash();
					totalCountPeople += ((Pickup) car).getCountPeople();
					totalLoadWeight += ((Pickup) car).getWeight();
				}
			}
			System.out.println("租车总载重：" + totalLoadWeight);
			System.out.println("租车总载人数：" + totalCountPeople);
			System.out.println("租车总金额：" + totalCash);
		}else if (use == 0){
			System.out.println("再见！");
		} else {
			System.out.println("您输入的有误");
		}
		scan.close();
		

	}

}
