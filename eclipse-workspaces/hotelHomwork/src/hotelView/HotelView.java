package hotelView;

import java.util.Scanner;

import hotelVo.GuestInfo;

public class HotelView {
	
	Scanner sc;

	public HotelView() {
		super();
		sc = new Scanner(System.in);
	}

	public int frontPrint() {
		System.out.println("1. 손님");
		System.out.println("2. 직원");
		System.out.println("0. 종료");
		System.out.print("선택 > ");
		
		int sel = sc.nextInt();
		return sel;
	}//frontPrint종료
	
	public int empMenu() {
		System.out.println("1.예약확인");
		System.out.println("2.객실확인");
		System.out.println("3.예약취소");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}//empMenu종료
	
	public int empSel() {
		System.out.println("1. 호텔 직원");
		System.out.println("2. 라운지 직원");
		System.out.println("3. 총 매출 확인");
		System.out.print("선택 > ");
		
		int sel = sc.nextInt();
		return sel;
	} //empSel종료
	
	public String empGetName() {
		System.out.println("===== 예약 확인 =====");
		System.out.print("손님 이름 입력 : ");
		String name = sc.next();
		
		return name;
	} //empGetName 종료
	public void printReservationRoomCheck(GuestInfo g) {
		System.out.println("예약하신 방은"+g.getFloor()+"층("+g.getGrade()+") "+g.getRoomNum()+"호실 입니다.");
	} //printReservationRoomCheck종료
	
	public void printAllRoomCheck(GuestInfo[] gi, int index, int[][] room) {
		System.out.println("===== 전체 객실 확인 =====");
		System.out.println("등급\t예약자\t층수\t방번호");
		System.out.println("----------------------------------");
		
		if(index != 0) {
			for (int i = 0; i < index; i++) {
				GuestInfo g = gi[i];
				System.out.printf("%s\t%s\t%d\t%d\n",g.getGrade(),g.getGuestName(),g.getFloor(),g.getRoomNum());
			}
		} else {
			System.out.println("전 객실이 공실입니다.");
		}
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if(room[i][j]==0) {
					System.out.println("현재 빈방은"+(i+1)+"층 "+(j+1)+"번방 입니다.");
				} 
			}
		}
	}
	public String cancellGetName() {
		System.out.println("===== 예약 취소 =====");
		System.out.print("손님 이름 입력 : ");
		String name = sc.next();
		
		return name;
	} //empGetName 종료
	
	public void cancellPrint() {
		System.out.println("예약 취소 완료!");
	}
	
	public void totalSalesPrint(int total) {
		System.out.println("총 매출 : "+total+"원 입니다.");
	}
	public void noReservationPrint() {
		System.out.println("예약한 손님이 아닙니다.");
	} //noReservationPrint종료
	public void endPrint() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	
	
}//클래스 종료

//	public void print() {
//		System.out.println("┌─┐  ┌─┐ ┌─────────┐ ┌──────────┐");
//		System.out.println("│ │  │ │ │         │ │          │");
//		System.out.println("│ └──┘ │ │  ┌───┐  │ └───┐  ┌───┘");
//		System.out.println("│      │ │  │   │  │     │  │");
//		System.out.println("│ ┌──┐ │ │  │   │  │     │  │");
//		System.out.println("│ │  │ │ │  └───┘  │     │  │");
//		System.out.println("│ │  │ │ │         │     │  │");
//		System.out.println("└─┘  └─┘ └─────────┘     └──┘");
//	}