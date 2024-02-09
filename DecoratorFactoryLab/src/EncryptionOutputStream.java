import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptionOutputStream extends FilterOutputStream {
	private int shift = 0; // The shift in Caesar cipher

	public EncryptionOutputStream(int shift, OutputStream out) {
		super(out);
		this.shift = shift;
	}
	
	public void write(int c) throws IOException {
		super.write(encrypt(c));
	}
	
	/*
	 * Takes a character c and encrypts it with the Caesar cipher 
	 * if it's a letter and leaves it as is if it's not
	 * TODO: write the actual Caesar cipher encryption 
	 */
	int encrypt(int c) {
		int a = 'a'; // ASCII code of lower-case 'a'
		int z = 'a' + 26; // ASCII code of lower-case 'z'
		
		// if the character is a lower-case letter:
		if (a <= c && c <= z) {
			return 'a'; // a mock-up "cipher": changes all lower-case letters to 'a'
		} else {
			return c;
		}
	}

}
