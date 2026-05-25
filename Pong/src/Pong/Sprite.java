package Pong;

import java.awt.Rectangle;
import java.awt.Color;

public class Sprite {
	
	// Position
	private int xPosition;
	private int yPosition;
	private int initialXPosition;
	private int initialYPosition;
	
	// Velocity
	private int xVelocity;
	private int yVelocity;
	
	// Size
	private int width;
	private int height;

	// Color
	private Color colour;
	
    // -------------------------
    // Getters and Setters
    // -------------------------
	
	public int getXPosition() {
		return xPosition;
	}
	
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public int getYPosition() {
		return yPosition;
	}
	
	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public int getXVelocity() {
		return xVelocity;
	}
	
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	
	public int getYVelocity() {
		return yVelocity;
	}
	
	public void setYVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getColour() {
		return colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public void setInitialPosition(int initialX, int initialY) {
		this.initialXPosition = initialX;
		this.initialYPosition = initialY;
	}
	
	public void resetToInitialPosition() {
		this.xPosition = initialXPosition;
		this.yPosition = initialYPosition;
	}
	
	// Existing simple setters
	public void setXPosition(int newX) {
		xPosition = newX;
	}
	
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	
	// overloaded setters with bounds checking
	
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
		
		// Left bound
		if (xPosition <0) {
			xPosition = 0;
		}
		// Right bound
		else if (xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}
	
	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
		
		// Top bound
		if (yPosition < 0) {
			yPosition = 0;
		}
		// Bottom bound
		else if (yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
	}
}









