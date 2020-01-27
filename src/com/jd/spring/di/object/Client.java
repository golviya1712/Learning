package com.jd.spring.di.object;

public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		student.setMathCheat(new MathCheat());
		student.display();
	}

}
