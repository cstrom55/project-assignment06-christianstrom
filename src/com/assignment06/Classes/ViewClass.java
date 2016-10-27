package com.assignment06.Classes;

import javax.swing.JFrame;

public class ViewClass {
	public JFrame frame;
	/**
	 * Create the application.
	 */
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
