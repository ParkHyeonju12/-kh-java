package kh.java.controller;

import java.util.HashMap;

import kh.java.view.PointView;
import kh.java.vo.Grade;

public class PointController {
	private PointView view;
	private HashMap<String, Grade> grades;
	

	public PointController() {
		super();
		// TODO Auto-generated constructor stub
		grades = new HashMap<String, Grade>();
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
		String name = view.getName("삭제");
		if(grades.containsKey(name)) {
			grades.remove(name);
		}else {
			view.nosearchGrade();
		}
		
	}

	private void updateGrade() {
		String name = view.getName("수정");
		if(grades.containsKey(name)) {
			Grade g = view.updateGrade();
			grades.put(g.getName(), g);
			if(!name.equals(g.getName())) {
				grades.remove(name);
			}
		}else {
			view.nosearchGrade();
		}
				
		
	}

	public void printOneGrade() {
		String name = view.getName("조회");
		if(grades.containsKey(name)) {
			Grade g = grades.get(name);
			view.printOneGrade(g);
		}else {
			view.nosearchGrade();
		}
	}

	public void printAllGrade() {
		// TODO Auto-generated method stub
		view.printAllGrade(grades);
		
	}

	public void insertGrade() {
		Grade g = view.insertGrade();
		grades.put(g.getName(), g);
	}

		
	}


