package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
	public void setTest() {
		HashSet<Integer> set = new HashSet<Integer>();
		
		System.out.println("set의 길이: "+set.size());
		set.add(10);
		System.out.println("set의 길이: "+set.size());
		
		set.add(20);
		System.out.println(set);
		
		set.add(30);
		System.out.println(set);
		
		set.add(10);//데이터 추가를 시도하고 그 결과를 리턴 /들어가면 true리턴, 안들어가면 false 리턴
		System.out.println(set);
		
		boolean bol = set.add(20);
		System.out.println(bol);
		
		boolean bol1 = set.add(40);
		System.out.println(set);
		System.out.println(bol1);
		
		set.remove(10); //매개변수로 받은 데이터와 일치하는 value를 찾아 제거
		System.out.println(set);
		
		//set은 index로 관리하지 않기 때문에 꺼내는 방법이 필요하다.
		//list는 get으로 꺼낼 수 있다. 순서대로 들어가니까 가능
		//set은 순서대로 값이 안들어가서 순서를 따질 수 없어서 따로 꺼내는 방법이 필요함
		
		//방법 1) foreach 쓰기 
		for(Integer num : set) {
			System.out.println(num);
		}
			System.out.println("1----------------");
		//방법 2) ArrayList 이용하기
		//Set에 저장된 데이터와 동일한 타입을 저장할 수 있는 ArrayList를 생성
			
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		System.out.println(list.get(1));
		
		//방법 3) 반복자(iterator)를 이용한 방법 ( 방법1,방법2의 원조)
		Iterator<Integer> iter = set.iterator();
		System.out.println("2----------------");
		
		//hasNext() : 꺼내올값이 남아있으면 t / 없으면 f 리턴
		//next() : 값 한개를 꺼내옴
		
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> userNum = new HashSet<Integer>();
		
		
		while (userNum.size() < 6) {
			System.out.print("사용자 번호 입력[1~45] : ");
			int num = sc.nextInt();

			if (num > 0 && num < 46) {
				boolean bool = userNum.add(num);
				if (!bool) {
					System.out.println("중복된 숫자입니다.");
				}
			} else {
				System.out.println("1~45 사이의 숫자를 입력하세요.");
			}
		}
		ArrayList<Integer> userList = new ArrayList<Integer>(userNum);
		Collections.sort(userList);//정렬
		
		System.out.println(userList);
		
	}
}
