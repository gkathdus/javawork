package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// close() 사용하지 않는 방법: try ~ with ~ resource문
		String originFile = "C:/File/harvest-1.jpg";
		String copyFile = "C:/File/harvest-2.jpg";
		long start, end;

		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			start = System.currentTimeMillis();
			
			while(true) {
				int num = is.read();
				if(num == -1) break;
				os.write(num);
			}
			os.flush();
			
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간: " + (end-start) + "ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
