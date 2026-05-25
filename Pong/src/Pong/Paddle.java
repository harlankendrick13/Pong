package Pong;

import java.awt.Color;

public class Paddle extends Sprite {

	// Static final constants
	public static final int PADDLE_WIDTH = 10;
	public static final int PADDLE_HEIGHT = 100;
	public static final Color PADDLE_COLOUR = Color.WHITE;
	public static final int DIST_FROM_EDGE = 40;
	
	// Constructor
	public Paddle(int x, int y) {
		super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT, PADDLE_COLOUR);
	}
	
}
