package com.ctftools.ui;

import java.awt.Color;
import java.awt.Font;
import java.sql.Time;
import java.util.Timer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ctftools.utils.BatteryStatusMonitor;

public class TopPanel extends JPanel {

	static TopPanel topPanel = null;

	public TopPanel() throws Exception 
	{
			topPanel = this;
			topPanel.setBounds(0, 0, 800, 60);
			//topPanel.setBackground(new Color(0xF6F6F6));
			//topPanel.setBackground(new Color(0x38fc1e));
			topPanel.setBackground(new Color(0xFFDD33));
			topPanel.setLayout(null);
			topPanel.setLocation(0, 240);
			
			topPanel.setVisible(true);
			
			JLabel jLable = new JLabel();
			jLable.setText("CTF Buddy");
			jLable.setLocation(10, 0);
			jLable.setSize(300, 70);
			jLable.setBackground(new Color(0xFFFFFF));
			jLable.setForeground(new Color(0xFFFFFF));
			jLable.setFont(new Font("Calibri", Font.BOLD, 35));
			topPanel.add(jLable);
			
			JLabel batInfo = new JLabel();
			batInfo.setText("CTF Buddy");
			batInfo.setLocation(600, 0);
			batInfo.setSize(300, 70);
			batInfo.setBackground(new Color(0xFFFFFF));
			batInfo.setForeground(new Color(0xFFFFFF));
			batInfo.setFont(new Font("Calibri", Font.BOLD, 20));
			topPanel.add(batInfo);
			
			Timer timer = new Timer();
			BatteryStatusMonitor batteryStatusMonitor = new BatteryStatusMonitor(batInfo);
			timer.schedule(batteryStatusMonitor, 1000, 3000);
			batteryStatusMonitor.setBatInfo(batInfo);
			
			
		
	}
	
	public static TopPanel getTopPanel() throws Exception
	{
		if(topPanel == null)
		{
			topPanel = new TopPanel();
		}
		else
		{
			//topPanel = this;
		}
		return topPanel;
	}

}
