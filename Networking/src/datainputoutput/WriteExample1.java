package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) {
		try {
			// 출력 스트림 객체 생성
			OutputStream os = new FileOutputStream("C:/File/test1.db");
			
			// 데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			// db 파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
