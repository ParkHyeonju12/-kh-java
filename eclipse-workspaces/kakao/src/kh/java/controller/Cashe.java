package kh.java.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Cashe {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		ArrayList<String> cities =  new ArrayList<String>();
		while(true) {
			int cacheSize = sc.nextInt();
			if(0<=cacheSize&&cacheSize<=30) {
				break;
			}
			
			String citi = sc.next().toLowerCase(); 
			if(citi.length()<=20 && cities.size()<=100000) {
				cities.add(citi);
			}else {
				break;
			}
		}
		
		for(int i=0; i<cities.size(); i++) {
			if(cities.get(1).equals(cities.get(2))) {
				cities.set(1, 2);
			}
		}
		
	}
}