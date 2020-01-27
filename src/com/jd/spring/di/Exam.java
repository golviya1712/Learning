package com.jd.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * this is dependancy injection in spring
 * 
 * Main thing is property tag is find class setter property method.
 * 
 * NOTE: Spring set dependancy inject using class property setter method if
 * class has not setter spring will not set value of inject value.
 * 
 * 
 * @author JD
 *
 */
public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pojo.xml");
		Student studentOne = context.getBean("studentOne", Student.class);
		studentOne.displayStudentInfo();
		Student studentTwo = context.getBean("studentTwo", Student.class);
		studentTwo.displayStudentInfo();
	}
}
