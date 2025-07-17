package ReverseAnString;

public class ReverseAnStringUsingBufferClass {

	public static void main(String[] args) {
		String Str="ABCD";
		String rev="";
		StringBuffer Buf=new StringBuffer(Str);
		System.out.println("Reverse String is: "+Buf.reverse());
		
	}

}
