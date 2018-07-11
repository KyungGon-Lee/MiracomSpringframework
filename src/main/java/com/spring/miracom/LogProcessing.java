package com.spring.miracom;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogProcessing {
	
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("before");
		Object out = (String)joinPoint.proceed();
		System.out.println("after");
		return out;
	}

}
