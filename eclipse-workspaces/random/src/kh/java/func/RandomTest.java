////난수 : 임의의 값/ 무작위로 만들어지는 알 수 없는 값
////자바에서 난수를 제공하는 기능: Random
////Random 사용법ㅂ
//// 1) import java.util.Random
//// 2) Random r = new Random();
//
package kh.java.func;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class RandomTest {
//	Random r = new Random();
//	Scanner sc = new Scanner(System.in);
//
//	public void test1() {
//		int num = r.nextInt(); // int 범위 내에서 랜덤숫자 1개 가져옴
//		System.out.println(num);
//		int num1 = r.nextInt();
//		System.out.println(num1);
//		int num2 = r.nextInt(21) + 10;
//		System.out.println(num2);
//		// r.nextInt(개수)+시작숫자;
//		int num3 = r.nextInt(16) + 20;
//		System.out.println(num3);
//
//	}
//
//	public void coin() {
//
//		int win = 0; // 정답 횟수 저장용 변수
//		int lose = 0; // 오답 횟수 저장용 변수
//		int gameNum = 0; // 게임 총 횟수 저장용 변수
//		while (true) {
//
//			System.out.println("===== 동전 앞/뒤 맞추기 =====");
//			System.out.println("1. Game Start");
//			System.out.println("2. Game Score");
//			System.out.println("3. End Game");
//			System.out.print("선택 --> ");
//
//			int sel = sc.nextInt();
//
//			if (sel == 1) {
//				int coin = r.nextInt(2) + 1;
//
//				System.out.println("\n====Game Start!====");
//				System.out.print("맞춰보세요(1.앞면/2.뒷면) : ");
//
//				int userSelect = sc.nextInt();
//
//				gameNum++;
//
//				if (coin == userSelect) {
//					System.out.println("정답");
//					win++;
//				} else {
//					System.out.println("땡! 다시 도전!");
//					lose++;
//				}
//
//				System.out.println("coin : " + coin);
//
//			} else if (sel == 2) {
//				System.out.println("--------- Game Score ---------");
//				System.out.println("게임횟수 : " + gameNum + "\n정답 개수 : " + win + "\n오답 개수 : " + lose);
//
//			} else if (sel == 3) {
//				System.out.println("아쉽지만 뇽안");
//				break;
//			} // 메뉴 무한반복 while 종료지점
//		}
//	}
//
//	public void game1() {
//		int user = 0; // 사용자 변수
//		int computer = 0; // 컴퓨터 변수
//
//		while (true) {
//			System.out.println("===가위 바위 보 게임===");
//			System.out.print("숫자를 선택하세요(1.가위/ 2.바위/ 3.보) : ");
//			user = sc.nextInt();
//			computer = r.nextInt(3) + 1;
//
//			System.out.println("=====결과=====");
//			if (user == 1) {
//				System.out.println("당신은 가위를 냈습니다.");
//
//			} else if (user == 2) {
//				System.out.println("당신은 바위를 냈습니다.");
//			} else if (user == 3) {
//				System.out.println("당신은 보를 냈습니다.");
//			}
//
//			if (computer == 1) {
//				System.out.println("컴퓨터는 가위를 냈습니다.");
//
//			} else if (computer == 2) {
//				System.out.println("컴퓨터는 바위를 냈습니다.");
//			} else if (computer == 3) {
//				System.out.println("컴퓨터는 보를 냈습니다.");
//			}
//
//			System.out.println("=============");
//			if (user == computer) {
//				System.out.println("비겼습니다.");
//			} else if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
//				System.out.println("당신은 졌습니다.");
//			} else if (user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2) {
//				System.out.println("당신은 이겼습니다.ㅠㅠ");
//				System.out.println("당신이 이겼으므로 게임을 종료합니다.");
//				break;
//			}
//			System.out.println();
//		}
//	}
//
//	public void upDownGame() {
//		int user = 0; // user가 입력한 숫자변수
//		int computer = 0; // computer가 입력한 숫자변수(1~100)
//		int userNum = 0; // user가 입력하는 번호
//		int gameNum = 0;// 게임 회차 저장 변수
//		int score = 0; // 총 게임 횟수
//
//		Loop0: while (true) {
//			System.out.println("----------난수 실습문제 실행파일----------");
//			System.out.println("1. 실습문제 4번(UpAndDown)");
//			System.out.println("2. 실습문제 5번(BaskinRobbins)");
//			System.out.println("3. 실습문제 6번(Dice)");
//			System.out.println("0. 프로그램 종료");
//			System.out.print("선택 --> ");
//			user = sc.nextInt();
//
//			if (user == 1) {
//				user = 0;
//				Loop1: while (true) {
//					System.out.println("=====Up & Down Game=====");
//					System.out.println("1.Game Start");
//					System.out.println("2.Game Score");
//					System.out.println("3.End Game");
//					System.out.print("선택 --> ");
//					user = sc.nextInt();
//
//					if (user == 1) {
//						System.out.println("<<Game Start>>");
//						computer = r.nextInt(100) + 1;
//						Loop2: for (gameNum = 1;; gameNum++) {
//							System.out.print(gameNum + "회차 번호 입력 : ");
//							userNum = sc.nextInt();
//							while (true) {
//								if (!(1 <= userNum && userNum <= 100)) {
//									System.out.println("1~100사이의 있는 숫자로 입력해주세요!");
//								} else {
//									break;
//								}
//
//							}
//
//							while (true) {
//								if (userNum == computer) {
//									System.out.println("<<정답>>");
//									break Loop2;
//								} else if (userNum < computer) {
//									System.out.println("<<Up>>");
//
//								} else if (userNum > computer) {
//									System.out.println("<<Down>>");
//
//								}
//								System.out.println();
//								score = gameNum + 1;
//								break;
//							}
//						}
//
//					} else if (user == 2) {
//						int score1 = gameNum + 1;
//						;
//						if (score <= score1) {
//							System.out.println("현재 최고 기록은 " + score + "회 입니다.");
//						} else if (score > score1) {
//							System.out.println("현재 최고 기록은 " + score1 + "회 입니다.");
//						}
//					} else if (user == 3) {
//						System.out.println("바이바이");
//						break Loop1;
//					}
//
//				}
//
//			}
//		}
//		
//	}
//	
//	public void br31() {
//		static Scanner s = new Scanner(System.in);
//	    static int meWin = 0;
//	    static int comWin = 0;
//	 
//	    public static void main(String[] args) {
//	        
//	        while(true)
//	        {
//	            System.out.println("==== Baskin Robbins31 Game ====");
//	            System.out.println();
//	            System.out.println("1. Game Start");
//	            System.out.println("2. Game Score");
//	            System.out.println("3. End Game");
//	            System.out.print("\n> ");
//	            
//	            int menuSelect = s.nextInt();
//	            
//	            if(menuSelect == 1) {
//	              game();
//	            } else if(menuSelect == 2) {
//	                System.out.println("\n=== SCORE ====\n");    
//	                System.out.println("Me Win: " + meWin);
//	                System.out.println("Com Win: " + comWin);
//	                if (meWin == 0 && comWin == 0)
//	                    System.out.println("아직 게임을 시작하지 않으셨군요? 게임을 먼저 해보세요!");
//	                System.out.println();
//	            } else if(menuSelect == 3) {
//	                System.out.println("\nThank you for playing!");
//	                System.exit(0);
//	            }
//	            else {
//	                System.out.println("Enter correct number please! (1~3)\n");
//	            }                        
//	        }
//	 
//	    }
//	
//public class BaskinRobbins {
//	    public void game2(){
//	        System.out.println();
//	        System.out.println("<< Game Start >>");
//	        
//	        int lastNum = 0;        
//	        
//	        while(true) {    
//	            
//	            // =======사용자 턴=========
//	            int userNum = 1;
//	            while(true) {
//	                
//	                System.out.print("Input Number(1~3) >> ");
//	                userNum = s.nextInt();
//	                
//	                if (1 <= userNum && userNum <= 3)
//	                    break;
//	                else
//	                    System.out.println("숫자를 제대로 입력하세요. (1~3)\n");
//	            }                
//	            
//	            // 숫자 외치기(사람)
//	            for(int i = (lastNum + 1); i <= lastNum + userNum; i++) {
//	                
//	                if ( i > 31 ) {
//	                    break;
//	                }
//	                System.out.println(i + " " + "!");                 
//	            }
//	            
//	            lastNum += userNum;
//	            if (lastNum >= 31) {
//	                //System.out.println(lastNum);
//	                System.out.println("\n너의 패배입니다. 컴퓨터의 승리입니다.\n");
//	                comWin++;
//	                break;
//	            }
//	                
//	            System.out.println();
//	                
//	            // =======컴퓨터 턴=========           
//	            System.out.println("컴퓨터 턴!");
//	            
//	            int comNum = 0;
//	            
//	            if ( lastNum == 27 )    // lasNum이 27일때 무조건 3(28, 29, 30)
//	                comNum = 3;
//	            else if ( lastNum == 28 )    // lasNum이 28일때 무조건 2(29, 30)
//	                comNum = 2;
//	            else if ( lastNum == 29 )    // lasNum이 29일때 무조건 1(30)
//	                comNum = 1;
//	            else
//	                comNum = (int)( Math.random() * (3 - 1 + 1)  + 1 );    // 1~3
//	            
//	            // 숫자 외치기(컴)
//	            for(int i = (lastNum + 1); i <= lastNum + comNum; i++) {
//	                        
//	                if ( i > 31 ) {
//	                    break;
//	                }
//	                System.out.println(i + " " + "!");      
//	            }
//	            
//	            lastNum += comNum;
//	            
//	            if (lastNum >= 31) {
//	                System.out.println("\n컴퓨터의 패배입니다. 너의 승리입니다.\n");
//	                meWin++;
//	                break;
//	            }
//	                
//	            System.out.println();
//	        }
//	    }
//	 
//	
//	}
//}


