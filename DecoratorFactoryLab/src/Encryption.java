import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.OutputStream;

public class Encryption {
	/*
	 * This is a test class for testing a simple Caesar cipher 
	 * for an output stream
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// text to write:
		String s = "Hi There! Welcome to my encryption test!";
		String outFile = "encrypted.txt";
		OutputStreamWriter out = null;
		try {
			OutputStream out1 = new FileOutputStream(outFile);
			//TODO: add EncryptionOutputStream to decorate the FileOutputStream
			// before passing it to the OutputStreamWriter:
			// out1 = .....
			out = new OutputStreamWriter(out1, "UTF-8");
			out.write(s); // write to the file
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
		System.out.println();
	}

}
