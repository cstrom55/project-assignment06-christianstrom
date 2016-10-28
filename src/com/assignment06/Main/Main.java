package com.assignment06.Main;
import java.awt.EventQueue;
import com.assignment06.Classes.ViewClass;

/**
 * @author Christian Ström
 *
 */
public class Main{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					ViewClass vc = new ViewClass();
					vc.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
