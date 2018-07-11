package com.spring.miracom.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ComputationAdvice {
	

	
	@After("execution(* test*(..))") // 테스트로 시작하는 모든 함수 에 추가 코드 붙음 (..)는 모든 파라미터를 의미함
		public void log(JoinPoint joinPoint) throws Throwable {
			
			System.out.println("         log:[" +  new Date() + "] "  + joinPoint.getSignature().getName());			
		}
		
	
	@Around("execution(* fibo*(..))") // fibo로 시작하는 모든 함수를 around 함
	public Object time(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long start = System.currentTimeMillis();		
		Object out = joinPoint.proceed();		
		long finish = System.currentTimeMillis();		
		System.out.println("         수행시간("  + joinPoint.getSignature().getName() + ") : "  +  (finish - start));
		
		return out;
	}
	@Before("execution(* *Cache(..))")
	public void log2(JoinPoint joinPoint) throws Throwable{
		System.out.println("==========================");
	}
	
	
	@Around("execution(* transaction*(..))")
	public Object transaction(ProceedingJoinPoint joinPoint) throws Throwable {		
		
		System.out.println("start transaction...");
		
		Object out = null;
		try {		
			out = joinPoint.proceed();
			System.out.println("commit...");
		}catch(Exception e) {
			System.out.println("rollback...");
			throw e;
		}		
		return out;
	}

	
	


}
