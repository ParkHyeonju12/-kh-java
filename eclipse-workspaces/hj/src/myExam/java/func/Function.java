package myExam.java.func;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<100; i++) {
			int n=(int)(Math.random()*10);
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
