package com.spring.miracom;

public class LGPrinter implements Printer {
	
	@Override
	public void print(String str) {
		System.out.println("[LG]" + str);
	}

}
