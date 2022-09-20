package excep;
//FileInputStream is used to read a text file
import java.io.FileInputStream;
import java.io.IOException;

public class Finally2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("e:/data.txt");
		int x = 0;

		try {
			while ((x = fis.read()) != -1) {
				System.out.print((char) x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fis.close();
		}
	}

}
