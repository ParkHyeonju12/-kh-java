package kh.java.func;
import java.util.Random;
import java.util.Scanner;
 
public class Exam2 {
 
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
 
    public void exam2() {
 
        int userNum = 0; // 사용자가 게임 번호 선택하는 변수
        int userInput = 0; // 사용자가 입력하는 숫자를 저장 변수
        int comInput = 0; // 컴퓨터가 랜덤으로 숫자 받을 변수
        int win = 0; // 이긴 횟수
        int lose = 0; // 진 횟수
        int i = 0;
        int j = 0;
 
        loop1: while (true) {
            int count = 1; // 숫자 올리기
            System.out.println("===Game Start!===");
            System.out.println("1. Game Start");
            System.out.println("2. Game Score");
            System.out.println("3. End Game");
            System.out.print("당신의 선택은? --> ");
            userNum = sc.nextInt();
 
            if (userNum == 1) {
                loop2: for (i = 1; count <= 31; i++) {
                    System.out.println("<<Your Turn>>");
                    System.out.println("Input Number : ");
                    userInput = sc.nextInt();
 
                    if (1 <= userInput && userInput <= 3) {
 
                        for (j = 0; j < userInput; j++) {
                            System.out.println(count + "!");
                            if (count < 31) {
                                count++;
                            } else {
                                System.out.println("당신의 패배!");
                                lose++;
                                break loop2;
                            }
                        }
 
                        System.out.println("<<Computer Turn>>");
                        comInput = r.nextInt(3) + 1;
                        if (count < 28) {
                            for (j = 0; j < comInput; j++) {
                                System.out.println(count + "!");
                                count++;
                            }
                        } else if (count == 28) { // 상대방이 27을 외치는 순간 컴퓨터가 무조건 이기게 됨
                            for (j = 0; j < 3; j++) {
                                System.out.println(count + "!");
                                count++;
                            }
                        } else if (count == 29) {
                            for (j = 0; j < 2; j++) {
                                System.out.println(count + "!");
                                count++;
                            }
                        } else if (count == 30) {
                            for (j = 0; j < 1; j++) {
                                System.out.println(count + "!");
                                count++;
                            }
                        } else {
                            System.out.println("당신의 승리!");
                            win++;
                            break loop2;
                        }
 
                    } else {
                        System.out.println("1~3사이의 숫자를 입력해주세요!");
                    }
                } // loop2 끝
            } else if (userNum == 2) {
 
                System.out.println("===Game Score===");
                System.out.println("1. Win  : " + win);
                System.out.println("2. Lose : " + lose);
 
            } else if (userNum == 3) {
 
                System.out.println("게임을 종료합니다.");
                break loop1;
            }
 
        } // loop1 끝
 
    } // exam2() 끝
}// class 끝