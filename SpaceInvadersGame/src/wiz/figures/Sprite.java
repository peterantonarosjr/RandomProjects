package wiz.figures;

import java.awt.Image;

public abstract class Sprite {
	private Image image;
	private boolean dead;
	
	protected int x;
	protected int y;
	protected int dx;
	

	public abstract void move();
	
	public Sprite() {
		dead = false;
	}
	
	public void die() {
		this.dead = true;
	}
	

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public Image getImage() {
		return image;
	}
}       
