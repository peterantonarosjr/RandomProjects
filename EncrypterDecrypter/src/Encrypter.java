import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Encrypter {
	String filePath;
	String File;
	public Encrypter(String filePath) {
		System.out.println("Encrypter created");
		System.out.println(filePath);
		this.filePath = filePath;
		File = readFile(filePath);
		encryptfile();
		writeFile(File);

	}
	private String readFile(String fp) {
		String line;
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while((line = br.readLine()) !=null) {
				sb.append(line);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	private void encryptfile() {
		//Encryption algorithm goes here
		int shift = 1;
		String enc = "";
		char c;
		System.out.println("Encrypt File function");
		for(int i=0; i<File.length(); i++) {
			c= (char) (File.charAt(i)+shift);
			enc+=String.valueOf(c);
		}
		File = enc;
		
	}
	private void writeFile(String f) {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(f);
			
			bw.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "File Could Not Be Created!", "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		System.out.println("Write File function");
	}

}
