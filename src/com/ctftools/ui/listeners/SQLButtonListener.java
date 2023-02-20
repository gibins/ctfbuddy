package com.ctftools.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import com.ctftools.utils.LogManager;

public class SQLButtonListener implements ActionListener {

	public SQLButtonListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LogManager.writeLog("Executing SQL Button", false);

		/*
		 * DatabaseConfig databaseConfig = new DatabaseConfig(); try {
		 * databaseConfig.start(); }
		 * 
		 * catch (IOException e1) {
		 * 
		 * e1.printStackTrace(); }
		 * 
		 * catch (Exception e1) { //e1.printStackTrace(); //throw new
		 * Exception(e1.getMessage());
		 * 
		 * 
		 * }
		 */

	}

}
