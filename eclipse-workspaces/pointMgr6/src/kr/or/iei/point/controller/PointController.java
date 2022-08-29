package kr.or.iei.point.controller;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Grade;

public class PointController {
	private Scanner sc;
	private PointView view;
	private ArrayList<Grade> grades;
	
	public PointController() {
		grades = new ArrayList<Grade>();
		sc = new Scanner(System.in);
		view = new PointView();
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1:
				insertGrade();
				break;
			case 2:
				printAllGrade();
				break;
			case 3:
				printOneGrade();
				break;
			case 4:
				updateGrade();
				break;
			case 5:
				deleteGrade();
				break;
			case 0:
				return;
			}
		}
	}

	public void deleteGrade() {
		// TODO Auto-generated method stub
		String name = view.getName("삭제");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.nosearchMember();
		}else {
			grades.remove(searchIndex);
		}
		
	}

	public void updateGrade() {
		// TODO Auto-generated method stub
		String name = view.getName("수정");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.nosearchMember();
		}else {
			Grade g = view.updateMember();
			grades.set(searchIndex, g);
		}
	}

	public void printOneGrade() {
		String name = view.getName("조회");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.nosearchMember();
		}else {
			Grade g = grades.get(searchIndex);
			view.printOneMembers(g);
		}
	}

	public int searchMember(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<grades.size(); i++) {
			Grade g = grades.get(i);
			if(name.equals(g.getName())) {
				return i;
			}
		}return -1;
	}

	public void printAllGrade() {
		view.printAllGrade(grades);
	}

	public void insertGrade() {
//		String name  = view.getName("등록");
		Grade g = view.insertGrade();
		grades.add(g);
		
	}
}
