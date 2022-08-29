package kh.java.func;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	private Scanner sc;

	public ByteStreamTest() {
		super();
		sc = new Scanner(System.in);
	}

	public void primaryStream() {
		// 1.스트림 생성 -> 2. 메소드를 통한 입/출력 -> 3. 자원반환
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();

		FileOutputStream fos = null;
		try {
			// 입력받은 파일명으로 파일생성
			// 생성된 파일과 프로그램 stream연결
			fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + filename);
			System.out.println("[" + filename + "] 파일에 저장될 내용을 입력하세요");
			System.out.println("종료는 exit를 입력하세요.");
			while (true) {
				System.out.print("내용입력 : ");
				String str = sc.nextLine()+"\r\n";
				if (str.equals("exit\r\n")) {
					break;
				}
				byte[] arr = str.getBytes(); // 문자열을 바이트배열로 변환
				// write메소드의 매개변수가 byte[]타입이기 때문에
				fos.write(arr);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
