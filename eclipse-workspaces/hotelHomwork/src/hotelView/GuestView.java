package hotelView;

import java.util.Scanner;

import hotelVo.DeluxeRoom;
import hotelVo.GuestInfo;
import hotelVo.StandardRoom;
import hotelVo.SuiteRoom;

public class GuestView {

	Scanner sc;

	public GuestView() {
		super();
		sc = new Scanner(System.in);
	}

	public int guestSel() {
		System.out.println("1.호텔 이용");
		System.out.println("2.라운지 이용");
		System.out.println("0.초기화면");
		System.out.print("선택 > ");
		int gSel = sc.nextInt();

		return gSel;
	}

	public int guestHotelMenu() {
		System.out.println("1.호텔 예약");
		System.out.println("2.예약 취소");
		System.out.println("3.예약 확인");
		System.out.println("4.소지금 확인");
		System.out.print("선택 > ");
		int gSel = sc.nextInt();

		return gSel;
	}

	public GuestInfo reservationRoom(int[][] room,GuestInfo[] gi) {
		System.out.println("===== 객실 예약 =====");
		System.out.println("===== 층 안내 =====");
		System.out.println("1~2층 : 스탠다드");
		System.out.println("3~5층 : 디럭스");
		System.out.println(" 6층  : 스위트");
		System.out.println("===================");
		System.out.print("층 선택 : ");
		int floor = sc.nextInt();
		System.out.println("===== 방 안내 =====");
		System.out.println("모든 층은 1~4호실만 있습니다.");
		System.out.println("===================");
		System.out.print("호실 선택 : ");
		int roomNum = sc.nextInt();
		System.out.println("예약자 이름 입력 : ");
		String name = sc.next();
		System.out.println();
		GuestInfo g = null;
		if((floor > 0) || (floor < 7) && (roomNum > 0) || (roomNum < 5)){
			
			switch (floor) {
			case 1:
			case 2:
			case 3:
				String stan = "스탠다드";
				System.out.println("입력하신"+floor+"층은"+stan+"입니다."+"(예약자 : "+name+")");
				roomEmptyCheck(room, floor, roomNum);
				g = new StandardRoom(stan, name, floor, roomNum);
				break;
			case 4:
			case 5:
				String de = "디럭스";
				System.out.println("입력하신"+floor+"층은"+de+"입니다."+"(예약자 : "+name+")");
				roomEmptyCheck(room, floor, roomNum);
				g = new DeluxeRoom(de, name, floor, roomNum);
				break;
			case 6:
				String sw = "스위트";
				System.out.println("입력하신"+floor+"층은"+sw+"입니다."+"(예약자 : "+name+")");
				roomEmptyCheck(room, floor, roomNum);
				g = new SuiteRoom(sw, name, floor, roomNum);
				break;
			}
			return g;
		} else {
			System.out.println("잘못된 입력입니다. 초기화면으로 돌아갑니다.");
		}
		return g;
	}//reservationRoom종료
	public void guestCancellRoom(GuestInfo[] gi, int index) { //게스트 예약 취소
		System.out.println("===== 예약 취소 =====");
		System.out.print("예약자 이름 입력 : ");
		String name = sc.next();
		
		GuestInfo g=null;
		if(name.equals(g.getGuestName())) {
			g.getRoomPrice();
		}
	}
	
	public void roomEmptyCheck(int[][] room,int floor, int roomNum) {
		if(room[floor-1][roomNum-1]==0) {
			room[floor-1][roomNum-1]=1;
			System.out.println(floor+"층 "+roomNum+"호실 예약하였습니다.");
		} else if(room[floor-1][roomNum-1]==1) {
			System.out.println("입력하신 층은 이미 예약이 되어있습니다.");
		}
	}
	public void guestTotalMoney(int guestMoney) {
		System.out.println("현재 소지금 : "+guestMoney+"원");
	}
	//======================================라운지======================================
	public int loungeSel() {
		System.out.print("1.구매하기 : ");
		int lSel = sc.nextInt();
		
		return lSel;
	}
	
}//클래스 종료
