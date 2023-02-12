package com.khadri.predefined.function.bi.consumer;

import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (str1, str2) -> {

			System.out.println(str1.concat(str2));
		};
		
		biConsumer.accept("KHADRI", " IN KADIRI");

	}
}
