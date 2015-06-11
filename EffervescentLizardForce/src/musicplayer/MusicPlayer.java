package musicplayer;

import java.io.File;

public class MusicPlayer {
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		mainFrame.queuePanel.addFile(new File("H:\\SquareRootShit.txt"));
		mainFrame.queuePanel.addFile(new File("H:\\answers.docx"));
		mainFrame.queuePanel.addFile(new File("H:\\Test"));
		mainFrame.queuePanel.addFile(new File("H:\\DylanJP1 Typing practice (April.2)　.docx"));
		mainFrame.queuePanel.addFile(new File("H:\\Raspberry Pi.zip"));
		mainFrame.queuePanel.addFile(new File("H:\\Gang Garrison 2 v2.7.2\\background.png"));
	}
	
	
}
