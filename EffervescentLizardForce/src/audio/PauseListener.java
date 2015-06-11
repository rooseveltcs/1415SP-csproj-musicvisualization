package audio;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author mouse
 */
public class PauseListener extends MouseAdapter{
private MusicClip music;
    public PauseListener(MusicClip music){
        super();
        this.music = music;
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Pause");
        music.pauseClip();
    }
}
