package com.jd.spring.ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using vodaphone Sim");

	}

	@Override
	public void data() {
		System.out.println("Data using vodaphone sim");

	}

}
