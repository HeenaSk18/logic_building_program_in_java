package FindTheLargestNumber;

import java.util.Scanner;

public class FindTheLargestNumberLogic2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a =sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter Thrid Number");
		int c=sc.nextInt();
		
		int largest1 = a>b?a:b;
		int largest2=c>largest1?c:largest1;
		
//		int largest=c>largest1?c:largest1; // first option
		
		int lergest=c>(a>b?a:b)?c:(a>b?a:b); //second option
		System.out.println(largest2+" is Largest Number");
	}

}
