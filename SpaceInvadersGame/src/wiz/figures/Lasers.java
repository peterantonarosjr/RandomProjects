package wiz.figures;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

import wiz.constants.Constants;
import wiz.image.ImageFactory;
import wiz.image.Images;

public class Lasers extends Sprite {
	
	
	public Lasers() {
		
	}
	public Lasers(int x, int y) {
		this.x = x;
		this.y = y;
		init();
	}
	
	private void init() {
		ImageIcon imageIcon = ImageFactory.createImage(Images.LASER);
		setImage(imageIcon.getImage());
		
		setX(x+Constants.FSHIP_WIDTH/2-Constants.LASER_WIDTH/2);
		setY(y);
	}
	

	@Override
	public void move() {
		this.y-=Constants.LASER_VERTICAL;
		if(this.y<0) {
			this.die();
		}
		
	}
	
	public Rectangle getBounds() {
		
		return new Rectangle(this.x,this.y,Constants.LASER_WIDTH,Constants.LASER_HEIGHT);
	}

}
