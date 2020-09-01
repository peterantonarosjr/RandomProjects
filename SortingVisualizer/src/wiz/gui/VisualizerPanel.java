package wiz.gui;
import wiz.constants.Constants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JCheckBox;

public class VisualizerPanel extends JPanel {
	
	public Timer timer;
	private JTextArea input;
	public ArrayList<Integer> unsortedValues;
	public boolean isSorting = false;
	
	VisualizerPanel(){
		
		createLayout();
		setComponents();
	}


	private void createLayout() {
		this.setFocusable(true);
		this.setPreferredSize(new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
		unsortedValues = new ArrayList<Integer>();
		unsortedValues.add(20);
		unsortedValues.add(30);
		unsortedValues.add(50);
		unsortedValues.add(10);
		timer = new Timer(Constants.REFRESH_SPEED, new VisualizerLooper(this));
		
	}

	private void setComponents() {
		input = new JTextArea();
		
	}

	public void getInput(JTextArea input) {
		String user = input.getText();
		String[] helper = user.split(" ");
		for(int i=0; i<helper.length; i++) {
			unsortedValues.add(Integer.parseInt(helper[i]));
		}
	}
	
	public void cycle() {
		repaint();
		System.out.println("Refresh");
		
	}
	
	
	private void updateDrawnRect(int posOne, int posTwo, int heightOne, int heightTwo) {
		
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.isSorting==false) {
			int length = unsortedValues.size();
			for(int i=0; i<this.unsortedValues.size(); i++) {
				g.setColor(Color.BLACK);
				g.drawRect(i*20, Constants.SCREEN_HEIGHT-unsortedValues.get(i)*10, 20, unsortedValues.get(i)*10);
			}
		}
			
		
	}
	
}

/**
 * NOTE TO SELF 
 * 
 * Drawing the initial array works
 * I need to then draw the new sorted rectangles
 * Current rectangle should be red 
 * Comparing rectangle should be yellow
 * 
**/