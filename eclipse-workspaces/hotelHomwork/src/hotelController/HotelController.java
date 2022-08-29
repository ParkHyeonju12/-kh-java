package hotelController;

import hotelView.BarView;
import hotelView.GuestView;
import hotelView.HotelView;
import hotelVo.Alcohol;
import hotelVo.Bar;
import hotelVo.Food;
import hotelVo.GuestInfo;
import hotelVo.NonAlcohol;

public class HotelController {
	
	private GuestInfo[] gi; //손님정보
	private HotelView view;
	private GuestView gView;
	private int[][] room; //방확인
	private int index;
	private int totalSales;
	private int guestMoney;
	
	private Bar[] bar;
	private int bindex;
	private BarView bView;
	
	public HotelController() {
		super();
		bar = new Bar[19];
		gi = new GuestInfo[24];
		view = new HotelView();
		gView = new GuestView();
		room = new int[6][4];
		guestMoney = 500000;
		

		bar[bindex++] = new Alcohol(1, "처음처럼", 50, 5000);
		bar[bindex++] = new Alcohol(2, "하이네켄", 50, 6000);
		bar[bindex++] = new Alcohol(3, "호가든", 50, 8000);
		bar[bindex++] = new Alcohol(4, "레드와인", 30, 30000);
		bar[bindex++] = new Alcohol(5, "화이트와인", 30, 30000);
		bar[bindex++] = new Alcohol(6, "싱글몰트", 5, 120000);
		bar[bindex++] = new Alcohol(7, "그레인몰트", 5,100000);
		bar[bindex++] = new Alcohol(8, "앱솔루트", 10, 50000);
		bar[bindex++] = new Alcohol(9, "헨드릭스 진", 10, 50000);

		bar[bindex++] = new NonAlcohol(1, "콜라", 100, 1500);
		bar[bindex++] = new NonAlcohol(2, "스프라이트", 100, 1500);
		bar[bindex++] = new NonAlcohol(3, "토닉워터", 80, 1500);
		bar[bindex++] = new NonAlcohol(4, "제로콜라", 80, 2500);
		bar[bindex++] = new NonAlcohol(5, "생과일주스", 50, 6000);

		bar[bindex++] = new Food(1, "과일 세트", 20, 20000);
		bar[bindex++] = new Food(2, "마른 안주", 40, 8000);
		bar[bindex++] = new Food(3, "나초", 40, 9000);
		bar[bindex++] = new Food(4, "크래커", 30, 5000);
		bar[bindex++] = new Food(5, "큐브치즈", 30, 10000);
		bView = new BarView();
	}


	public void main() {
//		view.print();
		while(true) {
			int sel = view.frontPrint();
			switch (sel) { // 손님 or 직원
			case 1:
				int gSel = gView.guestSel();
				
				switch (gSel) {
				case 1: //게스트
					int gSel2 = gView.guestHotelMenu();
					switch (gSel2) {
					case 1: //게스트 방 예약
						guestReservationRoom(); 
						break;
					case 2: //게스트 방 취소
						cancellRoom(); 
						break;
					case 3: // 게스트 예약 확인
						reservationRoomCheck(); 
						break;
					case 4: // 게스트 소지금 확인
						gView.guestTotalMoney(guestMoney);
					case 0:
						break;

					default:
						break;
					} //switch종료
					break;
					
				case 2: // 게스트 라운지이용
					int lSel=gView.loungeSel();
					
					switch (lSel) { //라운지 물건구매 switch
					case 1: //물건구매
						barMenuBuy(); 
						break;

					default:
						break;
					} // switch종료
					break;
				case 0:
					break;

				default:
					break;
				} //switch 종료
				break;
				
			case 2: //호텔직원
				int empSel = view.empSel();
				
				switch (empSel) {
				case 1: // 호텔직원 메뉴
					int empMSel = view.empMenu();
					
					switch (empMSel) {
					case 1: //예약확인
						reservationRoomCheck(); 
						break;
					case 2: //객실확인
						allRoomCheck(); 
						break;
					case 3: //예약취소
						cancellRoom(); 
						break;

					default:
						break;
					}//3번째 switch문
					
					break;
					
				case 2:// 라운지 직원 메뉴
					int barEmpSel =bView.barEmpMenu();
					
					switch (barEmpSel) {
					case 1: //재고 확인
						bView.amountCheck(bar);
						break;
					case 2: //재고 추가
						amountAdd();
						break;

					default:
						break;
					}//switch 종료
					
				case 3: //총 매출 확인
					totalSales();
					break;

				default:
					break;
				}//2번째 switch문
				
				break;
				
			case 0:
				view.endPrint();
				return;

			default:
				break;
			}
		}
	}//main 종료
	public void guestReservationRoom() { //게스트 방 예약
		GuestInfo g = gView.reservationRoom(room, gi);
		gi[index++] = g;
		guestMoney -= g.getRoomPrice();
		totalSales += g.getRoomPrice(); 
		gView.guestTotalMoney(guestMoney);
	} // guestReservationRoom 종료
	
	public void reservationRoomCheck() { // 호텔 직원 예약 확인
		String name = view.empGetName();
		
		int searchIndex = searchGuest(name);
		if(searchIndex == -1) {
			view.noReservationPrint();
		} else {
			GuestInfo g = gi[searchIndex];
			view.printReservationRoomCheck(g);
		}
	}//reservationRoomCheck 종료
	
	
	
	public void allRoomCheck() { // 호텔 직원 예약된 방 확인
		view.printAllRoomCheck(gi, index, room);
	}//allRoomCheck 종료
	
	public void cancellRoom() { // 호텔직원 예약 취소
		String name = view.cancellGetName();
		
		int searchIndex = searchGuest(name);
		if(searchIndex == -1) {
			view.noReservationPrint();
		} else {
			guestMoney +=gi[searchIndex].getRoomPrice(); //취소시 환불
			totalSales -=gi[searchIndex].getRoomPrice();
			for (int i = searchIndex; i < index; i++) {
				gi[i] = gi[i+1];
			}
			index--;
			
			view.cancellPrint();
		}
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if(room[i][j]==1) {
					room[i][j]=0;
				}
			}
		}
	}//cancellRoom(환불 포함) 종료
	
	public void totalSales() { // 호텔 직원 총매출
		view.totalSalesPrint(totalSales);
	}
	
	
	
	public int searchGuest(String name) { // 예약했는지 체크
		for (int i = 0; i < index; i++) {
			if(name.equals(gi[i].getGuestName())) {
				return i;
			}
		}
		return -1;
	}//searchGuest종료
	
	//=====================라운지=========================
	public void barMenuBuy() { // 손님 물품구매
		int[] menuSel = bView.barMenu(bar);
		Bar b = bar[menuSel[0]-1];
		int amount = b.getQuantity();
		
		amount -= menuSel[1];
		b.setQuantity(amount);
		
		guestMoney -= bar[menuSel[0]-1].getPrice()*menuSel[1];
		totalSales += bar[menuSel[0]-1].getPrice()*menuSel[1];
		
		gView.guestTotalMoney(guestMoney);
	}
	
	public void barAmountCheck() {//재고확인
		bView.amountAdd(bar);
	}
	
	
	public void amountAdd() { //재고 추가
		int[] menuSel = bView.amountAdd(bar);
		Bar b = bar[menuSel[0]-1];
		int amount = b.getQuantity();

		amount += menuSel[1];
		b.setQuantity(amount);
	}
}//클래스 종료
