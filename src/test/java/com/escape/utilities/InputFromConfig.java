package com.escape.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InputFromConfig {
	
	public Properties pro;
	
	public InputFromConfig(){
		
		
		File fi=new File(System.getProperty("user.dir")+"//Configuration//Configuration.properties");
		
		try {
			FileInputStream ff=new FileInputStream(fi);
			pro=new Properties();
			pro.load(ff);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		public String getBaseUrl () {
			String baseurl=pro.getProperty("baseurl");
			return baseurl;	
		}
		
		public String username() {
			String username=pro.getProperty("username");
			return username;
		}
		
		public String password() {
			String password=pro.getProperty("password");
			return password;
		}
		
		
		public String chromepath() {
			String chrome=pro.getProperty("chromepath");
			return chrome;
		}
		
		
		public String firefoxpath() {
			String firefox=pro.getProperty("firefoxpath");
			return firefox;
		}
}
		
	


