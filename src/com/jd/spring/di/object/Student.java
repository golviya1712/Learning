package com.jd.spring.di.object;

/**
 * this class dependant on math cheat class.
 * 
 * @author JD
 *
 */
public class Student {

	MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void display() {
		mathCheat.cheating();
	}
}
