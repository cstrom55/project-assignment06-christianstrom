package com.assignment06.Classes;
import java.io.File;
import javax.swing.JFileChooser;
import com.assignment06.Interfaces.PlayerInterface;
import jaco.mp3.player.MP3Player;

/**
 * @author Christian Ström
 *
 */
public class PlayerMethods implements PlayerInterface{
	private String fileName = "";
	private MP3Player mp3 = new MP3Player();

	/**
	 *	Plays the chosen file if it exists
	 */
	public void play() {
		if(fileName != ""){
			mp3.play();
		}
	}
	/**
	 * Pauses the chosen file if it exists
	 */
	public void pause() {
		if(fileName != ""){
			mp3.pause();
		}
	}
	/**
	 * 	Stops the chosen file if it exists
	 */
	public void stop() {
		if(fileName != ""){
			mp3.stop();
		}
	}
	/**
 	* 	Opens a file, sets fileName.
 	* 	Stops any current music playing
 	*/
	public void open() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("C:\\Users\\Christian Ström\\Music"));
		int returnVal = fc.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION){
			stop();
			File selectedFile = fc.getSelectedFile();
			this.setFileName(selectedFile.getName());
			this.setMP3(new MP3Player(fc.getSelectedFile()));
		}
	}
	/**
	 * 
	 * @return fileName
	 */
	public String getFileName(){
		return fileName;
	}
	/**
	 * 
	 * @param fileName
	 */
	public void setFileName(String fileName){
		this.fileName = fileName;
	}
	/**
	 * @return mp3
	 */
	public MP3Player getMP3(){
		return mp3;
	}
	/**
	 * 
	 * @param mp3
	 */
	public void setMP3(MP3Player mp3){
		this.mp3 = mp3;
	}
}
