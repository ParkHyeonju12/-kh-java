package hotelVo;

public class StandardRoom extends GuestInfo{

	public StandardRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardRoom(String grade, String guestName, int floor, int roomNum) {
		super(grade, guestName, floor, roomNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRoomPrice() {
		return 100000;
	}
}
