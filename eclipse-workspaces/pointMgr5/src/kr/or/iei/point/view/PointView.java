package kr.or.iei.point.view;

import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointView {
	private Scanner sc;

	public PointView() {
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("=====회원관리프로그램 v5=====");
		System.out.println("1.회원 정보 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원 1명 출력");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 정보 삭제");
		System.out.println("0.프로그램 종료");
		int sel = sc.nextInt();
		return sel;
	}// showMenu()

	public Grade insertMember() {
		System.out.println("=====회원 정보 등록=====");
		System.out.println("회원 등급 입력[silver/gold/vip/vvip]");
		String grade = sc.next();
		System.out.println("회원 이름 입력 : ");
		String name = sc.next();
		System.out.println("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			return s;
		case "gold":
			Gold g = new Gold(grade, name, point);
			return g;
		case "vip":
			Vip v = new Vip(grade, name, point);
			return v;
		case "vvip":
			Vvip vv = new Vvip(grade, name, point);
			return vv;
		}// switch(grade)종료
		return null;
	} // insertMember() 종료

	public String getName(String str) {
		System.out.println("=====회원 정보 " + str + "=====");
		System.out.println(str + "할 이름 입력 :");
		String name = sc.next();
		return name;
	}// getName(String str)종료

	public void insertSuccess(String str) {
		System.out.println("회원 정보 " + str + "완료!");
	} // insertSuccess() 종료

	public void printOneMember(String name, Grade[] members) {

	}// printOneMember()종료

	public Grade updateMember() {
		System.out.println("======수정할 학생 정보 등록======");
		System.out.println("수정할 회원 등급 입력[silver/gole/vip/vvip]");
		String grade = sc.next();
		System.out.println("수정할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.println("수정할 회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			return s;
		case "gold":
			Gold g = new Gold(grade, name, point);
			return g;
		case "vip":
			Vip v = new Vip(grade, name, point);
			return v;
		case "vvip":
			Vvip vv = new Vvip(grade, name, point);
			return vv;
		default:
			noSearchMember();
			break;
			}//switch(grade)종료
		return null;
	}// updateStudent()종료

	public void noSearchMember() {
		System.out.println("회원을 찾을 수 없습니다.");
	} // noSearchStudent()종료

	public void member() {
		System.out.println("회원 등록 완료!");
	} // noSearchStudent()종료

	public void member1() {
		System.out.println("회원 정보 수정 완료!");
	} // noSearchStudent()종료

	public void allPrint(Grade[] members, int index) {
		System.out.println("=====전체 회원 정보=====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------");
		for (int i = 0; i < index; i++) {
			Grade g = members[i];
			System.out.printf("%s\t%s\t%d\t%.2f\n", g.getGrade(), g.getName(), g.getPoint(), g.getBonus());
		}
	}// allPrint(Grade[] members, int index)종료

	public void onePrint(Grade[] members, int searchIndex) {
		System.out.println("등급 : " + members[searchIndex].getGrade());
		System.out.println("이름 : " + members[searchIndex].getName());
		System.out.println("포인트 : " + members[searchIndex].getPoint());
		System.out.println("보너스 : " + members[searchIndex].getBonus());
	}//allprint1종료
	
	public void deleteStudent(){
		System.out.println("정보 삭제 완료!");
		}//deleteStudent()종료

}// PointView 종료
