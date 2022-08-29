package hotelVo;

public class SuiteRoom extends GuestInfo{

	public SuiteRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuiteRoom(String grade, String guestName, int floor, int roomNum) {
		super(grade, guestName, floor, roomNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRoomPrice() {
		return 250000;
	}
}
