package com.spring.miracom.aop;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) throws Exception {
		
		
		GenericXmlApplicationContext ctx =	new GenericXmlApplicationContext("aspect.xml");
		
		Computation hc = (Computation)ctx.getBean("hc");
		
		System.out.println(hc.fibo(45));
		System.out.println(hc.fiboCache(45));
		
		Computation2 hc2 = (Computation2)ctx.getBean("hc2");		
		hc2.test();
		
		hc2.transactionTest1();
		hc2.transactionTest2();
		
		
		ctx.close();
		
		
		

	}

}
