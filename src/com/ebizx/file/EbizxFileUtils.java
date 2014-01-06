/**
 * 
 */
package com.ebizx.file;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

/**
 * @author Anil Verma
 *
 */
public class EbizxFileUtils {
	
	public static File largestDirectory(File directory) {
		File[] files = directory.listFiles();
		double maxVal = 0;
		File largestDir = null;
		for (File file : files) {
			if (file.isDirectory()) {
				BigInteger folderSize = FileUtils.sizeOfDirectoryAsBigInteger(file);
				if (folderSize.doubleValue()>maxVal) {
					maxVal = folderSize.doubleValue();
					largestDir = file;
				}				
			}
		}
		return largestDir;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File baseFolder = new File("C:\\Apps\\code");		
		File[] files = baseFolder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				BigInteger folderSize = FileUtils.sizeOfDirectoryAsBigInteger(file);
				double megaBytes = folderSize.doubleValue()/(1024.0*1024.0);
				System.out.println(file.getName()+"->" + megaBytes+"MB");
			}
		}
		//System.out.println(bigInt.doubleValue()/(1024.0*1024.0));
	}

}
