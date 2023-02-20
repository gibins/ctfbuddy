package com.ctftools.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MidPanel extends JPanel {
	
	static MidPanel midPanel = null;
	public static JTextArea opArea = null;
	
	public static JTextArea ipArea = null;

	public MidPanel() {
		
		midPanel = this;
		midPanel.setBounds(0, 0, 800, 240);
		//midPanel.setBackground(new Color(0xF6F6F6));
		//midPanel.setBackground(new Color(0x38fc1e));
		midPanel.setBackground(new Color(0xFFDD33));
		//midPanel.setLocation(240, 0);
		midPanel.setLayout(null);
		midPanel.setVisible(true);
		
		opArea = new JTextArea();
		opArea.setLocation(405, 5);
		opArea.setSize(390, 230);
		
		opArea.setLineWrap(true);
	    //textArea.setEditable(false);
		
		JScrollPane opScroll = new JScrollPane (opArea);
		opScroll.setLocation(405, 5);
		opScroll.setSize(390, 230);
		//scroll.setLayout(null);
		opScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		opScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		opScroll.setVisible(true);
        
		
		midPanel.add(opScroll);
		
		//start of new panel
		ipArea = new JTextArea();
		ipArea.setLocation(5, 5);
		ipArea.setSize(390, 230);
		
		ipArea.setLineWrap(true);
		ipArea.setEditable(true);
		
		JScrollPane ipScroll = new JScrollPane (ipArea);
		ipScroll.setLocation(5, 5);
		ipScroll.setSize(390, 230);
		//scroll.setLayout(null);
		ipScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		ipScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		ipScroll.setVisible(true);
        
		
		midPanel.add(ipScroll);
			
	}
	
	


	public static JTextArea getOpArea() {
		return opArea;
	}




	public static void setOpArea(JTextArea opArea) {
		MidPanel.opArea = opArea;
	}




	public static JTextArea getIpArea() {
		return ipArea;
	}




	public static void setIpArea(JTextArea ipArea) {
		MidPanel.ipArea = ipArea;
	}




	public static MidPanel getMidPanel()
	{
		if(midPanel == null)
		{
			midPanel = new MidPanel();
		}
		else
		{
			//topPanel = this;
		}
		return midPanel;
	}

}
