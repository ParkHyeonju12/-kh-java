package kh.java.func;

import java.util.Scanner;

public class ForExam2 {
	 public void exam1() {
	        /*Q1*/
	        for(int i=0; i<5; i++) {
	            System.out.print("*");
	        }
	    }
	    
	    public void exam2() {
	        
	        for(int i=0; i<5; i++) {
	            System.out.println("*");
	        }
	    }
	    
	    public void exam3() {
	        for (int i = 0; i < 5; i++) {
	            
	            for (int j = 0; j < 5; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	 
	    }
	    
	    public void exam4() {
	        for(int i=0; i<5; i++) {
	            for(int j=1; j<=5;j++) {
	                System.out.print(i+1);
	            }
	            System.out.println();
	        }
	    }
	    
	    public void exam5() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(j + 1);
	            }
	            System.out.println();
	 
	        }
	    }
	    
	    public void exam6() {
	        for (int i=0; i<5; i ++) {
	            for(int j=0; j<5; j++) {
	                System.out.print(i+j+1);
	            }
	            System.out.println();
	        } 
	    }
	    
	    public void exam7() {
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<5; j++) {
	                System.out.print(j+5-i);
	            }
	            System.out.println();
	        }
	    }
	    
	    public void exam8() {
	          
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<=i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	    
	    public void exam9() {
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<5-i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	 
	    public void exam10() {
	        for (int i = 0; i < 5; i++) {
	            
	            for (int j = 0; j < i; j++) {// 0.1.2.3.4
	                System.out.print(" ");
	            }
	 
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print("*");
	            }
	 
	            System.out.println();
	        }
	    }
	    
	    public void exam11() {
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<4-i; j++) {
	                System.out.print(" ");
	            }
	            
	            
	            for(int j=0; j<=i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam12() {
	        for (int i = 0; i < 4; i++) {
	            
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        for (int i = 0; i < 5; i++) {
	            
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam12_1() {  //exam12 다른 방법으로 if
	    	for(int i=0; i<9; i++) {
	    		if(i<5) {
	    			for(int j =0; j<=i; j++) {
	    				System.out.print("*");
	    			}
	    			System.out.println();
	    		} else {
	    			for(int j =0; j<9-i; j++) {//5-4/6-3
	    				System.out.print("*");
	    			}
	    			System.out.println();
	    		}
	    	}
	    }
	    
	    public void exam12_2() { //exam12 다른 방법으로 삼항연산자
	    	for (int i = 0; i < 9; i++) {
	    		for (int j = 0; (i < 5) ? j <= i : j < 9 - i; j++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	    public void exam13() {
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<5-i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<i+1; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam13_1() {
	    	for(int i=0; i<10; i++) {
	    	}
	    
	    }
	    
	    public void exam16() {
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<4-i; j++) {
	                System.out.print(" ");
	            } 
	            
	            for(int j=0; j<2*i+1; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    public void exam17() {
	        for(int i=0; i<5; i++) {
	        
	            for(int j=0; j<i; j++ ) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<9-2*i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam18() {
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<4-i; j++) {
	            System.out.print(" ");
	            }
	            
	            for(int j=0; j<2*i+1; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        
	        for(int i=0; i<4; i++) {
	            for(int j=0; j<=i; j++) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<7-2*i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam19() {
	        for(int i=0; i<5; i++) {
	            
	            for(int j=0; j<5-i; j++) {
	                System.out.print("*");
	            }
	            
	            for(int j=0; j<2*i+1; j++) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<5-i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        
	        for(int i=0; i<4; i++) {
	            
	            for(int j=0; j<i+2; j++) {
	                System.out.print("*");
	            }
	            
	            for(int j=0; j<7-2*i; j++) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<i+2; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    public void exam20() {
	        for(int i=0; i<5; i++) {
	            for(int j=0; j<i+1; j++) {
	                System.out.print("*");
	            }
	            for(int j=0; j<9-2*i; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<i+1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        for(int i=0; i<4; i++) {
	            for(int j=0; j<4-i; j++) {
	                System.out.print("*");
	            }
	            for(int j=0; j<3+2*i; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<4-i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	    
	    public void exam21() {
	        for(int i=0; i<5; i++ ) {
	            
	            for(int j=0; j<i+1; j++) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<9-2*i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        for(int i=0; i<4; i++) {
	            
	            for(int j=0; j<4-i; j++) {
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<3+2*i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	    
	}
