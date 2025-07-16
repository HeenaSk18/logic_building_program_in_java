package SwapTheTwoNumbers;

public class LogicThreeWithBitwiseOperator {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before Values of A is "+a+" and B is "+b);
		
		a=a^b; 
		b=a^b;
		a=a^b;
		
		System.out.println("After Values of A is "+a+" and B is "+b);


	}

}
