package com.spring.miracom;
import java.util.ArrayList;

public class PrinterService {
	public void print(String string) {
	Printer printer = new SSPrinter();
	PrinterService svr = new PrinterService();
	svr.setPrinter(printer);
	svr.print("hello~~~~");
	
	ArrayList<Printer> p = new ArrayList<Printer>();
	p.add(new LGPrinter());
	p.add(new SSPrinter());
	svr.setPrinters(p);
	svr.print("hello~~~~");

	PrinterService svr = new PrinterService();
	
		
	}

	
}
