package kr.or.iei.point.controller;

import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointControllerImp1 implements PointController {
	/*
	 Silver 객체 저장용 배열, Gold저장용 배열, Vip,Vvip 저장용 배열
	 각 배열의 인덱스 관리용 변수
	 Scanner
	 */
	
	//Silver,Gold,Vip,Vvip가 모두 저장 가능한 타입 ->Grade
	private Grade[] members;
	private int index; //배열이 하나여서 인덱스도 하나
	private Scanner sc;
	
	
	
	public PointControllerImp1() {
		super();
		members = new Grade[40];
		sc = new Scanner(System.in);
	}

	@Override
	public void main() {
		while (true) {
			System.out.println("=====회원관리프로그램 v4=====");
			System.out.println("1.회원 정보 등록");
			System.out.println("2.전체 회원 출력");
			System.out.println("3.회원 1명 출력");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 정보 삭제");
			System.out.println("0.프로그램 종료");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	@Override
	public void insertMember() {
		System.out.println("=====회원 정보 등록=====");
		System.out.println("회원 등급 입력[silver/gole/vip/vvip]");
		String grade = sc.next();
		System.out.println("회원 이름 입력 : ");
		String name = sc.next();
		System.out.println("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			Grade newMember = (Grade)s; //업캐스팅
			members[index] = newMember;
			index++;
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			Grade newMember2 = (Grade)g;
			members[index++] = newMember2;
			break;
		case "vip":
			Grade newMember3 = new Vip(grade, name, point);
			members[index++] = newMember3;
			break;
		case "vvip":
			members[index++] = new Vvip(grade, name, point);
			break;
		}
		System.out.println("회원 등록 완료");
	}

	@Override
	public void printAllMember() {
		System.out.println("=====전체 회원 정보=====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------");
		for(int i=0; i<index; i++) {
			Grade g = members[i];
			System.out.printf("%s\t%s\t%d\t%.2f\n"
					,g.getGrade()
					,g.getName()
					,g.getPoint()
					,g.getBonus());
		}
	}

	@Override
	public void printOneMember() {
		System.out.println("=====회원 정보 출력=====");
		System.out.println("조회할 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			System.out.println("회원을 찾을 수 없습니다.");
		}else {
			System.out.println("등급 : " + members[searchIndex].getGrade());
			System.out.println("이름 : " + members[searchIndex].getName());
			System.out.println("포인트 : " + members[searchIndex].getPoint());
			System.out.println("보너스 : " + members[searchIndex].getBonus());
		}
	}

	@Override
	public void updateMember() {
		System.out.println("=====회원 정보 수정 =====");
		System.out.println("수정할 회원 이름 입력: ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
	
		if(searchIndex == -1) {
			System.out.println("회원을 찾을 수 없습니다.");
		}else {
									
			System.out.print("수정할 회원 등급 입력:");
			String grade = sc.next();

			System.out.print("수정할 회원 이름 입력:");
			String updateName = sc.next();

			System.out.print("수정할 회원 포인트 입력 : ");
			int point = sc.nextInt();
			
			switch(grade) {
			case "silver":
				members[searchIndex] = new Silver(grade, updateName, point);
				break;
			case "gold":
				members[searchIndex] = new Gold(grade, updateName, point);
				break;
			case "vip":
				members[searchIndex] = new Vip(grade, updateName, point);
				break;
			case "vvip":
				members[searchIndex] = new Vvip(grade, updateName, point);
				break;
			}
			System.out.println("정보 수정 완료!");
		}
	}

	@Override
	public void deleteMember() {
		System.out.println("=====회원 정보 삭제 =====");

		System.out.print("삭제할 회원 이름 입력: ");
		String name = sc.next();

		int searchsIndex = searchStudent(name);

		if (searchsIndex == -1) {
			System.out.println("회원을 조회 할 수 없습니다.");
		} else {
				for (int i = searchsIndex; i < index - 1; i++) {
					
					members[i] = members[i + 1];
				}
				index--;
			}
			System.out.println("정보 삭제 완료!");
		
	} // deleteUeser()종료

	

	@Override
	public int searcMember(String name) {
		return 0;
	}

	public int searchStudent(String searchName) {
		for (int i = 0; i < index; i++) {
			if (searchName.equals(members[i].getName())) {
				return i;
			}
		}
		return -1;
	}// searchStudent(String searchName)끝
	
}
