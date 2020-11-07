package com.xsb.cars;

import java.util.Scanner;

/**
 * 轿车类
 * @author yiricy
 * @date 2020年11月7日
 */
public class Car extends Vehicle {
	

	@Override
	public void selectBrand() {
		System.out.print("请选择您要租用的品牌:1、别克 2、宝马");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		while (true) {
			
			if (nextInt == 1) {
				this.setBrand("别克");
				break;
			}else if(nextInt == 2){
				this.setBrand("宝马");
				break;
			}else {
				System.out.println("请输入正确指令");
				continue;
			}
		}
		
		
		
	}

	
	@Override
	public void selectOtherInfo() {
		Scanner sc = new Scanner(System.in);
		int nextInt = 0;
		while (true) {
			if (this.getBrand().equals("别克")) {
				System.out.print("请选择您要租用的型号: 1、别克GL8 2、英朗 ");
				nextInt = sc.nextInt();
				if (nextInt == 1) {
					this.setPrice(300);
					break;
				}else if(nextInt == 2) {
					this.setPrice(200);
					break;
				}else {
					System.out.println("请输入正确指令");
				}
				
			}else if(this.getBrand().equals("宝马")){
				System.out.print("请选择您要租用的型号: 1、X6 2、550i ");
				nextInt = sc.nextInt();
				if (nextInt == 1) {
					this.setPrice(350);
					break;
				}else if(nextInt == 2) {
					this.setPrice(450);
					break;
				}else {
					System.out.println("请输入正确指令");
					continue;
				}
			}else {
				System.out.println("请输入正确指令");
				continue;
			}
		}
		
		
	}


	
	

	
	

	
}
