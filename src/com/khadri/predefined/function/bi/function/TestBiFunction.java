package com.khadri.predefined.function.bi.function;

import java.util.function.BiFunction;

public class TestBiFunction {

	public static void main(String[] args) {

		BiFunction<Teacher, Student, School> biFunction = (teacher, student) -> {

			return new School("KHADRI",teacher,student);
		};

		Teacher teacher = new Teacher();
		teacher.setName("JHON");
		
		
		Student student = new Student();
		student.setName("ALLEN");
		
		School school = biFunction.apply(teacher, student);
		
		
		System.out.println("Name of School "+school.getName());
		System.out.println("Name of Student "+school.getStudent().getName());
		System.out.println("Name of Teacher "+school.getTeacher().getName());
		
		

	}
}
