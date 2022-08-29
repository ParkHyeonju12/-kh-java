package hotelVo;

public class DeluxeRoom extends GuestInfo{

	public DeluxeRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeluxeRoom(String grade, String guestName, int floor, int roomNum) {
		super(grade, guestName, floor, roomNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRoomPrice() {
		return 150000;
	}
}
