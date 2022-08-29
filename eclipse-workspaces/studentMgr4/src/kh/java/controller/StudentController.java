package kh.java.controller;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

import kh.java.view.StudentView;
import kh.java.vo.Student;

public class StudentController {
	private Student[] student1;
//	private int index;
	private ArrayList<Student> students;
	private StudentView view;
	public StudentController() {
		super();
//		student1 = new Student[10];
		students = new ArrayList<Student>();
		view = new StudentView();
	}
	
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
			default:
				break;
			}
		}
	}

	public void deleteStudent() {
		// TODO Auto-generated method stub
		String name = view.getName("삭제");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.nosearchStudent();
		}else {
		students.remove(searchIndex);
		}
	}

	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.nosearchStudent();
		}else {
			Student s = view.updateStudent();
			//1) setter 이용한방법
//			Student stu = student1[searchIndex];
//			Student stu = students.get(searchIndex)
//			stu.setName(s.getName());
//			
//			int updateAge = s.getAge();
//			stu.setAge(updateAge);
//			stu.setAddr(s.getAddr());
//		}
			//2) 객체를 교환하는 방법
//			student1[searchIndex] = s;
			students.set(searchIndex, s);
		}
	}

	public void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.nosearchStudent();
		}else {
//			Student s = student1[searchIndex];
			Student s = students.get(searchIndex);
			view.printOneStudent(s);
		}
	}

	public int searchStudent(String name) {
		
		for(int i=0; i<students.size(); i++) {
			Student s = students.get(i);
			if(name.equals(s.getName())) {
				return i;
			}
		}return -1;
		
//		for(int i=0; i<index; i++) {
//			Student s = student1[i];
//			if(name.equals(s.getName())) {
//				return i;
//			}
//		}return -1;
	}

	public void printAllStudent() {
		view.printAllStudent(students);
	}

	public void insertStudent() {
		Student s = view.insertStudent();
		students.add(s); //리스트 가장 뒤에 추가
	}
	
}

