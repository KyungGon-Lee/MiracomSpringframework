package com.spring.miracom;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PrinterServiceTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
		new GenericXmlApplicationContext("di.xml");		
		PrinterService svr = (PrinterService)ctx.getBean("printer");			
		svr.print("hello~~~~");
	}
}
