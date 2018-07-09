package com.spring.miracom;

import org.springframework.beans.factory.annotation.Autowired;

public class CarService {
	private Car car;
	
	public CarService(){
	}// 이게 정의되어있어야 카서비스를 파라미터 없이 생성 가능해짐
	
	@Autowired 
	public CarService(Car car){
		this.car = car;
	} //자동으로 연결함 근데 여러개 정의되면 안됨
	public void park() {
		System.out.println("=========start==========");
		System.out.println(car.getInfo());
		System.out.println("==========end=========");	
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

}
