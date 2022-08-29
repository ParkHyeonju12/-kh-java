package kh.java.func;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String filename = sc.nextLine();
		File file = new File(filename);
		//exists() 파일명이 있으면 t/없으면 f
		if(file.exists()) {
			System.out.println("파일이름 : "+file.getName());
			System.out.println("파일 절대경로 : "+file.getAbsolutePath() );
			System.out.println("파일 크기 : "+file.length()+"Byte");
			System.out.println("해당파일을 삭제하시겠습니까? (1.yes/2.no)");
			int sel = sc.nextInt();
			if(sel == 1) {
			boolean bool =	file.delete();//해당파일을 삭제하고 그 결과를 리턴 
			System.out.println(bool);
			}
		}else {
			System.out.println("파일을 찾을 수 없습니다.");
			
		}
	}
}
