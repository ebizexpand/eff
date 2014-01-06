/**
 * 
 */
package com.ebizx.algo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anil Verma
 *
 */
public class InsertSort {
	
	public static void sort(List<Integer> numbers) {
		for (int j=1;j<numbers.size();j++) {
			int key = numbers.get(j);
			int i = j-1;
			while (i>=0 && numbers.get(i)>key) {
				numbers.set(i+1, numbers.get(i));
				i = i-1;				
			}
			numbers.set(i+1, key);
		}
	}
	
	public static void sort(List<Integer> numbers, boolean asc) {
		for (int j=1;j<numbers.size();j++) {
			int key = numbers.get(j);
			int i = j-1;
			if(asc) {
				while (i>=0 && numbers.get(i)>key) {
					numbers.set(i+1, numbers.get(i));
				}
			}
			
		}
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> places = Arrays.asList(31, 41, 59, 26, 41, 58);
		sort(places);
		for (Integer num : places) {
			System.out.println(num);
		}

	}

}
