package Javatpoint;

public class CountTotalChar {

	public static void main(String[] args) {
		
		String s1 = "My name is! : 'Anuradha' Jeevan Shind.";
		int count = 0;
		
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)!= 0)
			{
				count++;
			}
			
			
		}
		
		System.out.println("Total number of characters: " + count);
		
		
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)=='!' || s1.charAt(i)==':'||s1.charAt(i)=='.')
			{
				count++;
			}
			
		}
		System.out.println("Total punctuations character in given string: " + count);
	}
	
	 

}
