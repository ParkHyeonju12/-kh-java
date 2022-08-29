package kh.java.start;

import kh.java.func.KhServer;

public class Start {
	
	public static void main(String[] args) {
//		TcpServer3 ts = new TcpServer3();
//		ts.tcpServer3();
		KhServer kt = new KhServer();
		kt.chattingServer();
	}
}
