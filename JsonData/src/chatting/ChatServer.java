package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	
	// 필드
	ServerSocket serverSocket;
	
	// 스레드 풀
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	
	// 채팅방 만들기
	// Map <String, SocketCilent> chatRoom = new Hashtable<>();
	 Map <String, SocketClient> chatRoom =
			 Collections.synchronizedMap(new HashMap<>());
	 
	public void start() throws IOException {
		try {
			serverSocket = new ServerSocket(6000);
			System.out.println("[서버] 시작됨");
			
			// 항상 연결 대기 - 스레드 만들기
			Thread thread = new Thread() {
				public void run() {
					while(true) {
						try {
							Socket socket = serverSocket.accept();
							SocketClient sc = new SocketClient(ChatServer.this, socket);
					} catch (IOException e) {
					}
				}
			}
		};
		thread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 클라이언트와 통신할 소켓 추가
	public void addSocketCilent(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}
	// 클라이언트와 통신할 소켓 삭제
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("퇴장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}
	
	// 데이터 보내기
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		// 반복자 필요
		Collection <SocketClient> socketClient = chatRoom.values();
		for(SocketClient sc : socketClient) {
			sc.send(json);
		}
		
	}
	
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			
			// chatRoom.values();
			
			Collection <SocketClient> socketClient = chatRoom.values();
			for(SocketClient sc : socketClient) {
				sc.close();
			}
			System.out.println("[서버] 종료됨");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("=========================================");
			System.out.println("서버를 종료하려면 q또는 Q를 입력하고 엔터를 누르세요");
			System.out.println("=========================================");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				String key = scanner.nextLine();
				if(key.toLowerCase().equals("q")); {
					break;
				}
			}
			scanner.close();
			chatServer.stop();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
	}


