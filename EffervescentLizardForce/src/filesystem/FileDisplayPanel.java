package filesystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JPanel;

public class FileDisplayPanel extends JPanel {
	private ArrayList<FileSlab> allFiles;
	private int viewSize;
	
	public FileDisplayPanel(int viewSize) {
		this.viewSize = viewSize;
		this.allFiles = new ArrayList<FileSlab>();
		super.setBackground(Color.PINK);
		super.setPreferredSize(new Dimension(200,0));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.viewSize = super.getHeight()/15;
		g.setColor(Color.BLACK);
		int count = 0;
		while(count < viewSize && count < allFiles.size()) {
			g.drawString(allFiles.get(count).getFileName(), 10 * allFiles.get(count).getIndent(), 10 + (count * 15));
			count++;
		}
	}
	
	public void addFile(File file) {
		FileSlab slab = new FileSlab(file); 
		System.out.println(file + " " + slab);
		allFiles.add(slab);
	}
	
	public void addFile(String fileName) {
		allFiles.add(new FileSlab(new File(fileName)));
	}
	
	public void test() {
		super.add(allFiles.get(0));
	}
	
	protected class FileSlab extends Component {
		private File file;
		private int indent;
		
		public FileSlab(File file) {
			this.file = file;
			this.indent = 1;
			super.setSize(super.getWidth(), super.getHeight()/viewSize);
		}
		
		public void setIndent(int indent) {
			this.indent = indent;
		}
		
		public int getIndent() {
			return indent;
		}
		
		public File getFile() {
			return file;
		}
		
		public String getFileName() {
			return file.getName();
		}
	}
}
