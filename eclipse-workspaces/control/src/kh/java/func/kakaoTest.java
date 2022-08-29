package kh.java.func;

import java.util.Scanner;

public class kakaoTest {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		System.out.print("배열의 크기를 입력하세요!");
		int input = sc.nextInt();
//		int input = 5;
		int i,j;
		char [][] map1 = new char [input][input];
		char [][] map2 = new char [input][input];
		char [][] result = new char [input][input];
		int[] arr1 = new int[input];
		int[] arr2 = new int[input];
		
		System.out.print("arr1 배열에 들어갈 숫자를 입력하세요!");
		for(i=0; i<map1.length; i++) {
			arr1[i] =sc.nextInt();
		}
		
		System.out.print("arr2 배열에 들어갈 숫자를 입력하세요!");
		for(i=0; i<map1.length; i++) {
			arr2[i] =sc.nextInt();
		}
		
//		 int[] arr1 = {9,20,28,18,11,};
//		 int[] arr2 = {30,1,21,17,28,};
		 
		 for(i=0; i<map1.length ;i++) {
			 for(j=map1.length-1; j>=0; j--) {
				 map1[i][j] = (char) (arr1[i]%2);
				 arr1[i] = arr1[i] / 2;
			 }
		 }
		 
		 for(i=0; i<map1.length; i++) {
			 for(j=map1.length-1; j>=0; j--) {
			 System.out.print(map1[i][j]);
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 for(i=0; i<map1.length ;i++) {
			 for(j=map1.length-1; j>=0; j--) {
				 map2[i][j] = (char) (arr2[i]%2);
				 arr2[i] = arr2[i] / 2;
			 }
		 }
		 
		 for(i=0; i<map1.length; i++) {
			 for(j=0; j<map1.length; j++) {
			 System.out.print(map2[i][j]);
			 }
			 System.out.println();
		 }
		 //결과
		 for(i=0; i<map1.length; i++) {
			 for(j=map1.length-1; j>=0; j--) {
				 if((map1[i][j]) == (char)0 && (int)map2[i][j] == (char)0) {
					 result[i][j] = (char)0;
				 } else {
					 result[i][j] = (char)1;
				 }
			 }
		 }
		 System.out.println();
		 for(i=0; i<map1.length; i++) {
			 for(j=map1.length-1; j>=0; j--) {
				 System.out.print(result[i][j]);
			 }
			 System.out.println();
		 }
		 				 
	}
}
