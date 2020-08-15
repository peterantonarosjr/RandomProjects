import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Decrypter {
	String filePath;
	String File;
	public Decrypter(String filePath){
		this.filePath = filePath;
		File = readFile(filePath);
		decryptfile();
		writeFile(File);
		System.out.println("Decrypter created");
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
	private void decryptfile() {
		//Decryption algorithm goes here
		int shift = -1;
		String dec = "";
		char c;
		System.out.println("Encrypt File function");
		for(int i=0; i<File.length(); i++) {
			c= (char) (File.charAt(i)+shift);
			dec+=String.valueOf(c);
		}
		File = dec;

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
