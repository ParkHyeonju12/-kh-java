package hotelVo;

public abstract class GuestInfo {

	private String grade; //방종류
	private String guestName; //손님이름
	private int floor; // 층수
	private int roomNum; // 방번호
//	private int price; // 가격

	public GuestInfo() {
		super();
		
	}
	
	public GuestInfo(String grade, String guestName, int floor, int roomNum) {
		super();
		this.grade = grade;
		this.guestName = guestName;
		this.floor = floor;
		this.roomNum = roomNum;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	

	public abstract int getRoomPrice();

	
}
