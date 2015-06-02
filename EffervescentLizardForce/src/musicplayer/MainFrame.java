package musicplayer;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {
	
	MainPanel mainPanel;
	PlayerPanel playerPanel;
	QueuePanel queuePanel;
	
	public MainFrame () //initializing stuff here
	{
		setTitle("Music player");
		setSize(600, 400);
		
		JPanel panel = (JPanel)getContentPane();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		
		constraints.fill = GridBagConstraints.VERTICAL;//setting up where the panel were adding goes
		constraints.weightx = 0;
		constraints.weighty = 1;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridheight = 2;
		constraints.gridwidth = 1;
		panel.add(queuePanel = new QueuePanel(), constraints); //adding it

		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		panel.add(mainPanel = new MainPanel(), constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		constraints.weighty = 0;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		panel.add(playerPanel = new PlayerPanel(), constraints);
		
		
	}
	
}
