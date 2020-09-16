package com.test;
import com.homework.Phone;

public class Main {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setScreenSize(9.7f);
		p.setBrand("IPhone");
		p.setCpu("A11");
		p.setMemory(128);
		p.getBrand();
		p.getScreenSize();
		p.getCpu();
		p.getMemory();
	}
}
