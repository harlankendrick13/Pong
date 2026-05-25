package Pong;

import java.awt.Color;

public class Ball extends Sprite {
	
	private static final Color BALL_COLOUR = Color.WHITE;
	private static final int BALL_WIDTH = 25;
	private static final int BALL_HEIGHT = 25;
	
	public Ball (int panelWidth, int panelHeight) {
		
		// Set size and colour
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColour(BALL_COLOUR);
		
		// Center the ball on the screen
		setInitialPosition(
				panelWidth / 2 - (getWidth() / 2),
				panelHeight / 2 - (getHeight() / 2)
		);
		
		// Move ball to its initial position
		resetToInitialPosition();
	}

}
