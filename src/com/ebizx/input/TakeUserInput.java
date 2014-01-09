package com.ebizx.input;

import java.util.Scanner;

public class TakeUserInput {
	
	public static void getUserInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();
		System.out.println("Enter your age");
		int age = in.nextInt();
		System.out.println("Enter your city");
		String city = in.next();
		System.out.println("Enter your state");
		String state = in.next();
		if(age>21) {
			System.out.println("Hi "+ name+ ",");
		}
		//int i = in.nextInt();
		//System.out.println(i*i);
		//String s = in.next();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getUserInput();

	}

}
