package com.javaprogram;
 import java.io.*;
import java.util.Properties;
public class StoreDataKeyValue {
	
	public static void main(String[] args) throws IOException {
		
		Properties pop=new Properties();
		pop.put("username", "ayaz@123");
		pop.put("userPass", "ayaz1234");
		pop.put("userAdress", "sakinaka");
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/"+"siddiqui.properties");
		pop.store(file, "siddiqui");
		System.out.println(pop.get("username"));
		
	}

}
