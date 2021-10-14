package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int temp=n;
//		int sum=0;
//		while(temp>0) {
//			int lastDigit =temp%10;
//			temp/=10;
//			sum+=lastDigit;
//		}
//		System.out.println("sum of the digit "+n+" is "+sum);
		
		// to find the number of digit in a number - log(n)+1, 10^x=number, here x is log(n)
//      int numberOfDigit = (int) (Math.log10(n)+1);
//      System.out.println(numberOfDigit);
		
		//Pelindrome number
		int temp =n;
		int reversedNumber=0;
		while(temp>0) {
			int lastDigit=temp%10;
			reversedNumber=reversedNumber*10+lastDigit;
			temp/=10;
		}
		if(reversedNumber==n) {
			System.out.println(n+" is a pelindrome number");
		}else {
			System.out.println(n+" is not a pelindrome");
		}
	}

}
