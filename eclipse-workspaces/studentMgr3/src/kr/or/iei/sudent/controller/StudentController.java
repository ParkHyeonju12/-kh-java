package kr.or.iei.sudent.controller;

import java.util.Scanner;

import kr.or.iei.student.view.StudentView;
import kr.or.iei.sudent.vo.Student;

public class StudentController {
	private Student[] students;
	private int index;
	private Scanner sc;
	private StudentView view;
	
	public StudentController() {
		students = new Student[10];
		sc = new Scanner(System.in);
		view = new StudentView();
		}// StudentController() 종료
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
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
				return;
			}
		} // while(true)종료
	}//main()종료
	
	
	//사용자에게 이름,나이,주소를 입력받아서 배열에 저장
	public void insertStudent() {
		Student s = view.insertStudent();
		students[index++] = s;
		view.insertSuccess();
//		String name = s.getName();
//		int age = s.getAge();
//		String addr = s.getAddr();
//		Student students = new Student(name, age, addr);
//		this.students[index] = students;
//		index ++;
	}//insertStudent() 종료
	
	public void printAllStudent() {
		view.printAllStudent(students,index);
	} //printAllStudent() 종료
	
	public void printOneStudent() {
		//1.이릅 입력(view)
		//2. 이름이 존재하는지 조회(controller)
		//3. 조회결과에 따른 출력(view)
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			Student s = students[searchIndex];
			view.printOneStudent(s);
		}
	} // printOneStudent() 종료
	
	public int searchStudent(String name) {
		for(int i=0; i<index; i++) {
			Student s = students[i];
			if(name.equals(s.getName())) {
				return i;
			}
		} return -1;
	} // searchStudent(String searchName)종료
	
	public void updateStudent() {
		//1) 수정할 이름 입력(view)
		//2) 받아온 학생이 배열에 존재하는지 조회(Controller)
		
		//3) 조회 결과에 따른 처리
		//3-1) 조회결과가 없는 경우 조회할 수 없습니다. 출력(view)
		//3-2) 조회결과가 있는 경우  
		//3-1-1) 수정할 학생 정보 입력받기(view)  
		//3-1-2)수정할 학생 정보 배열에 반영(Controller)
		String name = view.getName("수정");
		
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			Student s = view.updateStudent();
			students[searchIndex] = s;
			view.insertSuccess2();
		}
	}// updateStudent()
	
	public void deleteStudent() {
		//1) 삭제할 이름 입력(view)
		//2) 받아온 학생이 배열에 존재하는지 조회(Controller)
		//3-1) 조회결과가 없는 경우 조회할 수 없습니다. 출력(view)
		//3-2) 조회결과가 있는 경우  
		//3-1-1) 삭제처리 (Controller)
		//3-1-2) 삭제처리됨 출력(view)
		String name = view.getName("삭제");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		}else {
			for (int i = searchIndex; i < index - 1; i++) {
				students[i] = students[i + 1];
			}
			index--;
			
			view.deleteStudent();
			
		}
	}//deleteStudent()종료
	
}
