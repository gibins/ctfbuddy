package com.ctftools.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.ctftools.ui.listeners.ExitButtonListener;
import com.ctftools.ui.listeners.SQLButtonListener;
import com.ctftools.ui.listeners.ShortcutButtonListener;
import com.ctftools.ui.listeners.StartButtonListener;
import com.ctftools.ui.listeners.SysThrottleListener;



public class BottomPanel extends JPanel {
	static BottomPanel bottomPanel = null;

	public BottomPanel() {
		
		bottomPanel = this;
		bottomPanel.setBounds(0, 0, 800, 60);
		//bottomPanel.setBackground(new Color(0xF6F6F6));
		//bottomPanel.setBackground(new Color(0x38fc1e));
		bottomPanel.setBackground(new Color(0xFFDD33));
		bottomPanel.setLocation(240, 0);
		bottomPanel.setLayout(null);
		bottomPanel.setVisible(true);
		
		JButton btnSysThrotle = new JButton();
		btnSysThrotle.setSize(80, 50);
		btnSysThrotle.setText("CPU");
		//btnSysThrotle.setLocation(60, 5);
		btnSysThrotle.setLocation(30, 5);
		btnSysThrotle.addActionListener(new SysThrottleListener());
		btnSysThrotle.setFont(new Font("Serif",Font.BOLD,10));
		//btnSysThrotle.setBackground(new Color(0,51,204));//import java.awt.Color;
		//btnSysThrotle.setBackground(new Color(0xB80000));
		//btnSysThrotle.setForeground(Color.WHITE);
		btnSysThrotle.setFocusPainted(false);
		btnSysThrotle.setBorderPainted(false);

		bottomPanel.add(btnSysThrotle);
		
		JButton btnResb = new JButton();
		btnResb.setSize(80, 50);
		btnResb.setText("SQL");
		//btnResb.setLocation(145, 5);
		btnResb.setLocation(115, 5);
		btnResb.addActionListener(new SQLButtonListener());
		btnResb.setFont(new Font("Serif",Font.BOLD,10));
		//btnResb.setBackground(new Color(0,51,204));//import java.awt.Color;
		//btnResb.setBackground(new Color(0xB80000));
		
		//btnResb.setForeground(Color.WHITE);
		btnResb.setFocusPainted(false);
		btnResb.setBorderPainted(false);
		//btnResb.setContentAreaFilled(false);
		
		
		bottomPanel.add(btnResb);
		
		JButton btnStart = new JButton();
		btnStart.setSize(80, 50);
		btnStart.setText("NTP");
		//btnStart.setLocation(230, 5);
		btnStart.setLocation(200, 5);
		btnStart.addActionListener(new StartButtonListener());
		btnStart.setFont(new Font("Serif",Font.BOLD,10));
		//btnStart.setBackground(new Color(0,51,204));//import java.awt.Color;
		//btnStart.setBackground(new Color(0xB80000));
		
		//btnStart.setForeground(Color.WHITE);
		btnStart.setFocusPainted(false);
		btnStart.setBorderPainted(false);
		//btnStart.setContentAreaFilled(false);
		
		
		bottomPanel.add(btnStart);
		
		JButton btnShortcut = new JButton();
		btnShortcut.setSize(80, 50);
		btnShortcut.setText("Icon");
		btnShortcut.setLocation(285, 5);
		btnShortcut.addActionListener(new ShortcutButtonListener());
		btnShortcut.setFont(new Font("Serif",Font.BOLD,10));
		btnShortcut.setFocusPainted(false);
		btnShortcut.setBorderPainted(false);
		bottomPanel.add(btnShortcut);

		JButton btnExit = new JButton();
		btnExit.setSize(80, 50);
		btnExit.setText("Exit");
		//btnExit.setLocation(315, 5);
		btnExit.setLocation(370, 5);
		btnExit.addActionListener(new ExitButtonListener());
		btnExit.setFont(new Font("Serif",Font.BOLD,10));
		//btnExit.setBackground(new Color(0,51,204));//import java.awt.Color;
		//btnExit.setBackground(new Color(0xB80000));
		//btnExit.setForeground(Color.WHITE);
		btnExit.setFocusPainted(false);
		btnExit.setBorderPainted(false);
		//btnExit.setContentAreaFilled(false);
		bottomPanel.add(btnExit);

	}
	
	public static BottomPanel getTopPanel()
	{
		if(bottomPanel == null)
		{
			bottomPanel = new BottomPanel();
		}
		else
		{
			//topPanel = this;
		}
		return bottomPanel;
	}

}
