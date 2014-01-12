package com.ebizx.file.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.ebizx.json.EmpData;
import com.ebizx.json.Employee;
import com.google.gson.Gson;

import au.com.bytecode.opencsv.CSVReader;

public class ReadUtils {
	
	public static void readCSVFile() throws IOException {
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
	
	public static String readFileAsString(String filePath) throws IOException {
		FileInputStream fisTargetFile = new FileInputStream(new File(filePath));
		return IOUtils.toString(fisTargetFile, "UTF-8");		 
	}
	
	public static void writeStringToFile(String str, String filePath) throws IOException {
		FileUtils.writeStringToFile(new File(filePath), str, "UTF-8");
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//readCSVFile();
		String val = readFileAsString("C:/Apps/code/git/eff/res/sample.json");
		Gson gson = new Gson();
		EmpData empls = gson.fromJson(val, EmpData.class);
		empls.addEmployee(new Employee("Ram", "Charan"));
		String newJsonVal = gson.toJson(empls);
		writeStringToFile(newJsonVal,"C:/Apps/code/git/eff/res/sample.json");
		
		System.out.println(newJsonVal);
	}

}
