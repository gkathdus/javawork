package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEX {

	public static void main(String[] args) {
		JSONObject member = new JSONObject();
		
		member.put("id", "sky123");
		member.put("name", "이하늘");
		member.put("age", "28");
		
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-5678");
		tel.put("mobile", "010-1111-2222");
		member.put("tel", tel);
		
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		member.put("skill", skill);
		
		String json = member.toString();
		System.out.println(json);
		
		// System.out.println(member);
		
		// 파일에 쓰기
		try {
			Writer writer = new FileWriter("C:/File/member.json", 
					Charset.forName("utf-8"));
			writer.write(json); // json 데이터를 문자열로 쓰기
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
