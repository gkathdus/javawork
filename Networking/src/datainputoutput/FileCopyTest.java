package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		String originFile = "C:/File/harvest-1.jpg";
		String copyFile = "C:/File/harvest-2.jpg";

		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			while(true) {
				int num = is.read();
				if(num == -1) break;
				os.write(num);
			}
			os.flush();
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
