package com.ctftools.utils;

import java.util.TimerTask;

import javax.swing.JLabel;

public class BatteryStatusMonitor extends TimerTask{
	
	String KALI_LINUX_BATTERY_CAPACITY = "cat /sys/class/power_supply/BAT1/capacity";
	String KALI_LINUX_BATTERY_STATUS = "cat /sys/class/power_supply/BAT1/status";
	public static String battInfo="Reading Bat Info";
	JLabel jLabel;
	
	
	public BatteryStatusMonitor(JLabel jLabel) {
		this.jLabel = jLabel;
	}

	public void setBatInfo(JLabel display) {
		display.setText(battInfo);
	}
	
	public String start(JLabel jLabel) throws Exception {
		String capacity = CommandExecutor.executeCommand(KALI_LINUX_BATTERY_CAPACITY);
		String status = CommandExecutor.executeCommand(KALI_LINUX_BATTERY_STATUS);
		battInfo = status+":"+capacity+" %";
		jLabel.setText(battInfo);
		return battInfo;
	}

	@Override
	public void run() {
		try {
			start(jLabel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	
	
	

}
