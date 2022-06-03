package com.bridgelabz.di;

public class Student {
	
	ISubject teach;
	
	public void setTeach(ISubject teach) {
		this.teach = teach;
	}

	public void learningSubject() {
		teach.teaching();
	}

}
