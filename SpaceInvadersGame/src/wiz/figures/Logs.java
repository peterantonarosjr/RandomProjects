package wiz.figures;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import wiz.constants.Constants;

public class Logs extends JFrame {
	JPanel panel;
	JTextArea field1;
	JTextArea field2;
	JTextArea field3;
	
	public Logs() {
		
		initLayout();
		finalizeLayout();
	}



	private void initLayout() {
		this.setTitle(Constants.LOG_TITLE);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0,0);
		
		panel = new JPanel();
		field1 = new JTextArea();
		field2 = new JTextArea();
		field3 = new JTextArea();
		field1.setEditable(true);
		field2.setEditable(true);
		field3.setEditable(true);
		field1.append("One");
		field2.append("Two");
		field3.append("Three");
		panel.setLayout(new GridLayout(1,3));

	}
	
	private void finalizeLayout() {
		panel.add(field1);
		panel.add(field2);
		panel.add(field3);
		this.setPreferredSize(new Dimension(350,550));
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}

}
