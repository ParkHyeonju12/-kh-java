package kh.java.func;

public class Variable {
	public void var1() {
		int num = 100;
		long num1 = 99990000000l;
		float num2 = 486.520f;
		double num3 = 5697.890123;
		char ch = 'A';
		String str = "Hello JAVA";
		boolean bool = true;
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
	}
	
	public void var2() {
		String name = "박현주";
		int age = 24;
		char gd = '여';
		String addr = "부천";
		String tel = "01090227417";
		String email = "ka7417@naver.com";
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(name+"\t"+age+"\t"+gd+"\t"+addr+"\t"+tel+"\t"+email);
		System.out.println("--------------------------------------------------------------------");
		
		name = "김동환";
		age = 31;
		gd = '남';
		addr = "서울";
		tel ="01086676959";
		email = "dkdltbem37@naver.com";
		
		System.out.println(name+"\t"+age+"\t"+gd+"\t"+addr+"\t"+tel+"\t"+email);
		System.out.println("--------------------------------------------------------------------");
		name = "부가원";
		age = 25;
		gd = '여';
		addr = "서울";
		tel ="01020515290";
		email = "dkw1104@naver.com";
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gd,addr,tel,email);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
			
		
	}
}
