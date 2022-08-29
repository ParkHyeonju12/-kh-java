package kh.java.func;

public class TV2 {
	//TV2 클래스의 전역변수에 외부직접접근을 막기위해
	//private 접근제어지시자 사용 --> 정보은닉
	private int size;
	private boolean power;
	private int ch;
	private int vol;
	
	//생성자_리턴타입 x
	//생성자가 없으면 JVM이 읽을 때 "어? 생성자가 없네" 하면서 생성자 자동으로 만듬
	//생성자가 하는일: 객체 만들기, 세팅하기
	// 어떤 세팅? 객체를 만들때 딱 한번만 세팅하는 값 size 같은 걸 만듬
	
	//기본 생성자		
	public TV2() {
		this.size = 100;
	}
	
	public TV2(int size) {
		this.size = size;
	}
	
	//만약 위에 쓴 생성자를 하나도 만들지 않았다면?
	// TV2() 생성자는 JVM 이 자동으로 만들어 주긴 함,근데 기본 셋팅값이 0
	// TV2(int size)는 JVM이 자동으로 안만들어줌
	// 근데 만약 위에  TV2() 또는 TV2(int size) 둘 중 하나가 존재하고 있으면
	// JVM이 자동으로 안만들어줌
	// 그럼 생성자가 아무것도 없을 때 JVM이 자동으로 만들어주는 TV2()를 기본 생성자라고 함.
	
	
	//정보은닉을 하게되면 외부에서 변수를 사용할 수 없음
	//변수의 데이터를 대입하고, 값을 가져올 수 있는 메소드를 생성
	// -> getter, setter
	//getter: 변수의 데이터를 보여주는 목적
	//setter: 메소드를 통해서 전역변수에 값을 대입(대입이지 반환이 아니라서 return값이 없고, void씀)
	public int getSize() {
		return size;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getCh() {
		return ch;
	}
	public int getVol() {
		return vol;
	}
	//setter: 메소드를 통해서 전역변수에 값을 대입
	// size = size; 라고 하면 노란색 글씨 뜸
	// 우린 전역변수에 넣어야 하는데 , 지역변수를 가리킴
	//이럴땐 전역변수로 사용하고 싶은 친구 앞에 this.붙이면 됨
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	//get_ 읽어오기 / set _ 값 변경, 대입하기
	//근데 tv를 만들 때 size를 내맘대로 조절하면 안되는거니까
	//size 값을 읽어올 수 있는 getSize는 만들되 
	//값을 변경할 수 있는 setSize는 만들지 말것.
}
