package Pong;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Pong extends JFrame {

	// -------------------------------
	// Window configuration constants
	// -------------------------------
	private static final String WINDOW_TITLE = "Pong";
	private static final int WINDOW_WIDTH = 800;
	private static final int WINDOW_HEIGHT = 600;
	
	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PongPanel());
		
		setVisible(true);
	}
		
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
	}
}