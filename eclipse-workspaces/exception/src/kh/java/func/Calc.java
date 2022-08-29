package kh.java.func;

public class Calc {
	public void div(int num1, int num2) throws UserException2 {
		if(num2 == 0) {
//			throw new UserException1("0으로는 나눌 수 없습니다.");
			throw new UserException2("0으로는 나눌 수 없습니다.");
		}else {
			System.out.println((num1/num2));
		}
	}
	
	public void test10() {
		Calc cal = new Calc();
		cal.div(10, 3);
	}
}
