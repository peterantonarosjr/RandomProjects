package wiz.gui;

import java.awt.EventQueue;

public class Application {
	
	
	public static void main(String[] args) {
		
		//Sets everything into motion
		EventQueue.invokeLater(() -> {
			
			new SortingFrame();
		});
	}
}
