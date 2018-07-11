package com.spring.miracom.aop;

import java.util.HashMap;

public class Computation {
	
	public HashMap<Integer, Long> map = new HashMap<Integer, Long>();
	
	
	
	public long fibo(int n) {
		 if (n <= 1) return n;
	        else return fibo(n-1) + fibo(n-2);
	}
	
	public long fiboCache(int n) {
		
		if ( map.containsKey(n)  ) return map.get(n);		
		
		if(n<=2) {			
			map.put(n, (long)1);
			return 1;
		}
		long r = fiboCache(n-1)+fiboCache(n-2);
		map.put(n, r);
		return r;		
	}
	
}
