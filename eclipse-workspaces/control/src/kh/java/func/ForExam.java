package kh.java.func;

public class ForExam {
	
	int i = 0;
	int j = 0;
	
	public void exam1() {
		for (i = 0; i < 5; i++) {
			System.out.print("*");
		}
	}

	public void exam2() {

	}

	public void exam3() {
		for ( i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void exam4() {
		for ( i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public void exam5() {

		for ( i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(j + 1);
			}

			System.out.println();
		}
	}

	public void exam6() {
		for ( i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(i + j + 1);
			}
			System.out.println();
		}
	}

	public void exam7() {
		for ( i = 0; i < 5; i++) {

			for ( j = 5; j >= 9; j--) {
				System.out.print(i + j + 1);
			}
			System.out.println();
		}

	}

	public void exam8() {
		for (i = 0, j = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void exam9() {
		for ( i = 0, j = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void exam10() {
		int i = 0;
		int j = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void exam11() {
		for (i = 1; i <= 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public void exam12() {
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public void exam13() {
		for(i=1; i<=5; i++) {
			for(j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			for (int i=2;i<=5;i++) {
				for(j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	public void exam16() {
		for(int i=0;i<5;i++){//5줄
			for(int j=0;j<4-i;j++){ //공백4.3.2.1
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){ //별 개수
				System.out.print("*"); 
			}
			System.out.println();
		} 
	}
	
	public void exam17() {
		for(i=0; i<5; i++) {//5줄
			for(j = 0; j>i+1; j--) {//공백1.2.3.4
				System.out.print(" ");
			}
			for(int j=9; j>2*i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
		
	

	

//	for (i = 0; i < 5; i++) {
//		for (j = 0; j < i; j++) {
//			System.out.print(" ");
//		}
//		for (j = 5; j > i; j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//	}

