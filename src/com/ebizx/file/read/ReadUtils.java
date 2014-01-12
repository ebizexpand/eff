package com.ebizx.file.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadUtils {
	
	public static void readFile() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("C:/Apps/docs/Accounting/nonMatchPidParentChild.csv"));
	    List myEntries = reader.readAll();	    
	    for (Object entry : myEntries) {
	    	 String[] line = (String [])entry;
	    	 for (String cell : line) {
				System.out.print(cell);
				System.out.print("\t");
			}
	    	System.out.println(); 
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		readFile();
	}

}
