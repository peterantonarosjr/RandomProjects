package wiz.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wiz.gui.SortingPanel;

public class StartListener implements ActionListener{
	private SortingPanel sortingPanel;
	
	
	public StartListener(SortingPanel sortingPanel) {
		this.sortingPanel=sortingPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		sortingPanel.timer.start();
		
	}

}
