package lib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseExample {

	public static void main(String[] args) {
		Reader reader;
		
		try {
			reader = new FileReader("C:/File/member.json");
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine();
			br.close();
			
			// System.out.println(json);
			JSONObject member = new JSONObject(json);
			System.out.println("id: " + member.getString("id"));
			System.out.println("name: " + member.getString("name"));
			System.out.println("age: " + member.getString("age"));
			
			JSONObject tel = member.getJSONObject("tel");
			System.out.println(tel.getString("home"));
			System.out.println(tel.getString("mobile"));
			
			JSONArray skill = member.getJSONArray("skill");
			System.out.println("skill: ");
			/*for(int i=0; i<skill.length(); i++) {
				System.out.println(skill.get(i) + ", ");
			}*/
			
			for(Object arr : skill)
				System.out.println(arr + ", ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
