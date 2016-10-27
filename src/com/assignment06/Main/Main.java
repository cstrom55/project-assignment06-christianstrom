package com.assignment06.Main;
import java.awt.EventQueue;
import com.assignment06.Classes.ViewClass;

/**
 * @author Christian Ström
 *
 */
public class Main {
	/**
	 * Launches the program
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				try{
					ViewClass window = new ViewClass();
					window.frame.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
