package com.khadri.predefined.function.bi.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestBiPredicate {

	public static void main(String[] args) {

		Predicate<String> predicate = (str) -> {

			return str.isEmpty();
		};

		System.out.println("Single Predicate " + predicate.test(""));

		BiPredicate<String, String> biPredicate = (str1, str2) -> {

			return str1.equalsIgnoreCase(str2);
		};

		System.out.println("Bi Predicate " + biPredicate.test("Khadri", "khadri"));

	}
}
