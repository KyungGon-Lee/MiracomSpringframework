package com.spring.miracom.aop;

import java.util.HashMap;

public class Computation2 {
	
	public void test() {
		System.out.println("test.....");
	}
	
	public void transactionTest1() throws Exception{
		System.out.println("sql call #1");		
	}
	
	public void transactionTest2() throws Exception {
		throw new Exception("error");
	}
	

}
