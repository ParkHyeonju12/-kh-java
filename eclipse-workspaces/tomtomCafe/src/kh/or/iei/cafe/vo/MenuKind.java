package kh.or.iei.cafe.vo;

public class MenuKind {
	private String menuName; //추가할 메뉴 이름
	private boolean temp; //추가메뉴 ice/hot
	private boolean size; //사이즈(tall/grade)
	private int shot; //샷추가
	private boolean pay; // 결제(카드/현금)
	private int conut; //주문수량
	private int money; //가격
	
	public MenuKind() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MenuKind(String menuName, boolean temp, boolean size, int shot, boolean pay, int conut, int money) {
		super();
		this.menuName = menuName;
		this.temp = temp;
		this.size = size;
		this.shot = shot;
		this.pay = pay;
		this.conut = conut;
		this.money = money;
	}
	
	public MenuKind(String menuName, int money) {
		this.menuName = menuName;
		this.money = money;
	}
	
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public boolean isTemp() {
		return temp;
	}
	public void setTemp(boolean temp) {
		this.temp = temp;
	}
	public boolean isSize() {
		return size;
	}
	public void setSize(boolean size) {
		this.size = size;
	}
	public int getShot() {
		return shot;
	}
	public void setShot(int shot) {
		this.shot = shot;
	}
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}
	public int getConut() {
		return conut;
	}
	public void setConut(int conut) {
		this.conut = conut;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}// MenuKind종료
