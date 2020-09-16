package com.homework;

public class Phone {
	private float screenSize;
	private String brand;
	private String cpu;
	private int memory;
	public float getScreenSize() {
		System.out.println("屏幕尺寸"+screenSize);
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	public String getBrand() {
		System.out.println("品牌："+brand);
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		System.out.println("CPU:"+cpu);
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getMemory() {
		System.out.println("内存大小："+memory);
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}
