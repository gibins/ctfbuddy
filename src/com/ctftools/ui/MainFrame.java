package com.ctftools.ui;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	static MainFrame mainFrame = null;
	static MidPanel midPanel = null;
	public MainFrame() throws Exception {
		super();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		mainFrame = this;
		mainFrame.setBounds(0, 0, 800, 460);
		mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		mainFrame.setAlwaysOnTop(true);
		mainFrame.setDefaultLookAndFeelDecorated(true);
		//mainFrame.setUndecorated(true);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		
		TopPanel topPanel = new TopPanel();
		topPanel.setLocation(0, 0);
		topPanel.setBackground(new Color(0x324355));
		mainFrame.add(topPanel);
		
		BottomPanel bottomPanel = new BottomPanel();
		bottomPanel.setLocation(0, 300);
		bottomPanel.setBackground(new Color(0x366665));
		mainFrame.add(bottomPanel);

		midPanel = new MidPanel();
		midPanel.setLocation(0, 60);
		midPanel.setBackground(new Color(0x324855));
		mainFrame.add(midPanel);
		
		mainFrame.repaint();
	}
	public static MidPanel getMidPanel() {
		return midPanel;
	}
	public static void setMidPanel(JPanel midPanel) {
		midPanel = midPanel;
		midPanel.setVisible(false);
		//MainFrame.getMainFrame().repaint();
		//midPanel.setVisible(true);
		
		mainFrame.remove(midPanel);
	}
	

	public static MainFrame getMainFrame() {
		return mainFrame;
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	
	
	
}
