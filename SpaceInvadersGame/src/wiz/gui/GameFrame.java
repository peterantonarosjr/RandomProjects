package wiz.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import wiz.constants.Constants;
import wiz.figures.Logs;

public class GameFrame extends JFrame{
	
	public GameFrame() {
		
		createLayout();
		//createLogs();
	}


	private void createLayout() {
		this.setTitle(Constants.GAME_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) (dimension.getWidth()/2-Constants.BOARD_HEIGHT/2);
	    int y = (int) (dimension.getHeight()/2-Constants.BOARD_WIDTH/2);
	    this.setLocation(x, y);
		this.setResizable(false);
		
		GamePanel myPanel = new GamePanel();
		this.add(myPanel);
		this.pack();
		
		this.setVisible(true);
	}
	
	private void createLogs() {
		Logs myLog = new Logs();
		
	}

	

}
