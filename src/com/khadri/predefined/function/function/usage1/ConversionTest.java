package com.khadri.predefined.function.function.usage1;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import java.util.function.Function;

public class ConversionTest {

	public static void main(String[] args) {

		Function<Register, Adhaar> function = (reg) -> {

			String uniqueNumber = UUID.randomUUID().toString().toUpperCase();
			Adhaar adhaar = new Adhaar(uniqueNumber);
			adhaar.setName(reg.getName());
			adhaar.setAge(reg.getAge());

			return adhaar;
		};

		Register register = new Register();
		register.setAge(23);
		register.setName("JHON");

		Adhaar newAdhaar = function.apply(register);

		System.out.println(" Adhaar Number : " + newAdhaar.getAdhaarNo());
		System.out.println(" Adhaar Name : " + newAdhaar.getName());
		System.out.println(" Adhaar Age : " + newAdhaar.getAge());

	}
}
