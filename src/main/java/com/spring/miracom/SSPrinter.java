package com.spring.miracom;

public class SSPrinter implements Printer {
	
	@Override
	public void print(String str) {
		System.out.println("[SS]" + str);
	}
}
