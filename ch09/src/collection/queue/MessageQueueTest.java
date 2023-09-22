package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<>();
		
		// 객체 생성
		Message email = new Message("email", "윤지혜");
		Message sms = new Message("sms", "함민재");
		Message katalk = new Message("katalk", "서우창");
		
		// 객체 저장
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		// 객체 꺼내기
		// 반복 - 확인
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();
			switch(message.command) {
			case "email":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
				
			case "sms":
				System.out.println(message.to + "님에게 문자를 보냅니다");
				break;
				
			case "katalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다");
				break;
			}
		}
	}

}
