package com.ctftools.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecutor {
	
	public static boolean isWindows() {
		boolean isWindows = false;		
		String osName = System.getProperty("os.name");	
		LogManager.writeLog("OS Detected :"+osName, false);
		if(osName.startsWith("Win")||osName.startsWith("Micro")) {
			isWindows = true;
		}
		return isWindows;
	}
	
	
	public static String executeCommand(String command) throws Exception {
		String s;
		StringBuilder output = new StringBuilder();
		if(!isWindows()) {
		Process process = Runtime.getRuntime().exec(command);
		BufferedReader br = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
		 while ((s = br.readLine()) != null) {
			 LogManager.writeLog("Command Response :"+s, false);
			 output.append(s);}
		 process.waitFor();
		}else {
			output.append("Feature version not implemented");
		}
		 return output.toString();		 
	}

}
