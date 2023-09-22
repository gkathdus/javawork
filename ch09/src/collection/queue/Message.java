package collection.queue;

public class Message {
	// 필드
	String command;
	String to;
	
	// 생성자
	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}
