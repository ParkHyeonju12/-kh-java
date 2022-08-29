package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer2 {

	public void tcpServer2() {
		Scanner sc = new Scanner(System.in);
		int port = 9999;

		ServerSocket server = null; // 반환 객체
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			server = new ServerSocket(port);
			System.out.println("[서버 클라이언트 시작]");
			System.out.println("클라이언트 접속 요청을 기다립니다....");

			Socket client = server.accept();
			System.out.println("클라이언트 접속 완료");

			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();

			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);

			while (true) {
				System.out.print("나 : ");
				String serverMsg = sc.nextLine();
				dos.writeUTF(serverMsg);
				if (serverMsg.equals("exit")) {
					return;
				}
				String clientMsg = dis.readUTF();
				if (clientMsg.equals("exit")) {
					return;
				} else {
					System.out.println("[clinet] : " + clientMsg);
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				dos.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
