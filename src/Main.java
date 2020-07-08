import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
public class Main {
	public static void main(String[] args) throws IOException {
		String msg = "第1土曜";
		Reader sr = new StringReader(msg);
		char c1 = (char) sr.read();
		char c2 = (char) sr.read();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
	}
}
