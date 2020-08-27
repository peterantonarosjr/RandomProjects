package wiz.figures;

import javax.swing.ImageIcon;

import wiz.image.ImageFactory;
import wiz.image.Images;

public class EnemyShip extends Sprite{
	private boolean visible = true;
	
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
		
	}
	
	@Override
	public void move() {
		
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	

}
