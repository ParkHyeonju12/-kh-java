package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListTest {
	public void listTest1() {
		String[] arr = new String[3];
		arr[0] = "hi";
		arr[1] = "hello";
		arr[2] = "bye";
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+". "+arr[i]);
		}
		System.out.println("----------------");
		//ArrayList로 처리
		//ArrayList는 객체 생성 시 배열로 관리할 자료형은 제네릭으로 지정
		ArrayList<String> list = new ArrayList<String>();
		//length == size
		System.out.println("list 길이 : " +list.size());
		
		//리스트 가장 뒤에 데이터 추가
		list.add("hi");
		System.out.println("list 길이 : " +list.size());
		list.add("hello");
		System.out.println("list 길이 : " +list.size());
		list.add("bye");
		System.out.println("list 길이 : " +list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void listTest2() {
		Scanner sc = new Scanner(System.in);
		
		//정수를 저장할 리스트 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("리스트에 추가할 숫자 입력 : ");
			int num = sc.nextInt();
			list.add(num); //입력받은 수를 리스트에 추가
			System.out.print("한번 더 입력하시겠습니까?[y/n]");
			String sel = sc.next();
			if(sel.toLowerCase().equals("n")) {
				break;
			}
		} // while종료
		for(int i=0; i<list.size();i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		
			
			
		}
	public void listTest3() {
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(10);
	      list.add(5);
	      list.add(100);
	      list.add(55);
	      list.add(80);
	      System.out.println("1차) "+list);
	      
	      //get(index) : 해당 인덱스에 위치한 객체를 가져오는 메소드
	      System.out.println("2차) list에 3번째: "+list.get(2));
	      
	      //add(param1) : 매개변수로 전달된 값을 리스트 가장 뒤에 추가
	      list.add(15);
	      System.out.println("3차) list에 15 추가:"+list);
	      
	      //add(param1,param2) : 첫번째 매개변수 위치에 두번째 매개변수 값 추가
	      //추가한 데이터 이후의 인덱스번호는 1개씩 밀림
	      list.add(3,200);
	      System.out.println("4차) "+list);
	      
	      //set(param1,param2) : 첫번째 매개변수 위치를 두번째 매개변수 값으로 수정
	      list.set(3, 1000);
	      System.out.println("5차) "+list);
	      
	      //remove(param1) : 매개변수 위치에 있는 객체를 리스트에서 삭제
	      list.remove(3);
	      System.out.println("6차) "+list);
	      
	      //contains(param1) : 매개변수로 전달한 값이 리스트에 존재하는지 확인하여, 결과 리턴
	      System.out.println("7차) "+list.contains(1000));//1000없으니까 false
	      System.out.println("8차) "+list.contains(55));//55있으니까 true
	   
	      Collections.sort(list); // sort: 오름차순 reverse:내림차순
	      System.out.println("9차) "+list);
	      
	      //clear() : list내부의 모든 객체를 삭제
	      System.out.println("10차) "+list.isEmpty());
	      list.clear();
	      System.out.println("11차) clear사용 후 list : "+list);
	      System.out.println("12차) clear 사용 후 리스트 길이: "+list.size());
	      
	      System.out.println("13차) "+list.isEmpty());
	   }
	
	}
	

