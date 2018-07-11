package com.spring.miracom;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PrinterServiceTest {
	public static void main(String[] args) throws Exception{
		
//		Printer printer = new SSPrinter();
//		PrinterService svr = new PrinterService();
//		svr.setPrinter(printer);
//		svr.print("hello~~~~"); //직접
//		
//		ArrayList<Printer> p = new ArrayList<Printer>();
//		p.add(new LGPrinter());
//		p.add(new SSPrinter());
//		svr.setPrinters(p);
//		svr.print("hello~~~~"); //간접
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("printer.xml");	
		PrinterService svr = (PrinterService)ctx.getBean("printer");			
		svr.print("hello~~~~");
		svr.print("====================");
		svr.print("sum = 7");
		ctx.close();
	}
}
