package com.ctftools.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sound.midi.MidiChannel;
import javax.swing.JTextArea;

import com.ctftools.ui.MidPanel;



public class LogManager {
	// D:\\Experiments\\NetworkUtility\\
	public static final String FILE_PATH = "./logs/";
	public static final String LOG_FILE = "NW_LOGS_";
	public static String DB_LOG = "DB_";

	private LogManager networkUtilityLog = null;

	public LogManager() {
		if (networkUtilityLog == null) {
			networkUtilityLog = new LogManager();
		}
	}

	public LogManager getInstance() {
		return networkUtilityLog;
	}

	public static void writeLog(String logMessage, Boolean consoleOnly) {
		try {

			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYY");

			File logFile = new File(FILE_PATH + LOG_FILE + dateFormat.format(date) + ".log");

			FileOutputStream fileOutputStream = new FileOutputStream(logFile, true);

			String datedMsg = new Date() + " : " + logMessage + "\n";
			fileOutputStream.write(datedMsg.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();

			// System.out.println(datedMsg);
			if (!consoleOnly) {
				
				//ui rendering
				JTextArea jTextArea = MidPanel.getOpArea();
				if (jTextArea != null) {
					jTextArea.setText(jTextArea.getText() + "\n\n" + logMessage+"\n");
				} else {
					// System.out.println("No midpanel");
				}
			}

		} catch (FileNotFoundException e) {

			System.out.println("Log file not created :" + e.getLocalizedMessage());
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void writeDBLog(String logMessage) {
		try {

			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYY");

			// DB_LOG += ConfigManager.getConfigParam("database");

			File logFile = new File(FILE_PATH + LOG_FILE + DB_LOG + dateFormat.format(date) + ".log");

			FileOutputStream fileOutputStream = new FileOutputStream(logFile, true);

			String datedMsg = new Date() + " : " + logMessage + "\n";

			fileOutputStream.write("----------------------------------------------------\n".getBytes());
			fileOutputStream.write(datedMsg.getBytes());
			fileOutputStream.write("----------------------------------------------------\n".getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();

			System.out.println(datedMsg);
			// ui rendering
			
			JTextArea jTextArea = MidPanel.getOpArea();
			if (jTextArea != null) {
				jTextArea.setText(jTextArea.getText() + "\n" + logMessage);
			} else {
				// System.out.println("No midpanel");
			}

		} catch (FileNotFoundException e) {

			System.out.println("Log file not created :" + e.getLocalizedMessage());
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
