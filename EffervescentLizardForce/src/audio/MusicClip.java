package audio;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicClip {
	private Clip sound;
	private int framePosition = 0;
	private boolean wasPaused = false;
	
	public MusicClip(){
		Clip soundpath = loadClip("C:/Users/mouse/Music/School/hey.wav");
	    sound = soundpath;
	}
	public Clip loadClip(String filename){
        Clip clip = null;
        try{
            File file = new File(filename);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (UnsupportedAudioFileException uafe) {
            uafe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();;
        } catch (LineUnavailableException lue) {
            lue.printStackTrace();
        } catch (NullPointerException npe){
            npe.printStackTrace();
        }
        return clip;
    }
    
    public void playClip (){
        if(framePosition > 0 && wasPaused){
            sound.setFramePosition(framePosition);
            wasPaused = false;
        } else {
            stopClip();
        }
        sound.start();
    }
    
    public void pauseClip(){
        wasPaused = true;
        framePosition = sound.getFramePosition();
        sound.stop();
    }
    
    public void stopClip (){
        if(sound.isRunning()){
            sound.stop();
        }
        sound.setFramePosition(0);
        framePosition = 0;
        wasPaused = false;
    }
    
    public Clip getClip(){
        return sound;
    }
    
    public void setClip(Clip clip){
        sound = clip;
    }
}
