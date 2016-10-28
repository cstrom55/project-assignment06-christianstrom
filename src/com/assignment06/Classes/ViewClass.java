package com.assignment06.Classes;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

/**
 * @author Christian Ström
 *
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
		
		//Label
		label.setBounds(12, 13, 56, 16);
		getContentPane().add(label);
		
		//TextField
		textField.setEditable(false);
		textField.setBounds(70, 10, 214, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		//Play
		btnPlay.setBounds(12, 42, 46, 25);
		btnPlay.setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		btnPlay.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\playp.jpg"));
		getContentPane().add(btnPlay);
		
		//Pause
		btnPause.setBounds(70, 42, 46, 25);
		btnPause.setBackground(new Color(255, 255, 255));
		btnPause.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\pausep.jpg"));
		getContentPane().add(btnPause);
		
		//Stop
		btnStop.setBounds(128, 42, 46, 25);
		btnStop.setBackground(new Color(255, 255, 255));
		btnStop.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\stopp.jpg"));
		getContentPane().add(btnStop);
		
		//Open
		btnOpen.setBounds(187, 42, 46, 25);
		btnOpen.setBackground(new Color(255, 255, 255));
		btnOpen.setIcon(new ImageIcon("C:\\Users\\Christian Str\u00F6m\\Desktop\\icons\\openp.jpg"));
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
	 */
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnPlay){
			pm.play();
			textField.setText(pm.getFileName());
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
