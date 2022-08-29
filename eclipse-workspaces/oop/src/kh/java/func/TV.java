package kh.java.func;

public class TV {
	//속성  --> 해당클래스의 메서드
	//크기 int inch
	//전원 boolean power
	//채널 int ch
	//볼륨 int vol
	
	//기능 
	//전원 on/off
	//채널변경 chUp(),chDown()
	//
	
	public int size; //tv사이즈
	public boolean power; //전원
	public int ch; //채널
	public int vol; //볼륨
	
	//현재 power변수의 값을 반대로 변경(on ->off, off -> on)
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	//현재 ch변수 값을 1 증가(현재 채널번호에서 1증가한 번호로 변경)
	public void chUp() {
		ch++;
		System.out.println("현재 채널 번호 : "+ch);
	}
	//현재 ch변수 값을 1 감소(현재 채널번호에서 1감소한 번호로 변경)
	public void chDown() {
		ch--;
		System.out.println("현재 채널 번호 : "+ch);
	}
	//현재 vol변수 값을 1 증가(현재 볼륨에서 1 증가한 볼륨으로 변경)
	public void volUp() {
		vol ++;
		System.out.println("현재 볼륨 : "+vol);
	}
	//현재 vol변수 값을 1 감소(현재 볼륨에서 1 감소한 볼륨으로 변경)
	public void volDown() {
		vol --;
		System.out.println("현재 볼륨 : "+vol);
	}
}
