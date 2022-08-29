package kh.or.iei.func;

import java.util.Scanner;

public class Question {
	
	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		int i = 0; 
		int j = 0;
		int tmp = 0;
		int[] inputNum = new int[5];
		int sum = 0;
		
		
		for(i=0; i<inputNum.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			inputNum[i] = sc.nextInt();
			sum += inputNum[i];
		}
		
		for(i=inputNum.length-1; i>0;i--) {
			for(j=0; j<inputNum.length-1; j++) {
				if(inputNum[j]>inputNum[j+1]) {
					tmp = inputNum[j];
					inputNum[j] = inputNum[j+1];
					inputNum[j+1] = tmp;
				}
			}
		} // 버블 정렬 끝
		
		System.out.print("정렬 결과 :");
		for(i=0; i<inputNum.length; i++) {
			System.out.print(inputNum[i]+"\t");
		}
		System.out.println();
		
		System.out.println("입력한 수의 총 합은 : "+sum);
	} //exam1() 끝
}
