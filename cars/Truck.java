package com.xsb.cars;

import java.util.Scanner;

/**
 * 卡车类
 * @author yiricy
 * @date 2020年11月7日
 */
public class Truck extends Vehicle{


	@Override
	public void selectBrand() {
		
		Scanner sc = new Scanner(System.in);
		int nextInt = 0;
		while (true) {
			System.out.print("请选择您要租用的品牌:1、一汽解放 2、重庆红岩");
			nextInt = sc.nextInt();
			if (nextInt == 1) {
				this.setBrand("一汽解放");
				break;
			}else if(nextInt == 2){
				this.setBrand("重庆红岩");
				break;
			}else {
				System.out.println("请输入正确指令");
			}
		}
		
		
		
	}

	
	@Override
	public void selectOtherInfo() {
		Scanner sc = new Scanner(System.in);
		int nextInt = 0;
		while (true) {
			System.out.print("请选择您要租用的型号: 1、1吨 2、2吨 ");
			nextInt = sc.nextInt();
			if (nextInt == 1) {
				this.setPrice(350);
				break;
			}else if(nextInt == 2) {
				this.setPrice(450);
				break;
			}else {
				System.out.println("请输入正确指令");
			}
				
		}
	}
		

}
