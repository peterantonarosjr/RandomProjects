package wiz.callbacks;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import wiz.gui.GamePanel;

public class EventListener extends KeyAdapter {
	
	private GamePanel screen;
	
	
	public EventListener(GamePanel screen) {
		this.screen = screen;
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		this.screen.keyReleased(e);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		this.screen.keyPressed(e);
	}

}
