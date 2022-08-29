package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.xml.sax.InputSource;

public class TcpServer {
	
	public void tcpServer() {
		Scanner sc = new Scanner(System.in);
		//1. 서버에서 사용할 포트번호 지정
		//0~65535 번호 사이에 1개를 사용
		//0~1000 사이 번호는 사용중인 번호가 많은므로 1000이후를 사용
		int port = 7777;
		
		//반환할 객체 미리 선언
		//서버에서 포트를 열기위한 객체
		ServerSocket server = null;
		
		//데이터 주고 받기 위한 보조스트림
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			//2. 서버소켓 객체생성
			//생성자 매개변수로 전달한 포트번호가 열리면서 서버 대기상태
			server = new ServerSocket(port);
			
			System.out.println("[서버 준비 완료]");
			System.out.println("클라이언트 접속 요청 대기중 .....");
			
			//3. server.accept(): 클라이언트 접속 요청 대기
			//4. 접속요청이 들어오면 수락해서 통신할 객체를 생성
			Socket client = server.accept();
			System.out.println("클라이언트 접속 완료");
			
			//5.데이터를 주고받기 위한 스트림 추출(생성x)
			//소켓안에 이미 스트림 존재(양방향)
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			
			//6. 보조스트림으로 성능개선
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			
			while(true) {
			//7.스트림을 통한 입력 및 출력
			String clientMsg = dis.readUTF();
			System.out.println(clientMsg);
			
			System.out.print("클라에 전송할 메세지 : ");
			String sendMsg1 = sc.nextLine();
			dos.writeUTF(sendMsg1);
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
