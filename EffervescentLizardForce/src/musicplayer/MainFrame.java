package musicplayer;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import filesystem.FileDisplayPanel;
//import filesystem.QueuePanel;


public class MainFrame extends JFrame {
	
	MainPanel mainPanel;
	PlayerPanel playerPanel;
	public FileDisplayPanel queuePanel;
	
	public MainFrame () //initializing stuff here
	{
		setTitle("Music player");
		setSize(600, 400);
		
		try { //this block of code sets the style to whatever matches the operating system
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (UnsupportedLookAndFeelException e) {
	        e.printStackTrace();
	    }
		
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
		panel.add(queuePanel = new FileDisplayPanel(10),constraints); //adding it

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
