package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	// 412. Fizz Buzz
	public static void main(String[] args) {

	}

	public static List<String> fizzBuzz(int n) {

		List<String> list = new ArrayList<>();

		if (n <= 0) {
			return list;
		}

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 != 0 && i % 5 == 0) {
				list.add("Buzz");
			} else if (i % 3 == 0 && i % 5 != 0) {
				list.add("Fizz");
			} else {
				list.add(String.valueOf(i));
			}

		}

		return list;
	}
}
