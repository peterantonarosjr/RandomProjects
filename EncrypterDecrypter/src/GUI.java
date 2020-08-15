import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame{
	public GUI(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		this.setLayout(new GridLayout(4, 1));

		JTextField filePath = new JTextField("Enter Absolute File Path");
		contentPane.add(filePath);

		JCheckBox encrypt = new JCheckBox("Encrypt");
		contentPane.add(encrypt);

		JCheckBox decrypt = new JCheckBox("Decrypt");
		contentPane.add(decrypt);

		JButton initiate = new JButton("Start");
		StartListener sL = new StartListener(this,encrypt,decrypt,filePath);
		initiate.addActionListener(sL);
		contentPane.add(initiate);
		this.setVisible(true);
	}
	
}
