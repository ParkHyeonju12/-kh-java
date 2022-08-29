package kh.or.iei.student.controller;

import java.util.Scanner;

public class StudentController {
	//학생정보를 관리하는 프로그램
	//학생정보 이름, 나이, 주소
	//동명이인없음(가정), 데이터는 정상적으로 입력된다.
	private String[] name;
	private int[] age;
	private String[] addr;
	private Scanner sc;
	//배열관리번호(학생 정보 추가시 학생정보가 들어갈 배열 위치를 저장할 변수)
	private int index;
	
	public StudentController() {
		name = new String[10];
		age = new int[10];
		addr = new String[10];
		sc = new Scanner(System.in);
		index = 0;
	}
	
	//최초 실행메소드(메뉴를 제공) *CRUD*
	public void main() {
		while(true) {
			System.out.println("\n ------학생관리프로그램v1-----\n");
			System.out.println("1. 학생 정보 등록"); //Create:데이터 만들어서 저장하는 기능
			System.out.println("2. 학생 정보 출력(전체학생정보)"); //Read : 저장되어 있는 데이터를 읽어오는 기능
			System.out.println("3. 학생 정보 출력(1명: 이름으로 검색)"); //Read
			System.out.println("4. 학생 정보 수정");//Update : 저장되어 있는 데이터를 수정
			System.out.println("5. 학생 정보 삭제"); // Delete : 저장되어 있는 데이터를 삭제
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
				
			}//switch 종료
		} //while 종료
	} //main()종료
	//학생정보를 입력받아서 배열에 저장하는 메소드 
	public void insertStudent() {
		System.out.println("\n-----학생 정보 등록-----\n");
		System.out.print("학생 이름 입력 : ");
		String studentName = sc.next();
		System.out.print("학생 나이 입력: ");
		int studentAge = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine(); //버퍼의 엔터 제거용
		String studentAddr = sc.nextLine();
		name[index] = studentName;
		age[index] = studentAge;
		addr[index] = studentAddr;
		index ++; //배열 번호 순서대로 올리려고 사용함
		System.out.println("학생 정보 등록 완료!");
	}//insertStudent() 종료
	
	//배열에 저장되어있는 모든 학생 정보를 출력하는 메소드
	public void printAllStudent() {
		System.out.println("\n ------ 전체 학생 정보 출력 ------ \n");
		System.out.println("이름\t나이\t주소\t");
		System.out.println("-------------------------------");
		for(int i=0; i<index; i++) {
			System.out.print(name[i]+"\t"+age[i]+"\t"+addr[i]+"\t");
			System.out.println();
		}
	}// printAllStudent() 종료
	
	//학생 이름을 입력받아 조회 후 해당 학생 정보 출력하는 메소드
	public void printOneStudent() {
		System.out.println("\n------ 학생 1명 정보 출력 -----\n");
		System.out.print("조회 할 학생 이름 입력: ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
//		int searchIndex = -1; //배열의 존재하지 않는 수를 씀, 
		//배열이 9까지니까 10부터 아무 숫자나 써도 되지만 
		//음수 쓰면 조금 더 좋음
		// 배열의 길이가 늘어나도 수정 안해도 되거덩
		for(int i=0; i<index; i++) {
			if(searchName.equals(name[i])) { //문자열은 equals로 같은지 확인하기 == 못씀
				searchIndex = i;
				break;
			}
		}
		
		if(searchIndex == -1) {
			System.out.println("학생정보를 조회 할 수 없습니다.");
		}else {
			System.out.println("학생 이름: "+name[searchIndex]);
			System.out.println("학생 나이: "+age[searchIndex]);
			System.out.println("학생 주소: "+addr[searchIndex]);
		}
	} //printOneStudent() 종료
	
	//학생이름을 입력받아 해당 학생의 정보를 수정하는 메소드
	public void updateStudent() {
		System.out.println("\n------학생 정보 수정 ------\n");
		System.out.print("정보 수정할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("학생 정보를 조회 할 수 없습니다.");
		}else {
			System.out.print("수정할 이름 입력: ");
			name[searchIndex] = sc.next();
			System.out.println("수정할 나이 입력: ");
			age[searchIndex] = sc.nextInt();
			System.out.println("수정할 주소 입력: ");
			sc.nextLine();
			addr[searchIndex] = sc.nextLine();
			System.out.println("정보 수정 완료!");
		}
	}//updateStudent()종료
	
	//매개변수로 받은 이름이 name배열 몇번째에 존재하는지 
	//되돌려주는 메소드(조회실패 시 -1리턴)
	public int searchStudent(String searchName) {
		for(int i=0; i<index; i++) {
			if(searchName.equals(name[i])){
			return i;	
			}
		}
		return -1;
	} //searchStudent() 종료
	//이름을 입력받아 해당 학생을 삭제하는 메소드
	public void deleteStudent() {
		System.out.println("\n ------- 학생 정보 삭제 -------\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == 1) {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		}else {
			// 회원이 5명 
			// 배열 사용 번호 : 0~4 index : 5
			// 3번회원 삭제 2번인덱스 데이터 삭제
			// 2: 3번데이터입력
			for(int i = searchIndex; i<index-1; i++) {
				name[i] = name[i+1];
				age [i] = age [i+1];
				addr[i] = addr[i+1];
			}
			index --;
			System.out.println("삭제완료!");
//			name[searchIndex] = name[searchIndex+1];
//			// 3: 4번데이터입력
//			name[3] = name[4];
//			// 인덱스번호 -1
			
			
		}
		
	}//deleteStudent() 종료
} // class종료
