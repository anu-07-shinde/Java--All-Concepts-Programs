package Top20;

public class StringDemo2 {
	public static void main(String[] args) {
		
		
		String str = "Anuradha Shinde";
		
		char chars[] = str.toCharArray();
		
		for(int i = chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
		}
	}

}
