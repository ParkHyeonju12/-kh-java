package kh.java.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kh.java.vo.Gold;
import kh.java.vo.Grade;
import kh.java.vo.Silver;
import kh.java.vo.Vip;
import kh.java.vo.Vvip;

public class PointView {
	private Scanner sc;

	public PointView() {
		super();
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
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public Grade insertGrade() {
		System.out.println("-----회원 정보 등록-----");
		System.out.println("등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("포인트 입력 : ");
		int point = sc.nextInt();
		Grade g = null;
		switch (grade) {
		case "silver":
			g = new Silver(grade, name, point);
			break;

		case "gold":
			g = new Gold(grade, name, point);
			break;

		case "vip":
			g = new Vip(grade, name, point);
			break;

		case "vvip":
			g = new Vvip(grade, name, point);
			break;
		}
		System.out.println("등록 완료!");
		return g;
	}

	public void printAllGrade(HashMap<String, Grade> grades) {
		System.out.println("=====전체 회원 출력=====");
		System.out.println("등급\t이름\t포인트\t보너스");

		Set<String> names = grades.keySet();

		for (String name : names) {
			Grade g = grades.get(name);

			System.out.println(g.getGrade() + "\t" + g.getName() + "\t" + g.getPoint() + "\t" + g.getBonus());
		}
	}

	public String getName(String str) {
		System.out.println("===== 회원 정보 " + str + " =====");
		System.out.print(str + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void printOneGrade(Grade g) {
		System.out.println("이름 : " + g.getGrade());
		System.out.println("나이 : " + g.getName());
		System.out.println("포인트 : " + g.getPoint());
		System.out.println("보너스 : " + g.getBonus());
	}

	public void nosearchGrade() {
		System.out.println("회원 정보를 찾을 수 없습니다.");
	}

	public Grade updateGrade() {
		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("수정 등급 입력 : ");
		String grade = sc.next();
		System.out.print("수정 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정 포인트 입력 : ");
		int point = sc.nextInt();
		Grade g = null;
		switch (grade) {
		case "silver":
			g = new Silver(grade, name, point);
			break;

		case "gold":
			g = new Gold(grade, name, point);
			break;

		case "vip":
			g = new Vip(grade, name, point);
			break;

		case "vvip":
			g = new Vvip(grade, name, point);
			break;
		}
		System.out.println("수정 완료!");
		return g;
	}
}
