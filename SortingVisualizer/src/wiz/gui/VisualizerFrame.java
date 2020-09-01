package wiz.gui;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import wiz.constants.Constants;

public class VisualizerFrame extends JFrame{

	public VisualizerFrame() {
		
		createLayout();
	}


	private void createLayout() {
		this.setTitle(Constants.SCREEN_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) (dimension.getWidth()/2-Constants.SCREEN_HEIGHT/2);
	    int y = (int) (dimension.getHeight()/2-Constants.SCREEN_WIDTH/2);
	    this.setLocation(x, y);
		this.setResizable(false);
		VisualizerPanel visualPanel = new VisualizerPanel();
		this.add(visualPanel);
		this.pack();
		this.setVisible(true);
	}

}
