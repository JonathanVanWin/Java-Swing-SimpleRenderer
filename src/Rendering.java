import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Rendering implements Drawable{
	// Images for each animation
	private BufferedImage[] walkingLeft = {Sprite.getSprite(0, 1), Sprite.getSprite(2, 1)}; // Gets the upper left images of my sprite sheet
	private BufferedImage[] walkingRight = {Sprite.getSprite(0, 2), Sprite.getSprite(2, 2)};
	private BufferedImage[] standing1 = {Sprite.getSprite(1, 0)};

	// These are animation states
	private Animation walkLeft = new Animation(walkingLeft, 10);
	private Animation walkRight = new Animation(walkingRight, 10);
	private Animation standing = new Animation(standing1, 10);

	// This is the actual animation
	private Animation animation = standing;
	public void tick() {
		animation.update();

	}
	
	public void Draw(Graphics g) {
		g.drawLine(1, 1, 5, 5);
	}
	public static void main(String[] args) {
		Graphics Graphics ;
		
	Drawable f;
	}
}
