package com.khadri.predefined.function;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		System.out.println("start of the program");

		Predicate<String> predicate = (msg) -> {
			return msg.isEmpty();
		};

		boolean result = predicate.test("HELLO");
		System.out.println("is Empty? " + result);
		System.out.println("End of the program");
	}
}
