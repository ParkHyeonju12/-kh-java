package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class TcpServer3 {
	public void tcpServer3() {
		Scanner sc = new Scanner(System.in);
		int port = 8888;

		ServerSocket server = null; // 반환 객체
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			server = new ServerSocket(port);

			HashMap<String, String> map = new HashMap<String, String>();
			map.put("www.naver.com", "125.209.222.142");
			map.put("www.goole.com", "172.217.175.4");
			map.put("www.iei.or.kr", "211.43.14.187");

			System.out.println("DNS서버 준비완료");
			int num = 0;
			while (true) {
				System.out.println("클라이언트 요청 대기 상태...");

				Socket client = server.accept();

				OutputStream out = client.getOutputStream();
				InputStream in = client.getInputStream();

				dos = new DataOutputStream(out);
				dis = new DataInputStream(in);

				String clientMsg = dis.readUTF();
				if (map.containsKey(clientMsg)) {
					dos.writeUTF(map.get(clientMsg));
					num++;
					System.out.println("요청" + num + "건 처리 완료");
					System.out.print("서브를 종료하시겠습니까[y/n]? : ");
					String c = sc.next();
					dos.writeUTF(c);
					if (c.equals("y")) {
						return;
					}

				} else {
					dos.writeUTF("주소가 없습니다.");
				}
			} // while끝
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				dos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
