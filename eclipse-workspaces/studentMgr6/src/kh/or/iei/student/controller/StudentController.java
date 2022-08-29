package kh.or.iei.student.controller;

import java.util.ArrayList;

import kr.or.iei.student.view.View;
import kr.or.iei.student.vo.Student;

public class StudentController {
	private ArrayList<Student> students;
	private View view;
	public StudentController() {
		super();
		students = new ArrayList<Student>();
		view = new View();
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch (sel) {
			case 1:
				Student s =view.insertStudent();
				students.add(s);
				break;
			case 2:
				view.printAllStudent(students);
				break;
			case 3:
				int num = searchIndex(view.searchOneStudent("조회"));
				Student ss = students.get(num);
				view.printOneStudent(num,ss);
				break;
			case 4:
				num = searchIndex(view.searchOneStudent("수정"));
				Student sss = students.get(num);
				view.printUdateStudent(num,sss);
				break;
				
			case 5:
				num = searchIndex(view.searchOneStudent("삭제"));
				deleteStudent(students,num);
				break;
				
			default:
				
				return;
			}
		}
	}

	public void deleteStudent(ArrayList<Student> students, int num) {
		if(num == -1) {
			view.nosearchStudent();
		}else {
			students.remove(num);
			view.getMsg("삭제");
		}
	}

	public int searchIndex(String name) {
		for(int i=0; i<students.size();i++) {
			Student s = students.get(i);
			if(s.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
}
