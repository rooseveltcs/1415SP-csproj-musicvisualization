package musicplayer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This panel is in the place where either the visualisations or the filesystems
 * will be. This panel will contain either of those panels.
 * @author ros_cfhernqvist
 *
 */

public class MainPanel extends JPanel implements ComponentListener, ActionListener {
	
	JButton toggleButton = new JButton("V/M");
	JPanel menuPanel = new MenuPanel(), visualsPanel = new VisualsPanel(); //set menuPanel to whatever it needs dylan
	JPanel currentPanel = visualsPanel; //this is the one that's displayed
	
	public void toggleMenus ()
	{
		remove(currentPanel); //remove current panel
		currentPanel = currentPanel instanceof VisualsPanel ? menuPanel : visualsPanel; //switch current panel
		add(currentPanel); //add new current panel
		updateBounds();
		repaint();
	}
	
	public MainPanel()
	{
		setLayout(null); //static layout
		add(toggleButton);
		add(currentPanel);
		addComponentListener(this);
		toggleButton.addActionListener(this);
	}

	public void componentResized(ComponentEvent e) {
		updateBounds();
	}
	
	public void actionPerformed(ActionEvent e) {
		toggleMenus();
	}
	
	private void updateBounds () //called to fix the positions of the panel and button
	{
		int bW = 100, bH = 20, bM = 10; //button height, width, margin
		toggleButton.setBounds(getWidth()-bW-bM, bM, bW, bH);
		currentPanel.setBounds(0, 0, getWidth(), getHeight());
	}
	
	public void componentHidden(ComponentEvent e) {}
	public void componentMoved(ComponentEvent e) {}
	public void componentShown(ComponentEvent e) {}
	
}
