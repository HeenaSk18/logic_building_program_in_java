package ReverseAnInteger;

import java.util.Scanner;

public class ReverseAnIntegerLogicFourWithStringBuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number: ");
		int num=sc.nextInt();
		
		StringBuilder build=new StringBuilder();
		build.append(num);
		StringBuilder rev=build.reverse();
		System.out.println("Reverse Number is: "+rev);
	}

}
