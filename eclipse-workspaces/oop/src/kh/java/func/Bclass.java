package kh.java.func;

public class Bclass extends Aclass{
	int num1;

	public Bclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num, String str) {
		super(num, str);
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num1) {
		super();
		this.num1 = num1;
	}
	
	public Bclass(int num, String str, int num1) {
//		System.out.println("111");
		super(num,str); //super 보다 위에는 코드가 올 수 없음. 
		// 내 로직보다 부모생서자 호출이 먼저임
		System.out.println("B생성자");
		this.num1 = num1;
	}
	@Override
	public void overTest() {
		System.out.println("B클래스 메소드");
	}
}
