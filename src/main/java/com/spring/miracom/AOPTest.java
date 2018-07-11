package com.spring.miracom;

public class AOPTest {

	public static void main(String[] args) {
		
		Computation cmp = new Computation();
		long r = cmp.fibo(40);
		System.out.println("fibo : " + r);
	}

}
