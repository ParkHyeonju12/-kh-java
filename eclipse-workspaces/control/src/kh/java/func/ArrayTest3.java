package kh.java.func;

public class ArrayTest3 {
	public void test1() {
		//2차원배열 생성
		int k = 0;
		int[][] arr = new int[2][3];
		for(int i=0; i<2; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = ++k;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("\tarr[%d][%d] = %d\n ",i,j,arr[i][j]);
			}
		}
	}
	
	public void test2() {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum : "+sum);
	}
	
	public void test3() {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float avg = 0;
		int i=0;
				
		for(i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++)
			total += arr[i][j];
		}	
		avg = (float)total/(arr.length*arr[0].length);
		
		System.out.println("total : "+total);
		System.out.printf("average : %.2f",avg);
	}
	
	public void test4() {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
	
		System.arraycopy(ballArr,0,ball3,0,3);
		for(int i=0; i<ball3.length; i++) {
		System.out.println(ball3[i]);
		}
		
		
	}
}

