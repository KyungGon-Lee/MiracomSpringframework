package com.spring.miracom;

public class HanTire extends Tire{
	public HanTire(String name) {
		super(name);
	}
	
	public String getName() {
		return "[[" + super.getName() + "]]";
	}

}
