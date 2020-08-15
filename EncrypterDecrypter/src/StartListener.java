import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class StartListener implements ActionListener {
	GUI gui;
	JCheckBox E;
	JCheckBox D;
	String path;
	JTextField fp;
	
	public StartListener(GUI gui, JCheckBox E, JCheckBox D, JTextField filePath) {
		this.gui = gui;
		this.E = E;
		this.D = D;
		fp = filePath;
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		path = fp.getText();
		boolean en = E.isSelected();
		boolean de = D.isSelected();
		boolean ende = (E.isSelected()) && (D.isSelected());
		if(ende) {
			JOptionPane.showMessageDialog(null, "Choose ENCRYPT OR DECRYPT", "Error!", JOptionPane.ERROR_MESSAGE);
		}
		else if(en) {
			
			Encrypter enc = new Encrypter(path);
		}
		else if(de) {
			
			Decrypter dec = new Decrypter(path);
		}

	}

}
