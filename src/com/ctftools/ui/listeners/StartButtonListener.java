package com.ctftools.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import com.ctftools.utils.LogManager;

public class StartButtonListener implements ActionListener {
	

	public StartButtonListener() {
		LogManager.writeLog("Start Button Initialized", true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LogManager.writeLog("Executing Start Button", true);
		
		/*
		 * try { NTPServer networkUtility = new NTPServer(); } catch
		 * (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1) {
		 * e1.printStackTrace(); }
		 */
		
		
	}

}
