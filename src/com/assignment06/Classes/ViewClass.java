package com.assignment06.Classes;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

/**
 * The implementation of the GUI
 * 
 * @author Christian Ström
 */
public class ViewClass extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	PlayerMethods pm = new PlayerMethods();
	
	//Creating label
	private JLabel label = new JLabel("Music:");
	
	//Creating buttons
	private JButton btnPlay = new JButton("");
	private JButton btnPause = new JButton("");
	private JButton btnStop = new JButton("");
	private JButton btnOpen = new JButton("");
	
	//Creating textField
	private JTextField textField = new JTextField();

	/**
	 * 	Create the application
	 */
	public ViewClass() {
		getContentPane().setBackground(Color.WHITE);
		createUserInterface();
		addActionListeners();
	}
	/**
	 * 	Initializes the contents of the frame
	 */
	public void createUserInterface(){
		//Frame
		setTitle("MP3 Player");
		setBounds(100, 100, 330, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		
		//Label
		label.setBounds(12, 13, 56, 16);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(label);
		
		//TextField
		textField.setEditable(false);
		textField.setBounds(70, 10, 214, 22);
		textField.setColumns(10);
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		getContentPane().add(textField);
		
		//Play
		btnPlay.setBounds(70, 45, 46, 25);
		btnPlay.setBackground(new Color(255, 255, 255));
		btnPlay.setIcon(new ImageIcon("icons\\playp.jpg"));
		getContentPane().add(btnPlay);
		
		//Pause
		btnPause.setBounds(125, 45, 46, 25);
		btnPause.setBackground(new Color(255, 255, 255));
		btnPause.setIcon(new ImageIcon("icons\\pausep.jpg"));
		getContentPane().add(btnPause);
		
		//Stop
		btnStop.setBounds(183, 45, 46, 25);
		btnStop.setBackground(new Color(255, 255, 255));
		btnStop.setIcon(new ImageIcon("icons\\stopp.jpg"));
		getContentPane().add(btnStop);
		
		//Open
		btnOpen.setBounds(238, 45, 46, 25);
		btnOpen.setBackground(new Color(255, 255, 255));
		btnOpen.setIcon(new ImageIcon("icons\\openp.jpg"));
		getContentPane().add(btnOpen);
	}
	/**
	 * 	Adding actions for the buttons
	 */
	public void addActionListeners(){
		btnPlay.addActionListener(this);
		btnPause.addActionListener(this);
		btnStop.addActionListener(this);
		btnOpen.addActionListener(this);
	}
	/**
	 * 	Sets actions for the JButtons
	 * 	Sets the filename in textField when using open()
	 */
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnPlay){
			pm.play();
		}
		else if(e.getSource() == btnPause){
			pm.pause();
		}
		else if(e.getSource() == btnStop){
			pm.stop();
		}
		else if(e.getSource() == btnOpen){
			pm.open();
			textField.setText(pm.getFileName());
		}
	}
}
