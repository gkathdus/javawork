package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	ChatServer chatServer;
	Socket socket;
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		this.chatServer = chatServer;
		this.socket = socket;
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostString();
			receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void receive() {
		chatServer.threadPool.execute(() -> {
			while(true) {
				try {
					String receiveJson = dis.readUTF();
					JSONObject jsonObject = new JSONObject(receiveJson);
					
					String command = jsonObject.getString("command");
					switch(command) {
					case "incoming" :
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "입장하셨습니다");
						chatServer.addSocketCilent(this);
						break;
					case "message" :
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					}
				} catch (IOException e) {
					// 클라이언트 소켓이 종료되면 연결이 끊김
					chatServer.sendToAll(this, "나가셨습니다");
					chatServer.removeSocketClient(this);
				}
			}
		
		});
		
	} // receive 끝
	
	// 데이터 보내기(송신) : JSON
	public void send(String json) {
		try {
			dos.writeUTF(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 소켓 종료
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
