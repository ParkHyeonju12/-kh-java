package kh.java.func;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class CharStreamTest {
	private Scanner sc;

	public CharStreamTest() {
		super();
		sc = new Scanner(System.in);
	}
	//byteStream은 끝이 Stream으로 끝남, 1byte로 움직임
	//writer 나 reader로 끝나면 2byte로 움직임
	
	public void primarStream() {
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();
		FileWriter fw = null;
		
		try {
			//1.파일이 생성되고 스트림이 연결
			fw = new FileWriter(filename);
			System.out.println("["+filename+"] 파일에 저장할 내용을 입력하세요.");
			System.out.println("종료는 exit");
			while(true) {
				System.out.print("입력 : ");
				String str = sc.nextLine() + "\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				//문자스트림은 1문자단위로 전송하기때문에 바이트 배열로 변환x
				fw.write(str); //2.메소드를 통한 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//자원반환
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	//보조스트림
	public void subStream() {
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();
		BufferedWriter bw = null;//보조스트림
		
		try {
			//주스트림 생성
			FileWriter fw = new FileWriter(filename);
			//주스트림에 보조스트림 기능 추가
			bw = new BufferedWriter(fw);
			System.out.println("["+filename+"]에 저장할 내용 입력");
			System.out.println("종료는 exit");
			while(true) {
				System.out.print("입력 : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				bw.write(str);//보조스트림을 통한 데이터 전송
				bw.newLine(); //보조스트림에 존재하는 줄 개행 기능
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//보조스트림 반환 시 주스트림은 자동으로 반환
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void charStreamReader() {
		// 1. 스트림생성 > 2.메소드를 통한 입력 -> 3. 자원반환
		System.out.print("로드할 파일명 입력 :");
		String filename = sc.nextLine();
		// 데이터를 읽어올 보조스트림
		BufferedReader br = null;

		// 파일 읽어올 주스트림
		try {
			//주스트림
			FileReader fr = new FileReader(filename);
			//보조스트림
			br = new BufferedReader(fr);
			while(true) {
				//스트림이 연결된 파일에서 1줄 읽어옴
				//더이상 읽어올 내용이 없는 경우 null리턴
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
