package com.ctftools.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.ctftools.ui.MainFrame;
import com.ctftools.ui.MidPanel;
import com.ctftools.ui.inputarea.UserCreadPanel;
import com.ctftools.utils.LogManager;



public class SysThrottleListener implements ActionListener {

	public SysThrottleListener() {
		LogManager.writeLog("CPU Thorttle Initialized", false);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* SysThrottle sysThrottle = new SysThrottle(); */
		LogManager.writeLog("CPU Thorttle Implementation Not Found", false);
		
		JPanel midpanel = MidPanel.getMidPanel();
		MainFrame.setMidPanel(new  UserCreadPanel());
		
		
	}

}
