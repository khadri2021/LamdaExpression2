package com.khadri.predefined.function.consumer;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> consumer1 = (str) -> {
			System.out.println(str);
		};

		consumer1.accept("HELLO");

		Consumer<Employee> consumer2 = (emp) -> {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			
		};

		Employee t = new Employee();
		t.setEmpId("100");
		t.setEmpName("JHON");
		consumer2.accept(t);

	}
}
