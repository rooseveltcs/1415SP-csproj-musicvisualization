package musicplayer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import audio.MusicClip;
import audio.PauseListener;
import audio.PlayListener;
import audio.StopListener;

public class PlayerPanel extends JPanel{
	private static final String[] BUTTON_TITLES = {"play", "pause", "stop"};
	private static final int NUMBER_OF_BUTTONS = 3; 
	
	public PlayerPanel()
	{
		setBackground(Color.green); //placeholder
		setPreferredSize(new Dimension(0,100));
		
		MusicClip music = new MusicClip();
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel containerButtons = new JPanel();
		//containerButtons.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		MouseAdapter[] listeners = {new PlayListener(music), new PauseListener(music), new StopListener(music)};
		for (int j = 0; j < NUMBER_OF_BUTTONS; j++){
			JLabel jl = new JLabel(new ImageIcon("src/audio/" + BUTTON_TITLES[j] + ".png"));
			//String folderName = PlayerPanel.class.getName().replace('.', '/' );
			//String urlString = "/"+folderName+"/" +BUTTON_TITLES[j] + ".png";
			//URL fileUri = PlayerPanel.class.getResource(urlString);
			//jl.setIcon(new ImageIcon(fileUri));
			
			//JLabel jl = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\pause.png"));
			jl.addMouseListener(listeners[j]);
			containerButtons.add(jl);
		}
		
		add(containerButtons);
	}
	
}
