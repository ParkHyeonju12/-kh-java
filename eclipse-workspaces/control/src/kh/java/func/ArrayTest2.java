package kh.java.func;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		int[] arr2 = arr1;
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		arr1[4]=100;
		System.out.println(arr1[4]);
		arr1[4]=100;
		System.out.println(arr2[4]);
		
		arr2[0]=10;
		System.out.println(arr2[0]);
		arr2[0]=10;
		System.out.println(arr2[0]);
	}
	
	public void test2() {
		int[] arr1 = {1,2,3,4,5,6};
		//1) 배열을 생성해서 제어문을 통한 직접 복사
		//1-1) 원본배열과 동일한 길이의 배열 생성
		int[] arr2 = new int[arr1.length];
		//1-2) for문을 통한 데이터 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		arr1[2] = 100;
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		//2) System.arraycopy 사용(배열의일부 데이터만 복사가능)
		//2-1) 원본배열과 길이가 같은 배열 선언
		int[] arr3 = new int[arr1.length];
		//System.arraycopy
		//(원본배열,원본배열의 복사시작 위치,데이터가 복사될 배열,
		//데이터가 복사될 배열 중 데이터가 들어갈 시작 위치,복사할 길이)
		
		System.arraycopy(arr1, 2, arr3, 1, 2);
		System.out.println();
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		int[] arr4 = new int[arr2.length];
		
		System.out.println();
		System.arraycopy(arr1, 2, arr4, 1, 3);
		
		System.out.println(Arrays.toString(arr4));
		
		//3) clone();
		int[] arr5 = arr1.clone();
		System.out.println();
		
		for(int i=0; i<arr5.length; i++) {
			System.out.print(arr5[i]+" ");
		}
	}
	
	public void test4() {
		int[][] arr = new int[5][5];
		int num = 5;
		
	 for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num--;
			}
			num +=10 ;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test5() {
		int[][] arr = new int[5][5];
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num += 5;
			}
			num -= 26;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test6() {
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num += 5;
			}
			num -= 24;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test7() {
		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			switch (i) {
			case 0:
			case 2:
			case 4:
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = num++;
				}
				num +=4 ;
				break;

			case 1:
			case 3:
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = num--;
				}
				num += 6;
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void test8() {
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int input = sc.nextInt();
		int[][] arr = new int[input][input];
		int i = 0;
		int j = 0;
		int num = 0;
		
		for(i=0; i<input; i++) {  //오
			arr[0][i] = ++num; 
		}
		
		for(i=0; i<input-1; i++) { //아
			arr[i+1][4] = ++num;
		}
		
		
		for(i=input-1; i>0; i--) { //왼
			arr[4][i-1] = ++num;
		}
		
		for(i=input-2; i>0; i--) { // 위
			arr[i][0] = ++num;
		}
		
		for(i=0; i<input-2;i++) { //오2
			arr[1][i+1] = ++num;
		}
		
		for(i=1; i<input-2; i++) { //아2
			arr[i+1][3] = ++num;
		}
		
		for(i=input-2; i>1; i--) { //왼2
			arr[3][i-1] = ++num;
		}
		
		for(i=input-3; i>1; i--) { // 위2
			arr[i-3][1] = ++num;
		}
		
//		for(i=2; i<input-3;i++) { //오3
//			arr[2][i+2] = ++num;
//		}
//		
		//arr[2][1] arr[2][2]
		
		
		
		
		for(i=0; i<arr.length; i++) {
			for (j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
