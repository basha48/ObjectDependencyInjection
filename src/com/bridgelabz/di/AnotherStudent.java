package com.bridgelabz.di;

public class AnotherStudent {
	
	MathTeacher teach;
	
	public void setTeach(MathTeacher teach) {
		this.teach = teach;
	}

	public void learningSubject() {
		teach.teaching();
	}
	
}
