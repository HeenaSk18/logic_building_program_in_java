package SwapTheTwoNumbers;

public class LogicOneWithTempVariable {

	public static void main(String[] args) {
		
		int a=10, b=20;
		int temp; 			
		
		System.out.println("Before Values of A is "+a+" and B is "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Values of A is "+a+" and B is "+b);

		
		
	}

}
