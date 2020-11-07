package com.xsb.cars;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("*********欢迎使用汽车租赁系统*********");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1、客车 2、轿车 3、卡车");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				Vehicle bus = new Bus();
				bus.selectBrand();
				bus.selectOtherInfo();
				bus.selectDays();
				bus.randomLicNum();
				bus.costCalr();
				return;
			case 2:
				Vehicle car = new Car();
				car.selectBrand();
				car.selectOtherInfo();
				car.selectDays();
				car.randomLicNum();
				car.costCalr();
				return;
			case 3:
				Vehicle truck = new Truck();
				truck.selectBrand();
				truck.selectOtherInfo();
				truck.selectDays();
				truck.randomLicNum();
				truck.costCalr();
				return;

			default:
				System.out.println("请输入正确指令");
				break;
			}
			
		}
		
		
	}
}
