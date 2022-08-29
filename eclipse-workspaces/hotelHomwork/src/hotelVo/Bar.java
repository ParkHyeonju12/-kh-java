package hotelVo;

public class Bar {

	private int productNum;
	private String productName;
	private int quantity;
	private int price;

	public Bar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bar(int productNum, String productName, int quantity, int price) {
		super();
		this.productNum = productNum;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
