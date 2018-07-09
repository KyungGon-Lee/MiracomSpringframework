package com.spring.miracom;

public class Truck extends Car{
	public Truck(String name, String color) {
		super(name, color);
	}
	public String getInfo() {
		return "[Truck]" + name + "," + color + "," + date;
	}

}
