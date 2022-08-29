package kh.java.func;

public abstract class TestClass {
	private int num;
	
	public int getNum() { //읽기
		return num;
	}
	
	public void setNum(int num) { //값 변경
		this.num = num;
	}
	
	public void testFunction1() {
		System.out.println("테스트 메소드");
	}
	
	public abstract void testFuntion2();
}
