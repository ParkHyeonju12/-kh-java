package kh.java.run;

import java.util.Random;

import kh.java.func.Animal;
import kh.java.func.AnimalMgr1;
import kh.java.func.AnimalMgr2;
import kh.java.func.GenericeEx;
import kh.java.func.Rabbit;
import kh.java.func.Tiger;

public class Statr {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit(200);
		Tiger t1 = new Tiger(300);
		
		AnimalMgr2<Rabbit> am1 = new AnimalMgr2<Rabbit>(r1);
		AnimalMgr2<Tiger> am2 = new AnimalMgr2<Tiger>(t1);
		
		Rabbit a1 = am1.getData();
		Tiger a2 = am2.getData();
		
		a1.rabbitFunction();
		a2.tigerFunction();
		
//		//AnimalMgr객체 생성
//		AnimalMgr1 am1 = new AnimalMgr1(r1);
//		AnimalMgr1 am2 = new AnimalMgr1(t1);
//		Animal a1 = am1.getData();//r1
//		Animal a2 = am2.getData(); //t1
//		
//		System.out.println("a1 HP : "+a1.getHp());
//		System.out.println("a2 HP : "+a2.getHp());
//		((Rabbit)a1).rabbitFunction();
//		((Tiger)a2).tigerFunction();
		
	}
}
