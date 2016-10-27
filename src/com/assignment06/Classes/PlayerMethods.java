package com.assignment06.Classes;

import java.io.File;
import javax.swing.JFileChooser;
import com.assignment06.Interfaces.PlayerInterface;
import jaco.mp3.player.MP3Player;

public class PlayerMethods implements PlayerInterface{

	private String fileName = "";
	private MP3Player mp3 = new MP3Player();
	
	public void play() {
		if(fileName == ""){
			open();
		}else{
			mp3.play();
		}
	}
	public void pause() {
		mp3.pause();
	}
	public void stop() {
		mp3.stop();
	}
	public void open() {
		try{
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(null);
			File selectedFile = fc.getSelectedFile();
			this.fileName = selectedFile.getName();
			stop();
			setMP3(new MP3Player(selectedFile));
			play();
		}catch(NullPointerException e){
			e.getMessage();
		}
	}
	public String getFileName(){
		return fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}
	public MP3Player getMP3(){
		return mp3;
	}
	public void setMP3(MP3Player mp3){
		this.mp3 = mp3;
	}
}
