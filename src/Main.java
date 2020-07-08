import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
		// 65は2進数で01000001
		fos.write(65);
		fos.flush();
		fos.close();
	}
}
