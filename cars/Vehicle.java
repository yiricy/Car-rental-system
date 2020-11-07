package com.xsb.cars;


import java.util.Random;
import java.util.Scanner;
import java.util.UUID;


/**
 * 机动车类
 * @author yiricy
 * @date 2020年11月7日
 */
public class Vehicle {
	private String brand;//品牌
	private String info;//信息
	private int day;//租赁天数
	private String licenseNum;//车牌号
	private double price;//每天的租金
	
	
	
	
	//选择品牌，待重写
	public void selectBrand() {
	}
	
	//选择其他信息，待重写
	public void selectOtherInfo() {
	}
	
	//选择租用天数
	public void selectDays() {
		System.out.print("请输入您要租赁的天数：");
		Scanner sc = new Scanner(System.in);
		this.setDay(sc.nextInt());
	}
	//费用计算器
		public void costCalr() {
			double cost = this.getDay() * this.getPrice();
			System.out.println("您需要支付的租赁费用是：" + cost + "元");
		}

	
	
	//随机生成车牌号
	public void randomLicNum() {
		
		String[] fristChar = {"京" , "沪" , "皖" , "浙"};
		String[] SecondChar = {"A" , "B" , "C" , "D" , "E"};
		
		//生成一个5位数的字母数字字符串
		UUID randomUUID = UUID.randomUUID();
		String substring = randomUUID.toString().replace("-", "").substring(0, 5).toUpperCase();
		
		
		
		//生成1到5随机数
		Random random = new Random();
		int nextInt = random.nextInt(5);
		int nextInt1 = random.nextInt(4);
		
		
		System.out.println("分配给您的汽车牌号是：" + fristChar[nextInt1] + SecondChar[nextInt] + " " + substring);
		
		
	}
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
