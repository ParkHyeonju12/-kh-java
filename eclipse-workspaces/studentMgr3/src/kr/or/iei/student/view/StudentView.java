package kr.or.iei.student.view;

import java.util.Scanner;

import javax.crypto.SealedObject;

import kr.or.iei.sudent.vo.Student;

public class StudentView {
	private Scanner sc;
	
	
	public  StudentView() {
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {
		System.out.println("=====학생 관리 프로그램=====");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 전체 출력");
		System.out.println("3. 학생 1명 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	} //showMenu() 종료
	
	public Student insertStudent() {
		System.out.println("======학생 정보 등록======");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age, addr);
		return s;
	} // insertStudent() 종료
	
	public Student updateStudent() {
		System.out.println("======수정할 학생 정보 등록======");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age, addr);
		return s;
	}//updateStudent()종료
	
	//방법2
//	public Student updateStudent() {
//		Student s = new Student();
//		System.out.println("======수정할 학생 정보 등록======");
//		System.out.print("이름 입력 : ");
//		String name = sc.next();
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		System.out.print("주소 입력 : ");
//		sc.nextLine();
//		String addr = sc.nextLine();
//		Student s = new Student(name,age, addr);
//		return s;
//	}//updateStudent()종료
	
	
	
	public void insertSuccess() {
		System.out.println("회원가입 완료!");
	} // insertSuccess() 종료
	
	public void insertSuccess2() {
		System.out.println("회원 정보 수정 완료!");
	} // insertSuccess2() 종료
	
	public void printAllStudent(Student[] students, int index) {
		System.out.println("=====전체 학생 출력=====");
		System.out.println("이름\t나이\t주소");
		System.out.println("---------------------");
		for(int i=0; i<index; i++) {
			Student s = students[i];
			System.out.printf("%s\t%d\t%s\n"
					,s.getName()
					,s.getAge()
					,s.getAddr());
		}
	} //printAllStudent(Student[] students, int index)종료
	
	public String getName(String str) {
		System.out.println("=====학생 정보 "+str+"=====");
		System.out.println(str+"할 이름 입력 :");
		String name = sc.next();
		return name;
	}
	
//	public String getName() {
//		System.out.println("=====학생 1명 조회=====");
//		System.out.print("조회 할 이름 입력 : ");
//		String name = sc.next();
//		return name;
//	}//printOneStudent() 종료
	
//	public String getName2() {
//		System.out.print("수정 할 이름 입력 : ");
//		String name = sc.next();
//		return name;
//	}//getName2() 종료
//	
//	public String getName3() {
//		System.out.print("삭제 할 이름 입력 : ");
//		String name = sc.next();
//		return name;
//	}//getName3() 종료
	
	public void noSearchStudent() {
		System.out.println("회원을 찾을 수 없습니다.");
	} //noSearchStudent()종료
	
	public void printOneStudent(Student s) {
		System.out.println("=====학생 1명 출력=====");
		System.out.println("이름\t나이\t주소");
		System.out.printf("%s\t%d\t%s\n"
				,s.getName()
				,s.getAge()
				,s.getAddr());
	} // printOneStudent(Student[] students, int index)종료
	
	public void deleteStudent(){
	System.out.println("정보 삭제 완료!");
	}
	
}
