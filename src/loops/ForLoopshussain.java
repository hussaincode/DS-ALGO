package loops;

import java.util.Scanner;

public class ForLoopshussain {

	public static void main(String[] args) {
		//sum of all the integer from 1 to n
//		Scanner sc= new Scanner(System.in);
//		int sum =0;
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		for(int i =1; i<=n; i++) {
//			sum = sum+i;
//		}
//		System.out.println("sum of all number is:"+sum);
		
		//Reverse Counting
//		for(int i=100; i>0; i--) {
//			System.out.println(i);
//		}

		// Table
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of table");
//		int tableOf=sc.nextInt();
//		for(int i=1; i<=10; i++) {
//			System.out.println( tableOf*i);
//		}
		
		//Fcatorial
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of afctorial");
//		int n =sc.nextInt();
//		int factorial =1;
//		for(int i=n;i>0;i--) {
//			factorial =factorial*i;
//		}
//		System.out.println(factorial);
		
		//Fibonacci  number
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a=0;
//		int b=1;
//		System.out.print(a+ " ");
//		System.out.print(b + " ");
//		
//		for(int i=0;i<n-2;i++) {
//			int c =a+b;
//			System.out.print(c+ " ");
//			a=b;
//			b=c;
//		}
		
		//find the power of x^y
//		Scanner sc = new Scanner(System.in);
//		int x=sc.nextInt();
//		int y = sc.nextInt();
//		int res=1;
//		for(int i=0;i<y;i++) {
//			res*=x;
//		}
//		System.out.println(res);
		
		//Prime Number
//		Scanner sc = new Scanner(System.in);
//     	int n=sc.nextInt();
//		boolean isPrime= true;
//		for(int i=2;i<n;i++) { // we can write i*i<n for better algo i< root of n
//			if(n%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		if(n<2) isPrime=false;
//		System.out.println("isPrime "+isPrime);
		
		//series sum
//		Scanner sc = new Scanner(System.in);
//    	int n=sc.nextInt();
//    	float result =0;
//    	for(float i=1;i<=n;i++) {
//    		if(i%2==0) {
//    			result -=1/i;
//    		}else {
//    		result +=1/i;
//    		}
//    	}
//    	System.out.println(result);
		
		//break example
//		Scanner sc = new Scanner(System.in);
//     	int n=sc.nextInt();
//     	for(;;) {          //Infinite loop
//     		if(n<0) break;
//     	}
		
		//Continue example
//     	for(int i=0;i<=100;i++) {
//     		if(i>40 && i<=50) continue;
//     		System.out.println(i);
//     	}
		
		// Nested For loop
//		for(int j=1;j<=10;j++) {
//		   for(int i=1;i<=20;i++) {   
//     		System.out.print(i+" ");
//		   }
//		   System.out.println();
//		}
		
		//Table for 1 to 20
		for(int j=1;j<=20;j++) {
			   for(int i=1;i<=10;i++) {   
	     		System.out.print(i*j+" ");
			   }
			   System.out.println();
			}
		
	}

}
