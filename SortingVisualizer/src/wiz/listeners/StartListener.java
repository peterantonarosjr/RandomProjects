package wiz.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import wiz.algorithms.*;
import wiz.gui.VisualizerPanel;

public class StartListener implements ActionListener{
	
	private VisualizerPanel visualPanel;
	
	public StartListener(VisualizerPanel visualPanel) {
		this.visualPanel = visualPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		visualPanel.isSorting = true;
		this.visualPanel.timer.start();
		//Need Switch case here for sorts

	}

}
