package loops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// n*n pattern
		Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
//    	for(int i=0;i<n;i++) {
//    		for(int j=0;j<n;j++) {
//    		System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
    	//1 to n pattern
//    	for(int i=1;i<=n;i++) {
//    		for(int j=1;j<=i;j++) {
//    		System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
    	
    	//n to 1 pattern
//    	for(int i=1;i<=n;i++) {
//    		for(int j=n;j>=i;j--) {
//    		System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
    	
    	// n to 1 pattern 
//    	for(int i=1;i<=n;i++) {
//    		for(int j=1;j<=i-1;j++) {
//    		System.out.print("  ");
//    		}
//    		for(int j=1;j<=n-i+1;j++) {
//    			System.out.print("* ");
//    		}
//    		System.out.println();
//    	}
    	
//    	for(int i=1;i<=n;i++) {
//    		for(int j=1;j<n-i;j++) {
//    			System.out.print("  ");
//    		}
//    		for(int j=1;j<=i;j++) {
//    			System.out.print(" *  ");
//    		}
//    		System.out.println();
//    	}
   
    	// number pyramid
//    	int number=1;
//    	for(int i=1;i<=n;i++) {
//    		for(int j=1;j<=n-i;j++) {
//    			System.out.print("  ");
//    		}
//    	    for(int j=1;j<=i;j++) {
//    	    	System.out.print(number+"  ");
//    	    	number++;
//    	    }	
//    	    System.out.println();
//    	}
    	
    	// forward star pattern
//    	int rows =2*n-1;
//    	for(int i=1;i<=rows;i++) {
//    		if(i<=n) {
//    		   for(int j=1;j<=i;j++) {
//    			System.out.print("* ");
//    		   }
//    		}else {
//    			for(int j=1;j<=rows-i+1;j++) {
//    				System.out.print("* ");
//    			}
//    		}
//    		System.out.println();
//	}
    	
    	//space in between pattern (Edge Cases)
    	System.out.println("*");
    	for(int i=2;i<=n-1;i++) {
    		System.out.print("* ");
    		for(int j=1;j<=i-2;j++) {
    			System.out.print("  ");
    		}
    		System.out.print("* ");
    		System.out.println();
    	}
    	if(n>1) {
    		for(int i=1;i<=n;i++) {
    			System.out.print("* ");
    		}
    	}
	}

}
