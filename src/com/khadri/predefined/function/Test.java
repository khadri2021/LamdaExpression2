package com.khadri.predefined.function;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		Predicate<String> predicate1 = (str) -> {
			return !str.isEmpty();
		};

		boolean result1 = predicate1.test("kHADRI");
		System.out.println(result1);

		Predicate<Integer> predicate2 = (i) -> {
			return i < 0;
		};

		boolean result2 = predicate2.test(1);
		System.out.println(result2);

	}
}
