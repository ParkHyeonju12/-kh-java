package kh.or.iei.point.vo;

public class Silver {
	private String grade; //등급
	private String name; //이름
	private int point; //포인트
	private double bonus; // 보너스
	
	public Silver() {
		
	}
	
	public Silver(String grade, String name, int point) {
		this.grade = grade;
		this.name  = name;
		this.point = point;
		this.bonus = bonus;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public double getBonus() {
		bonus = point *0.02;
		return bonus;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	
} //Silver class 종료
