package wiz.app;

import java.awt.EventQueue;

import wiz.gui.GameFrame;

public class Application {
	
	public static void main(String[] args) {
		
		//Sets everything into motion
		EventQueue.invokeLater(() -> {
			
			new GameFrame();
		});
	}

}
