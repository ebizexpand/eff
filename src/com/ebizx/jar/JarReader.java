package com.ebizx.jar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarReader {
	
	public static String readJar(String fileName, String jarFilePath ) throws IOException {
		JarFile jar = new JarFile(jarFilePath);		
		Enumeration<JarEntry>  entries = jar.entries();
		String line;
		StringBuilder sb = new StringBuilder();
		while(entries.hasMoreElements()) {
			JarEntry val = entries.nextElement();
			if(val.getName().equals(fileName)) {				
				InputStream is = jar.getInputStream(val);
				BufferedReader br = null;				
				br = new BufferedReader(new InputStreamReader(is));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}				
			}			
		}
		return sb.toString();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("www.ebizexpand.com");
		System.out.println(readJar("sampler.txt", "C:\\Apps\\code\\git\\eff\\eff_fat.jar"));
	}

}
