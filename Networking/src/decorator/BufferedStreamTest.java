package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		String originFile = "C:/File/harvest-1.jpg";
		String copyFile = "C:/File/harvest-2.jpg";
		long start, end;
		
		try {
			// 기반 스트림 객체 생성
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			// 보조스트림 객체 생성
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			start = System.currentTimeMillis();
			
			 
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			bis.close();
			bos.close();
			
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간: " + (end - start) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
