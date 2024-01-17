package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Anuradha";
		
		String rev = "";
		
		System.out.print("Given String: " + s);
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		
		System.out.print("\nReversed String: "+rev);
		
	}
		
}
