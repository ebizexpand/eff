/**
 * 
 */
package com.ebizx.string;

/**
 * @author Anil Verma
 *
 */
public class TextUtils {
	
	public static boolean aContainsb(String a, String b) {
		if(a.contains(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(TextUtils.aContainsb("aababba", "abba"));

	}

}
