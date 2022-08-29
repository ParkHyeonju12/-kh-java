package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMgr {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		
		User u = new User(id,pw,name,age);
		
		//객체내보내기(백업작업과 비슷)
		//객체를 내보내기위한 보조스트림(단독 사용 불가, 주스트림 생성 필요)
		ObjectOutputStream oos = null;
		
		
		try {
			//주 스트림
			FileOutputStream fis = new FileOutputStream("object.txt");
			oos = new ObjectOutputStream(fis);
			
			//객제 내보내는 코드
			oos.writeObject(u);
			System.out.println("객체 내보내기 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void test2() {
		//직렬화를 통해 내보낸 데이터를 불러오기
		//보조스트림 생성
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("object.txt");
			ois = new ObjectInputStream(fis);
			
			//다운캐스팅
			User u = (User)ois.readObject();
			
			System.out.println(u.getId());
			System.out.println(u.getPw());
			System.out.println(u.getName());
			System.out.println(u.getAge());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
