package zuoye2;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Java\\Test"+File.separator+"myfile.txt");
		File f2 = new File("C:\\Java\\Test"+File.separator+"myfile_cp.txt");
		
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream(f2);
		byte[] b = new byte[512];
		in.read(b);
		in.close();
//		System.out.println(new String(b));
		String str = new String(b);
		byte[] b2 = str.getBytes();
		out.write(b2);
		out.close();
	}
}
