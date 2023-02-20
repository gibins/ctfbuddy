package com.ctftools.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	
	final static String CONFIG_FILE = "./conf/app.properties";

	ConfigManager configManager = null;
	
	public ConfigManager() {
		LogManager.writeLog("Configuration Manager Started",false);
		
		if(configManager== null)
		{
			configManager = this;
		}

	}
	
	public static String getConfigParam(String param)
	{
		String configValue = null;
		
		try {
			FileReader fileReader = new FileReader(CONFIG_FILE);
			
			Properties properties=new Properties();  
		    properties.load(fileReader);
		    
		    configValue = properties.getProperty(param);
		    
		    
		} catch (FileNotFoundException e) {
			
			LogManager.writeLog("Config Manager :"+e.getMessage(),true);
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			LogManager.writeLog("Config Manager :"+e.getMessage(),true);

			e.printStackTrace();
		}
		
		
		return configValue;
	}

}
