package kr.or.iei.student.controller;

import java.util.Scanner;
import java.util.Set;

import kr.or.iei.student.vo.Student;

public class StudentController { // 1번
	private Student[] students;
	private Scanner sc;
	private int index;

	public StudentController() { // 2번
		students = new Student[10];
		sc = new Scanner(System.in);
		index = 0;
	} // StudentController()끝

	public void main() { // 3번
		while (true) {
			System.out.println("\n------학생 관리 프로그램 v2------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력(1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) { // 4
			case 1:
				insertStudent(); // 5
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
				deletestudent();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}// switch 끝
		} // while 끝
	}// main 끝

	public void insertStudent() { // 6
		System.out.println("\n--------학생 정보 등록---------\n");
		System.out.print("등록 할 학생 이름 입력: ");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력: ");
		int age = sc.nextInt();
		System.out.print("등록 할 학생 주소 입력: ");
		sc.nextLine();
		String addr = sc.nextLine();
		// 1) 기본 생성자 이용(변수값이 비어있는 학생 객체생성)
		/*
		 * Student s = new Student(); s.setName(name); s.setAge(age); s.setAddr(addr);
		 */
		// 2) 매개변수 있는 생성자 이용
		Student s = new Student(name, age, addr);
		students[index++] = s; // 여기 쪼금 어려웡ㅠ 배열에는 s객체의 주소를 넣어준거얌
		System.out.println("학생 정보 등록 완료!");
	} // insertStudent()끝

	public void printAllStudent() {
		System.out.println("\n------전체 학생 정보 출력------\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("-----------------------------");
//		students -> 배열
//		students[인덱스번호] -> Student
//		students[인덱스번호].getter 호출
		for (int i = 0; i < index; i++) {
			System.out.println(students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getAddr());
		}
	}// printAllStudent() 끝

	public void printOneStudent() {
		System.out.println("\n---------학생 정보 출력---------\n");
		System.out.println("조회 할 학생 이름 입력 :");
		String name= sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			System.out.println("학생 정보를 조회 할 수 없습니다.");
		}else {
			System.out.println("학생 이름: "+students[searchIndex].getName());
			System.out.println("학생 나이: "+students[searchIndex].getAge());
			System.out.println("학생 주소: "+students[searchIndex].getAddr());
		}
	}//printOneStudent()끝
	
	public void updateStudent() {
		System.out.println("\n----------회원 정보 수정 -----------\n");
		System.out.println("수정할 회원 이름 입력");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			System.out.println("수정 할 이름 입력: ");
			String updateName = sc.next();
			System.out.println("수정 할 나이 입력: ");
			int updateAge = sc.nextInt();
			System.out.println("수정 할 주소 입력:");
			sc.nextLine();
			String updateAddr = sc.nextLine();
			
			Student s = students[searchIndex];
			s.setName(updateName);
			s.setAge(updateAge);
			s.setAddr(updateAddr);
			System.out.println("정보 수정 완료!");
		}
	}// updateStudent()끝
	
	public void deletestudent() {
		System.out.println("\n ------- 학생 정보 삭제 -------\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			for(int i = searchIndex; i<index-1; i++) {
				students[i] = students[i+1];
			}
			index --;
			System.out.println("정보 삭제 완료!");
	}
		}//deletestudent()끝
	
	public int searchStudent(String searchName) {
		for (int i = 0; i < index; i++) {
			if (searchName.equals(students[i].getName())) {
				return i;
			}
		}
		return -1;
	}// searchStudent(String searchName)끝
} 
