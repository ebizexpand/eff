package com.ebizx.number;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {

	public static void test() {
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher("There are more than -2 and less than 12 numbers here");
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	public static List<Integer>extractNumbersFromString(String input) {
		List<Integer>numbers = new ArrayList<Integer>();
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(input);
		while (m.find()) {
			numbers.add(Integer.parseInt(m.group()));
		}
		return numbers;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer>numbers = extractNumbersFromString("my name1223 is why this-23 is 22 fail");
		for (Integer num : numbers) {
			System.out.println(num);
		}
	}

}
