package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class sam {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public void sam() {
		System.out.println("<<Game Start>>");
		int num = r.nextInt(100)+1;
		System.out.println("randomNum : "+ num);
		System.out.print("번호 입력");
		int userNum = sc.nextInt();
		if(num < userNum) {
			System.out.println("<<Up>>");
		}else if(num < userNum) {
			System.out.println("<<Down>>");
		}else {
			System.out.println("<<정답>>");
			break;
		}
	}
	
}
