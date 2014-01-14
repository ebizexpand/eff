package com.ebizx.file.ascii;

public class ShowAscii {



	public static void main(String[] args) {
		System.out.println("ebizexpand");
		int init=(int)'A';
		for(int i=init;i<init+26;i++) {
			System.out.print(i);
			System.out.print("\t");
			System.out.println((char)i);
		}

	}

}
