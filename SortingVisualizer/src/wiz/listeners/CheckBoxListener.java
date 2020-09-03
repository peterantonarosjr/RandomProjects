package wiz.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import wiz.gui.SortingPanel;

public class CheckBoxListener implements ItemListener{
	private SortingPanel sortingPanel;
	
	public CheckBoxListener(SortingPanel sortingPanel) {
		this.sortingPanel = sortingPanel;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sortingPanel.getInput();
		}
		
	}

}
