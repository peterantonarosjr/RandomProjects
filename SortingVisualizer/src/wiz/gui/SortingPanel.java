package wiz.gui;

import java.awt.Graphics;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import wiz.constants.Constants;
import wiz.listeners.CheckBoxListener;
import wiz.listeners.Looper;
import wiz.listeners.StartListener;

import java.awt.Color;
import java.awt.Dimension;


public class SortingPanel extends JPanel{
	public Timer timer;
	public ArrayList<Integer> unsortedValues;
	public boolean isSorting = false;
	private JTextField userInput;
	private JCheckBox bubbleSort;
	private JButton startSort;
	
	
	public SortingPanel() {
		
		createLayout();
		createComponents();
	}

	private void createLayout() {
		this.setFocusable(true);
		this.setPreferredSize(new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
		unsortedValues = new ArrayList<Integer>();
		timer = new Timer(Constants.REFRESH_SPEED, new Looper(this));
		
	}

	private void createComponents() {
		userInput = new JTextField("Enter Input here");
		userInput.setSize(150, 75);
		this.add(userInput);
		
		
		bubbleSort = new JCheckBox("Bubble Sort");
		bubbleSort.addItemListener(new CheckBoxListener(this));
		this.add(bubbleSort);
		
		startSort = new JButton("Start Sort");
		startSort.addActionListener(new StartListener(this));
		this.add(startSort);
		
	}
	
	
	public void getInput() {
		String user = userInput.getText();
		String[] input = user.split(" ");
		for(int i=0; i<input.length; i++) {
			unsortedValues.add(Integer.parseInt(input[i]));
		}
		repaint();
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		if(isSorting==false) {
			for(int i=0; i< unsortedValues.size(); i++) {
				g.setColor(Color.BLACK);
				g.drawRect(i*20, Constants.SCREEN_HEIGHT-unsortedValues.get(i)*5, 20, unsortedValues.get(i)*5);
			}
		}else {
			
		}
		
	}


}
