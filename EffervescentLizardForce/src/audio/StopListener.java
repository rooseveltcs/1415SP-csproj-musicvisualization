package audio;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author mouse
 */
public class StopListener extends MouseAdapter{
    private MusicClip music;
    public StopListener(MusicClip music){
        super();
        this.music = music;
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Stop");
        music.stopClip();
    }
}