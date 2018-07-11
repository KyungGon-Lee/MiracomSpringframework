package com.spring.miracom;
import java.util.ArrayList;

public class PrinterService {
	
	ArrayList<Printer> printers = new ArrayList<Printer>();
	
	public void setPrinter(Printer printer) {
		printers.clear();
		printers.add(printer);
	}
	public void setPrinters(ArrayList<Printer> printers) {
		this.printers = printers;
	}
	public void print(String str) {
		for(int i = 0; i < printers.size(); i++) {
			printers.get(i).print(str);
		}
	}
	
}
