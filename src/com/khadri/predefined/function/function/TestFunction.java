package com.khadri.predefined.function.function;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		Function<String, String> function1 = (input) -> {

			return input.toUpperCase();
		};

		String modifiedString = function1.apply("khadri");
		System.out.println(modifiedString);

		Function<Integer, Float> function2 = (i) -> {

			return i.floatValue();
		};

		Float result2 = function2.apply(100);

		System.out.println(result2);

		Function<String, String> f = (s) -> s.substring(0, 15);
		System.out.println(f.apply("KHADRI SOFTWARE INSTITUTIONS"));
		System.out.println(f.apply("KADIRI HAVE KHADRI SOFTWARE INSTITUTIONS"));

	}
}
