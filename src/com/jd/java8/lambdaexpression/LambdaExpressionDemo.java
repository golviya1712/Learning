package com.jd.java8.lambdaexpression;

interface Parent {
	default void print() {
		
	}
}

interface Child extends Parent {
	public void age(int i);
}

public class LambdaExpressionDemo {
	public static void main(String arg[]) {
		Child child=(i)->{
			System.out.println(i);
		};
		child.age(10);
	}
}
