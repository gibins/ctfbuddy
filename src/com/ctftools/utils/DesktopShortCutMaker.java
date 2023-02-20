package com.ctftools.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DesktopShortCutMaker {

	public DesktopShortCutMaker() {

	}
	
	
	String[] propertyList = {"#!/usr/bin/env xdg-open",
			"[Desktop Entry]",
			"Version",
			"Type",
			"Terminal",
			"Icon[en_US]",
			"Name[en_US]",
			"Exec",
			"Comment[en_US]",
			"Name",
			"Comment",
			"Icon"};
	
	String defaultIcon= "#!/usr/bin/env xdg-open\n"
			+ "[Desktop Entry]\n"
			+ "Version=1.0\n"
			+ "Type=Application\n"
			+ "Terminal=false\n"
			+ "Icon[en_US]=/home/gibin/Ctftools/conf/ctf1.ico\n"
			+ "Name[en_US]=CTF Buddy\n"
			+ "Exec=/home/gibin/Ctftools/ctftools.sh\n"
			+ "Comment[en_US]=Start CTF Buddy\n"
			+ "Name=CTF Buddy\n"
			+ "Comment=Start CTF Buddy\n"
			+ "Icon=/home/gibin/Ctftools/conf/ctf1.ico\n"
			+ "";
	
	public void createDesktopShortcut(String destinationPath) {
		
		File shortCutFile = new File(destinationPath+"/ctftools.desktop"); 
		
		try {
			shortCutFile.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(shortCutFile);
			fileOutputStream.write(defaultIcon.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();
			LogManager.writeLog(shortCutFile.getAbsolutePath(), false);
		} catch (Exception e) {
			LogManager.writeLog(e.getMessage(), false);
			
		}
		
	}
	

}
