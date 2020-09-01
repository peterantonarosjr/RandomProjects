package wiz.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualizerLooper implements ActionListener{
	private VisualizerPanel visualPanel;
	
	public VisualizerLooper(VisualizerPanel visualPanel) {
		this.visualPanel = visualPanel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		visualPanel.cycle();
		
	}

}
