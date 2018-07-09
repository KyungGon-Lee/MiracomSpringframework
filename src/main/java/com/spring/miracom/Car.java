package com.spring.miracom;
import java.util.Date;

public class Car {
	String name;
	String color;
	Date date;
	
	Tire t0 = new Tire("basic 0");
 	Tire t1 = new Tire("basic 1");
	Tire t2 = new Tire("basic 2");
	Tire t3 = new Tire("basic 3");
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car(String name, String color,
		Tire t0, Tire t1, Tire t2, Tire t3) {
		this.name = name;
		this.color = color;
		this.date = new Date();
		this.t0 = t0;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInfo() {
		return name + "," + color + "/" 
			+  t0.getName() + "," + t1.getName() + ","
			+  t2.getName() + "," + t3.getName();
	}

}
