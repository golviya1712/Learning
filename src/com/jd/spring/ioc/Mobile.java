package com.jd.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * this is spring Inversion of Control(IOC) using application context spring
 * container.
 * 
 * Note: Here is all control on spring framework that why called IOC Like Create
 * Object for us using reading config.xml file Manage all object in container
 * 
 * @author JD
 *
 */
public class Mobile {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * Airtel airtel = (Airtel) applicationContext.getBean("airtel");
		 * airtel.calling(); airtel.data();
		 */

		/*
		 * Vodaphone vodaphone = applicationContext.getBean("vodaphone",
		 * Vodaphone.class); vodaphone.calling(); vodaphone.data();
		 */

		Sim sim = applicationContext.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}
}
