package com.khadri.custom.function;

public class CustomRobotMain {

	public static void main(String[] args) {

		Robot robot = (ask) -> {

			if (ask.equals("hai")) {
				return ask.toUpperCase();
			} else if (ask.equals("hello")) {
				return ask.toUpperCase();
			}

			return "TRY ANOTHER INPUT";

		};

		String msg = robot.talk("hai");
		System.out.println(msg);
	}
}
