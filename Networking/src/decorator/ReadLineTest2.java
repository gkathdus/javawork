package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest2 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("src/decorator/ReadLineTest2.java"))) {
			
			int lineNo = 1;
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				System.out.println(lineNo + " " + data);
				lineNo++;
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
