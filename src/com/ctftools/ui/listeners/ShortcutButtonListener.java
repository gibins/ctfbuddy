package com.ctftools.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ctftools.utils.DesktopShortCutMaker;
import com.ctftools.utils.LogManager;

public class ShortcutButtonListener implements ActionListener {
	
	String homePath;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		LogManager.writeLog(System.getProperty("user.name"), false);
		String currentUser = System.getProperty("user.name"); 
		homePath = "/home/"+currentUser+"/Desktop";
		DesktopShortCutMaker desktopShortCutMaker = new DesktopShortCutMaker();
		desktopShortCutMaker.createDesktopShortcut(homePath);
		
		
		
		
	}

}
