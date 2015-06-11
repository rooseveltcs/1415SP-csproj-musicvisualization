package audio;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ros_maremash
 */
public class PlayListener extends MouseAdapter{
    private MusicClip music;
    public PlayListener(MusicClip music){
        super();
        this.music = music;
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Play");
        music.playClip();
    }
}