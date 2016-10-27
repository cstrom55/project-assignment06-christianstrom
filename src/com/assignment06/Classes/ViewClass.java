package com.assignment06.Classes;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

/**
 * @author Christian Ström
 *
 */
public class ViewClass {
	public JFrame frame;
	private JTextField textFieldFileName;
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
		PlayerMethods pm = new PlayerMethods();
		frame = new JFrame();
		
		/**
		 * Frame
		 */
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 360, 110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Label "Music:"
		 */
		JLabel labelMusic = new JLabel("Music:");
		labelMusic.setBounds(12, 13, 56, 16);
		labelMusic.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelMusic);
		
		/**
		 * TextField for the filenames
		 */
		textFieldFileName = new JTextField();
		textFieldFileName.setBackground(Color.WHITE);
		textFieldFileName.setEditable(false);
		textFieldFileName.setBounds(70, 11, 266, 22);
		frame.getContentPane().add(textFieldFileName);
		textFieldFileName.setColumns(10);
		
		/**
		 * Play button
		 */
		JButton btnPlay = new JButton("");
		btnPlay.setBounds(12, 42, 46, 25);
		btnPlay.setBackground(new Color(255, 255, 255));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.play();
				textFieldFileName.setText(pm.getFileName());
			}
		});
		frame.getContentPane().setLayout(null);
		btnPlay.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\playp.jpg"));
		frame.getContentPane().add(btnPlay);
		
		/**
		 * Pause button
		 */
		JButton btnPause = new JButton("");
		btnPause.setBounds(70, 42, 46, 25);
		btnPause.setBackground(new Color(255, 255, 255));
		btnPause.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\pausep.jpg"));
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pm.pause();
			}
		});
		frame.getContentPane().add(btnPause);
	
		/**
		 * Stop button
		 */
		JButton btnStop = new JButton("");
		btnStop.setBounds(128, 42, 46, 25);
		btnStop.setBackground(new Color(255, 255, 255));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.stop();
			}
		});
		btnStop.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\stopp.jpg"));
		frame.getContentPane().add(btnStop);
		
		/**
		 * Open button
		 */
		JButton btnOpen = new JButton("");
		btnOpen.setForeground(new Color(0, 0, 0));
		btnOpen.setBounds(187, 42, 46, 25);
		btnOpen.setBackground(new Color(255, 255, 255));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.open();
				textFieldFileName.setText(pm.getFileName());
			}
		});
		btnOpen.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\openp.jpg"));
		frame.getContentPane().add(btnOpen);
	}
}
