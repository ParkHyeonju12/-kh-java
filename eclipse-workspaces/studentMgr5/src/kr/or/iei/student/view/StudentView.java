package kr.or.iei.student.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.iei.student.vo.Student;

public class StudentView {
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	public int showMenu() {
		System.out.println("===== 학생관리프로그램 v5 ===== ");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 전체 학생 출력");
		System.out.println("3. 학생 1명 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public Student insertStudent() {
		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		return s;

	}

	public void printAllStudent(HashMap<String, Student> students) {
		System.out.println("===== 전체 학생 출력 =====");
		System.out.println("이름\t나이\t주소");

		Set<String> names = students.keySet(); // 키값으로 전부 꺼내기

		for (String name : names) {
			Student s = students.get(name);

			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		}
	}

	public String getName(String str) {
		System.out.println("=====학생 정보 "+str+" =====");
		System.out.print(str+"할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void nosearchStudent() {
		System.out.println("학생 정보를 찾을 수 없습니다.");
		
	}

	public void printOneStudent(Student s) {
		System.out.println("이름 : "+s.getName());
		System.out.println("나이 : "+s.getAge());
		System.out.println("주소 : "+s.getAddr());
	}

	public Student updateStudent() {
		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("수정 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("수정 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		return s;
		
	}

}
