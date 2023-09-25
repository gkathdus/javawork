package datareaderwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample1 {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/File/test.txt");
			
			// 1. 한 문자 쓰기
			char a = 'A';
			char b = 'B';
			
			// 2. 문자열 쓰기
			String str = "안녕하세요.";
			
			// 3. 배열 쓰기
			char[] arr = {'C', 'D', 'E'};
			
			writer.write(a);
			writer.write(b);
			writer.write(str);
			writer.write(arr);
			
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
