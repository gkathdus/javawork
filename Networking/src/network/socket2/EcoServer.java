package network.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EcoServer {
	
	 private static ServerSocket serverSocket;

	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하고 엔터를 누르세요");
		System.out.println("=========================================");
		
		// TCP 서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"));
				break;
		}
		
		scanner.close();
		
		// TCP 서버 종료
		stopServer();
		
	}
	
	private static void startServer() {
		Thread thread = new Thread() {
		public void run() {
			try {
				serverSocket = new ServerSocket(50001);
				System.out.println("[서버] 시작됨");
				
			while(true) {
				System.out.println("[서버] 연결 요청을 기다림");
				Socket socket = serverSocket.accept();
				
				// IP 주소 알아내기
				InetSocketAddress isa =
						(InetSocketAddress) socket.getRemoteSocketAddress();
				String clientIp = isa.getHostName();
				System.out.println("[서버]" + clientIp + "연결 요청을 수락함");
				// 웹 브라우저에서 http://127.0.0.1:50001/을 입력함 - 콘솔에서 확인
				
				// 클라이언트가 보낸 데이터 받기(읽기)
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int readBytes =  is.read(bytes);
				// 데이터를 문자열로 생성
				String message = new String(bytes, 0, readBytes, "utf-8");
				
				// 받은 데이터 보내기
				OutputStream os = socket.getOutputStream();
				bytes = message.getBytes("utf-8");
				
				os.write(bytes);
				
				os.flush();
				System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
				
				socket.close();
				System.out.println("[서버]" + clientIp + "연결을 끊음");
	}
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[서버]" + e.toString());
			}
			
				
			}
		};
		thread.start();
	}
	
	private static void stopServer() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
