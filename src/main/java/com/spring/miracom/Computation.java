package com.spring.miracom;

public class Computation {
	
	public long fibo(int n) {
		long start = System.currentTimeMillis();
		if (n <= 1) return n;
		else return fibo(n-1) + fibo(n-2);
	}
}
