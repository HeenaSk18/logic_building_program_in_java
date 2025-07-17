package ReverseAnString;

public class ReverseAnStringUsingCharacterArray {

	public static void main(String[] args) {
		String Str ="ABCD";
		String rev="";
		
		char a[]=Str.toCharArray();
		int len = a.length; //4
		for(int i=len-1;i>=0;i--)//3 2 1 0 -1
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is: "+rev);
	}

}
