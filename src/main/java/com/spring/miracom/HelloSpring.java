package com.spring.miracom;

public class HelloSpring {
	
	private String prefix = "[]";
	
	public void say(String say) {
		System.out.println(prefix + say);
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void init() {
		System.out.println("init~~~~~~~~");
	}
	public void cleanup() {
		System.out.println("destroy~~~~~~~~");
	}
	

}
