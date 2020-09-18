package zuoye3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("C:\\Java\\Test"+File.separator+"myfile.txt");
		FileWriter f2 = new FileWriter("C:\\Java\\Test"+File.separator+"myfile_cp.txt");
		BufferedReader fr = new BufferedReader(f1);
		BufferedWriter fw = new BufferedWriter(f2);
		String str;
		
		while((str = fr.readLine()) != null) {
			fw.write(str+"\n");
			fw.flush();
		}
	}
}
