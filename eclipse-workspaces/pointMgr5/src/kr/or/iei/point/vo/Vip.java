package kr.or.iei.point.vo;

public class Vip extends Grade {

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.07*getPoint();
	}
	
	
}
