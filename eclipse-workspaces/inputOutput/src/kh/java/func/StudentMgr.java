package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgr implements Serializable {
	private ArrayList<Student> students;
	private Scanner sc;

	public StudentMgr() {
		super();
		sc = new Scanner(System.in);
		students = new ArrayList<Student>();
//		importStudent();
		// TODO Auto-generated constructor stub
	}

	public void main() {
		while (true) {
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 전체조회");
			System.out.println("3. 정보 내보내기");
			System.out.println("4. 정보 불러오기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent(students);
				break;
			case 3:
				exportStudent();
				// students를 직렬화해서 내보내기
				// 파일이름은 students.txt
				break;
			case 4:
				importStudent();
				break;
			case 0:
				return;
			}
		}
	}

	public void exportStudent() {
		// TODO Auto-generated method stub
		// 보조스트림
		ObjectOutputStream oos = null;

		try {
			// 주스트림
			FileOutputStream fis = new FileOutputStream("students.txt");
			oos = new ObjectOutputStream(fis);

			System.out.println("객체 내보내기 완료\n");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("=====전체 학생 조회=====");
		System.out.println("이름\t나이\t주소");
		for (Student s : students) {
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr() + "\n");
		}
		// TODO Auto-generated method stub
	}

	public void insertStudent() {
		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("이름 입력 :");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		students.add(s);
		System.out.println();

	}

	public void importStudent() {
		ObjectInputStream ois = null;

		try {
			FileInputStream fis = new FileInputStream("students.txt");
			ois = new ObjectInputStream(fis);
			students = (ArrayList<Student>) ois.readObject();


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
