package wiz.figures;

import javax.swing.ImageIcon;

import wiz.constants.Constants;
import wiz.image.ImageFactory;
import wiz.image.Images;
import java.awt.Rectangle;

public class EnemyShip extends Sprite{
	private boolean visible = true;
	private boolean right = false;
	private boolean left = false;
	
	public EnemyShip(int x, int y) {
		this.x = x;
		this.y = y;
		init();
	}
	private void init() {
		ImageIcon imageIcon = ImageFactory.createImage(Images.ESHIP);
		setImage(imageIcon.getImage());
		
	}
	
	public void move(int direction) {
		this.x+=direction;
		if(x>Constants.BOARD_WIDTH-Constants.ESHIP_WIDTH) {
			right=true;
			left=false;
		}
		if(x<0) {
			left=true;
			right=false;
		}
	}
	
	@Override
	public void move() {
		
	}
	
	public boolean isRight() {
		return right;
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}
	
	public boolean isLeft() {
		return left;
	}
	
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(this.x,this.y,Constants.ESHIP_WIDTH-10,Constants.ESHIP_HEIGHT-10);
	}
	

}
