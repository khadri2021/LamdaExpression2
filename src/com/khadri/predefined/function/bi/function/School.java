package com.khadri.predefined.function.bi.function;

public class School {

	private String name;

	private Teacher teacher;
	private Student student;

	public School(String name, Teacher teacher, Student student) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.student = student;
	} 

	public Teacher getTeacher() {
		return teacher;
	}

	public Student getStudent() {
		return student;
	}

	public String getName() {
		return name;
	}


}
