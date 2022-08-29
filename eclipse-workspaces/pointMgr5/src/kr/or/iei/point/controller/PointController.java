package kr.or.iei.point.controller;

import java.util.Scanner;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointController {
	private Grade[] members;
	private int index; //배열이 하나여서 인덱스도 하나
	private Scanner sc;
	private PointView view;
	
	public PointController() {
		members = new Grade[40];
		sc = new Scanner(System.in);
		view = new PointView();
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
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
			default :
				view.noSearchMember();
				break;
			}// switch종료
		} // while종료
	}//main 종료
	
	

	public void insertMember() {
		Grade g = view.insertMember();
		
		switch(g.getGrade()) {
		case "silver":
			members[index++] = new Silver(g.getGrade(), g.getName(), g.getPoint());
			break;
		case "gold":
			members[index++] = new Gold(g.getGrade(), g.getName(), g.getPoint());
			break;
		case "vip":
			members[index++] = new Vip(g.getGrade(), g.getName(), g.getPoint());
			break;
		case "vvip":
			members[index++] = new Vvip(g.getGrade(), g.getName(), g.getPoint());
			break;
		}// switch종료
		view.member();
	}// insertMember()종료
	
	public void printAllMember() {
		view.allPrint(members, index);
		
	}// printAllMember()종료
	
	public void printOneMember() {
		String name = view.getName("조회");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			 view.onePrint(members, searchIndex);
		}
	}// printOneMember()종료
	
	public int searchMember(String name) {
		for(int i=0; i<index; i++) {
			Grade g = members[i];
			if(name.equals(g.getName())) {
				return i;
			}
		} return -1;
	} // searchStudent(String searchName)종료
	
	public void updateMember() {
		String name = view.getName("수정");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			Grade g = view.updateMember();
			members[searchIndex] = g;
			view.member1();;
		}
	} // updateMember()종료
	
	public void deleteMember() {
		String name = view.getName("삭제");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.noSearchMember();
		}else {
			for (int i = searchIndex; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			index--;
			
			view.deleteStudent();
			
		}
	} // deleteMember()종료
	
}
