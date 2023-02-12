package com.khadri.predefined.function.supplier;

import java.util.function.Supplier;

import com.khadri.predefined.function.consumer.Employee;

public class TestSupplier {

	public static void main(String[] args) {

		Supplier<Employee> supplier = () -> {

			Employee employee = new Employee();
			employee.setEmpId("101");
			employee.setEmpName("ALLEN");

			return employee;
		};
		
		
		Employee employee = supplier.get();
		
		
		System.out.println(employee.getEmpId()+" --- "+employee.getEmpName() );
		
	}
}
