package GUIS;

import javax.swing.JFrame;

public class Firstpage{
	JFrame frame;
	
	public Firstpage() {
		initComponent();
	}
	
	public void initComponent() {
		frame = new JFrame("Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	
}
