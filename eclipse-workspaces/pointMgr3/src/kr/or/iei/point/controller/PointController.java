package kr.or.iei.point.controller;

import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointController {

	private Silver[] silver;
	private Gold[] gold;
	private Vip[] vip;
	private Vvip[] vvip;
	private Scanner sc;
	private int sIndex;
	private int gIndex;
	private int vIndex;
	private int vvIndex;
	private int flag;

	public PointController() {
		silver = new Silver[10];
		gold = new Gold[10];
		vip = new Vip[10];
		vvip = new Vvip[10];
		sc = new Scanner(System.in);
		sIndex = 0;
	} // PointController() 종료

	public void main() {
		while (true) {
			System.out.println("\n ===== 포인트 관리 프로그램 v3 =====\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				insertUeser();
				break;
			case 2:
				printAllUeser();
				break;
			case 3:
				printOneUeser();
				break;
			case 4:
				updateUeser();
				break;
			case 5:
				deleteUeser();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			} // switch 종료
		} // while 종료
	} // main 종료

	public void insertUeser() {
		System.out.println("\n=======회원 정보 등록=======\n");

		System.out.print("회원 등급 입력[silver]: ");
		String grade = sc.next();

		System.out.print("회원 이름 입력: ");
		String name = sc.next();

		System.out.print("회원 포인트 입력: ");
		int point = sc.nextInt();

		switch (grade) {
		case "silver":
			if (grade.equals("silver")) {
				Silver s = new Silver(grade, name, point);
				silver[sIndex++] = s;
				System.out.println("회원 정보 등록 완료");
			} else {
				System.out.println("잘못입력하셨습니다");
				return;
			}
			break;
		case "gold":
			if (grade.equals("gold")) {
				Gold g = new Gold(grade, name, point);
				gold[gIndex++] = g;
				System.out.println("회원 정보 등록 완료");
			} else {
				System.out.println("잘못입력하셨습니다");
				return;
			}
			break;
		case "vip":
			if (grade.equals("vip")) {
				Vip v = new Vip(grade, name, point);
				vip[vIndex++] = v;
				System.out.println("회원 정보 등록 완료");
			} else {
				System.out.println("잘못입력하셨습니다");
				return;
			}
			break;
		case "vvip":
			if (grade.equals("vvip")) {
				Vvip vv = new Vvip(grade, name, point);
				vvip[vvIndex++] = vv;
				System.out.println("회원 정보 등록 완료");
			} else {
				System.out.println("잘못입력하셨습니다");
				return;
			}
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		} // switch 종료
	}// insertUeser() 종료

	public void printAllUeser() {
		System.out.println("\n------전체 회원 출력------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-----------------------------");

		for (int i = 0; i < sIndex; i++) {
			System.out.println(silver[i].getGrade() + "\t" + silver[i].getName() + "\t" + silver[i].getPoint() + "\t"
					+ silver[i].getBonus());
		}
		for (int i = 0; i < gIndex; i++) {
			System.out.println(gold[i].getGrade() + "\t" + gold[i].getName() + "\t" + gold[i].getPoint() + "\t"
					+ gold[i].getBonus());
		}
		for (int i = 0; i < vIndex; i++) {
			System.out.println(vip[i].getGrade() + "\t" + vip[i].getName() + "\t" + vip[i].getPoint() + "\t"
					+ vip[i].getBonus());
		}
		for (int i = 0; i < vvIndex; i++) {
			System.out.println(vvip[i].getGrade() + "\t" + vvip[i].getName() + "\t" + vvip[i].getPoint() + "\t"
					+ vvip[i].getBonus());
		}

	} // printAllUeser()종료

	public void printOneUeser() {
		System.out.println("=====회원 정보 출력 =====");

		System.out.print("조회할 회원 이름 입력: ");
		String name = sc.next();

		int searchsIndex = searchUeser(name);
		if (searchsIndex == -1) {
			System.out.println("회원을 조회 할 수 없습니다.");
		} else if (searchsIndex / 1000 == 1) {
			searchsIndex -= 1000;
			System.out.println("등급 : " + vvip[searchsIndex].getGrade());
			System.out.println("이름 : " + vvip[searchsIndex].getName());
			System.out.println("포인트 : " + vvip[searchsIndex].getPoint());
			System.out.println("보너스 : " + vvip[searchsIndex].getBonus());
		} else if (searchsIndex / 100 == 1) {
			searchsIndex -= 100;
			System.out.println("등급 : " + vip[searchsIndex].getGrade());
			System.out.println("이름 : " + vip[searchsIndex].getName());
			System.out.println("포인트 : " + vip[searchsIndex].getPoint());
			System.out.println("보너스 : " + vip[searchsIndex].getBonus());
		} else if (searchsIndex / 10 == 1) {
			searchsIndex -= 10;
			System.out.println("등급 : " + gold[searchsIndex].getGrade());
			System.out.println("이름 : " + gold[searchsIndex].getName());
			System.out.println("포인트 : " + gold[searchsIndex].getPoint());
			System.out.println("보너스 : " + gold[searchsIndex].getBonus());
		} else {
			System.out.println("등급 : " + silver[searchsIndex].getGrade());
			System.out.println("이름 : " + silver[searchsIndex].getName());
			System.out.println("포인트 : " + silver[searchsIndex].getPoint());
			System.out.println("보너스 : " + silver[searchsIndex].getBonus());
		}

	} // printOneUeser() 종료

	public int searchUeser1(String name) {
		for (int i = 0; i < sIndex; i++) {
			Silver s = silver[i];
			if (name.equals(s.getName())) {
				return i;// 0-9
			}
		}
		for (int i = 0; i < gIndex; i++) {
			Gold g = gold[i];
			if (name.equals(g.getName())) {
				return i + 10;// 10-19
			}
		}
		for (int i = 0; i < vIndex; i++) {
			Vip v = vip[i];
			if (name.equals(v.getName())) {
				return i + 100;// 100-109
			}
		}
		for (int i = 0; i < vvIndex; i++) {
			Vvip vv = vvip[i];
			if (name.equals(vv.getName())) {
				return i + 1000;// 1000-1009
			}
		}
		return -1;
	} // searchUeser1종료

	public void updateUeser() {
		System.out.println("=====회원 정보 수정 =====");
		System.out.println("수정할 회원 이름 입력: ");
		String name = sc.next();
		
		int[] result = searchUeser3(name);
		
		if (result[0] == 1) {
			for (int i = result[1]; i < sIndex - 1; i++) {
				silver[i] = silver[i + 1];
			}
			sIndex--;
		} else if (result[0] == 2) {
			for (int i = result[1]; i < gIndex - 1; i++) {
				gold[i] = gold[i + 1];
			}
			gIndex--;
		} else if (result[0] == 3) {
			for (int i = result[1]; i < vIndex - 1; i++) {
				vip[i] = vip[i + 1];
			}
			vIndex--;
		} else if (result[0] == 4) {
			for (int i = result[1]; i < vvIndex - 1; i++) {
				vvip[i] = vvip[i + 1];
			}
			vvIndex--;
		}
	
		if (result[0] == 0) {
			System.out.println("회원을 조회 할 수 없습니다.");
		} else {
			System.out.print("수정할 회원 등급 입력:");
			String grade = sc.next();

			System.out.print("수정할 회원 이름 입력:");
			String updateName = sc.next();

			System.out.print("수정할 회원 포인트 입력 : ");
			int point = sc.nextInt();

			switch (grade) {
			case "silver":
				Silver s = new Silver(grade, updateName, point);
				silver[sIndex] = s;
				sIndex++;
				break;
			case "gold":
				Gold g = new Gold(grade, updateName, point);
				gold[gIndex] = g;
				gIndex++;
				break;
			case "vip":
				Vip v = new Vip(grade, updateName, point);
				vip[vIndex] = v;
				vIndex++;
				break;

			case "vvip":
				Vvip vv = new Vvip(grade, updateName, point);
				vvip[vvIndex] = vv;
				vvIndex++;
				break;
			}

			System.out.println("정보 수정 완료!");
		}
	} // updateUeser() 종료

	public void deleteUeser() {
		System.out.println("=====회원 정보 삭제 =====");

		System.out.print("삭제할 회원 이름 입력: ");
		String name = sc.next();

		int searchsIndex = searchUeser2(name);

		if (searchsIndex == -1) {
			System.out.println("회원을 조회 할 수 없습니다.");
		} else {
			if (flag == 1) {
				for (int i = searchsIndex; i < sIndex - 1; i++) {
					silver[i] = silver[i + 1];
				}
				sIndex--;
			} else if (flag == 2) {
				for (int i = searchsIndex; i < gIndex - 1; i++) {
					gold[i] = gold[i + 1];
				}
				gIndex--;
			} else if (flag == 3) {
				for (int i = searchsIndex; i < sIndex - 1; i++) {
					vip[i] = vip[i + 1];
				}
				vIndex--;
			} else if (flag == 4) {
				for (int i = searchsIndex; i < sIndex - 1; i++) {
					vvip[i] = vvip[i + 1];
				}
				vvIndex--;
			}
			System.out.println("정보 삭제 완료!");
		}
	} // deleteUeser()종료

	public int[] searchUeser3(String name) {
		int[] result = new int[2];
		// 0번 인덱스는 어떤 배열인지
		// 1번 인덱스는 배열의 몇번째인데
		int searchsIndex = searchUeser(name);

		for (int i = 0; i < sIndex; i++) {
			Silver s = silver[i];
			if (name.equals(s.getName())) {
				result[0] = 1;
				result[1] = i;
				return result;
			}
		}
		for (int i = 0; i < gIndex; i++) {
			Gold g = gold[i];
			if (name.equals(g.getName())) {
				result[0] = 2;
				result[1] = i;
				return result;
			}
		}
		for (int i = 0; i < vIndex; i++) {
			Vip v = vip[i];
			if (name.equals(v.getName())) {
				result[0] = 3;
				result[1] = i;
				return result;
			}
		}
		for (int i = 0; i < vvIndex; i++) {
			Vvip vv = vvip[i];
			if (name.equals(vv.getName())) {
				result[0] = 4;
				result[1] = i;
				return result;
			}
		}
		return result;
	}

	public int searchUeser2(String name) {

		int searchsIndex = searchUeser(name);
		for (int i = 0; i < sIndex; i++) {
			Silver s = silver[i];
			if (name.equals(s.getName())) {
				flag = 1;
				return i;
			}
		}
		for (int i = 0; i < gIndex; i++) {
			Gold g = gold[i];
			if (name.equals(g.getName())) {
				flag = 2;
				return i;
			}
		}
		for (int i = 0; i < vIndex; i++) {
			Vip v = vip[i];
			if (name.equals(v.getName())) {
				flag = 3;
				return i;
			}
		}
		for (int i = 0; i < vvIndex; i++) {
			Vvip vv = vvip[i];
			if (name.equals(vv.getName())) {
				flag = 4;
				return i;
			}
		}
		return -1;
	} // searchUeser2() 죵료

	public int searchUeser(String searchName) {
		for (int i = 0; i < sIndex; i++) {
			if (searchName.equals(silver[i].getName())) {
				return i;
			}

			if (searchName.equals(gold[i].getName())) {
				return i;
			}

			if (searchName.equals(vip[i].getName())) {
				return i;
			}
			if (searchName.equals(vvip[i].getName())) {
				return i;
			}
		}
		return -1;
	}// searchUeser(String searchName)끝

} // PointController 종료
