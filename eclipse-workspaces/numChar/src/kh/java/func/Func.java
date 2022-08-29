package kh.java.func;

public class Func {

	public void print1() {
		System.out.println("1");
	}
	
	public void print2() {
		System.out.println('1'+'1'); //0
//		System.out.println("1"-"1");
//		문자열은 숫자연산이 아니므로 +이외의 연산이 불가능
	}
	public void print3() {
		System.out.println(1+1.1);//1.0+1.1 = 2.1로 출력
		System.out.println(1+'1');//50
		System.out.println(1.1+'1'); //1.1+49.0 = 50.1로 출력
	}
	
	public void print4() {
		System.out.println(1+"1");
		System.out.println(1+"1");
		System.out.println(1+"1");
		System.out.println(1+"1");
		System.out.println(1+"1");
		System.out.println(1+"1");
		
		
	}
	
}
