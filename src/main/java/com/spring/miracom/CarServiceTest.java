package com.spring.miracom;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CarServiceTest {
	public static void main(String[] args) {
//		Car c = new Car("sm5", "red");
//		Car c2 = new Car("sm7", "black");		
//		CarService svr = new CarService(c);
//		svr.park();	
//		GenericXmlApplicationContext ctx =
//		new GenericXmlApplicationContext("di.xml");		
//		System.out.println("###############");		
//		CarService svr = (CarService)ctx.getBean("car3");		
//		svr.park();		
//		ctx.close();
		
//		Car c = new Car("sm5", "red");
//		Car c2 = new Car("sm7", "yellow", 
//				 new Tire("tire 0"), new Tire("tire 1"),
//				 new Tire("tire 2"), new Tire("tire 3"));
//		Car c3 = new Car("sports", "green", 
//				 new Tire("tire 0"), new Tire("tire 1"),
//				 new HanTire("tire 2"), new HanTire("tire 3"));
//		CarService svr = new CarService(c3);
//		svr.park();
//		svr.setCar(c2);
//		svr.park();
//		svr.setCar(c);
//		svr.park();
//		System.out.println(c3.getInfo());
		
		GenericXmlApplicationContext ctx =
		new GenericXmlApplicationContext("di.xml");		
		System.out.println("###############");		
		CarService svrx = (CarService)ctx.getBean("svr2");		
		svrx.park();	
		ctx.close();

	}

}
