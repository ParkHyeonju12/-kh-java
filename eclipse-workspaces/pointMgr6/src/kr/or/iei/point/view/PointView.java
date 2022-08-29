package kr.or.iei.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.vo.Grade;

public class PointView {
	private Scanner sc;
	
	public PointView() {
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("=====회원관리프로그램 v6=====");
		System.out.println("1.회원 정보 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원 1명 출력");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 정보 삭제");
		System.out.println("0.프로그램 종료");
		int sel = sc.nextInt();
		return sel;
	}

	public String getName(String str) {
		System.out.println("-----회원 정보 "+str );
		System.out.println(str+"할 회원 입력 : ");
		String name = sc.next();
		return name;
	}

	public Grade insertGrade() {
		System.out.println("-----회원 정보 등록-----");
		System.out.println("등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("포인트 입력 : ");
		int point = sc.nextInt();
		Grade g = new Grade(grade,name,point);
		return g;
	}

	public void printAllGrade(ArrayList<Grade> grades) {
		System.out.println("-----회원 전체 출력-----");
		System.out.println("등급\t이름\t포인트\t보너스");
		for(Grade g : grades) {
		if(g.getGrade().equals("silver")) {
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getPoint()*0.02);
		}else if(g.getGrade().equals("gold")) {
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getPoint()*0.05);
		}else if(g.getGrade().equals("vip")) {
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getPoint()*0.07);
		}else if(g.getGrade().equals("vvip")) {
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getPoint()*0.1);
		}
	}
}

	public void nosearchMember() {
		// TODO Auto-sout method stub
		System.out.println("회원 정보를 찾을 수 없습니다.");
		
	}

	public void printOneMembers(Grade g) {
		System.out.println("등급 : "+g.getGrade());
		System.out.println("이름 : "+g.getName());
		System.out.println("포인트 : "+g.getPoint());
		if(g.getGrade().equals("silver")) {
			System.out.println("보너스 : "+g.getPoint()*0.02);
		}else if(g.getGrade().equals("gold")) {
			System.out.println("보너스 : "+g.getPoint()*0.05);
		}else if(g.getGrade().equals("vip")) {
			System.out.println("보너스 : "+g.getPoint()*0.07);
		}else if(g.getGrade().equals("vvip")) {
			System.out.println("보너스 : "+g.getPoint()*0.1);
		}
		
	}

	public Grade updateMember() {
		Grade g = new Grade();
		System.out.print("수정할 등급 입력 : ");
		String grade = sc.next();
		g.setGrade(grade);
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		g.setName(name);
		System.out.print("수정할 포인트 입력 : ");
		int point = sc.nextInt();
		g.setPoint(point);
		
		return g;
	}
}
