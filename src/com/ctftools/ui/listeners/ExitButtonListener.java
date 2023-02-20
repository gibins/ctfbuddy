package com.ctftools.ui.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import com.ctftools.utils.LogManager;

public class ExitButtonListener implements ActionListener, MouseListener {

	public ExitButtonListener() {
		LogManager.writeLog("Program exiting Initialized", true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		LogManager.writeLog("Application Exited", true);
		System.exit(0);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton jButton = (JButton) e.getSource();
		jButton.setBackground(Color.BLUE);
		jButton.setForeground(Color.BLUE);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton jButton = (JButton) e.getSource();
		jButton.setBackground(Color.BLUE);
		jButton.setForeground(Color.BLUE);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JButton jButton = (JButton) e.getSource();
		jButton.setBackground(Color.BLUE);
		jButton.setForeground(Color.BLUE);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton jButton = (JButton) e.getSource();
		jButton.setBackground(Color.BLUE);
		jButton.setForeground(Color.BLUE);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton jButton = (JButton) e.getSource();
		jButton.setBackground(Color.BLUE);
		jButton.setForeground(Color.BLUE);

	}

}
