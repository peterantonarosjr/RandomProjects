package wiz.figures;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import wiz.constants.Constants;
import wiz.image.ImageFactory;
import wiz.image.Images;


public class FriendlyShip extends Sprite {
	private int health;
	
	
	public FriendlyShip() {
		init();
		this.setHealth(10);
	}
	
	private void init() {
		ImageIcon imageIcon = ImageFactory.createImage(Images.FSHIP);
		setImage(imageIcon.getImage());
		
		int start_pos_x = Constants.BOARD_WIDTH/2-Constants.FSHIP_WIDTH/2;
		int start_pos_y = Constants.BOARD_HEIGHT-100;
		
		setX(start_pos_x);
		setY(start_pos_y);
		
	}
	
	@Override
	public void move() {
		x+=dx;
		if(x>Constants.BOARD_WIDTH) {
			x=Constants.BOARD_WIDTH-Constants.BOARD_WIDTH-Constants.FSHIP_WIDTH/2;
		}
		if(x<Constants.BOARD_WIDTH-Constants.BOARD_WIDTH-Constants.FSHIP_WIDTH/2) {
			x=Constants.BOARD_WIDTH;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_A) {
			dx=0;
		}
		if(key==KeyEvent.VK_D) {
			dx=0;
		}
		
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_A) {
			dx=-2;
		}
		if(key==KeyEvent.VK_D) {
			dx=2;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
