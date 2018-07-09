package com.spring.miracom;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloSpringTest {

	public static void main(String[] args) {
		HelloSpring hs = new HelloSpring();
		hs.say("안녕하세요");
		hs.setPrefix("[이순신]");
		hs.say("안녕하세요");
		
//		HelloSpring hs2 = new HelloSpring();
//		hs2.setPrefix("[홍길동]");
//		hs2.say("안녕하세요ㅋㅋㅋ");
		// 이렇게하면 너무 과부화임 ㅠ 그래서 싱글톤으로 바꿔야 됨
		
		GenericXmlApplicationContext ctx =
		new GenericXmlApplicationContext("ioc.xml");
		// import 해주고 resources 파일에다가 ioc.xml넣어줘야 정상동작함
		//ctx 선언하면 init됨
		
		System.out.println("##############");
		
		HelloSpring g = (HelloSpring)ctx.getBean("hello");
		g.say("hello");
		//주소값만 가져오는방법임
		
		HelloSpring g2 = (HelloSpring)ctx.getBean("hello2");
		g2.say("안녕!");
		
		HelloSpring g3 = (HelloSpring)ctx.getBean("hello2");
		g2.say("안녕~~~~");
		//hello2는 이순신임
		
		ctx.close();
		//ctx.close를 해서 destroy~~~~ 3개가아니라 2개 나옴 xml에서 관리를 하기 때문
		
	}

}
