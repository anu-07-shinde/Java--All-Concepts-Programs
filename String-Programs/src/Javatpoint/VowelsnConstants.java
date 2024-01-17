package Javatpoint;

public class VowelsnConstants {

	public static void main(String[] args) {

		int vCount = 0;
		int cCount = 0;
		
		
		String str = "My name is Anuradha Shinde.";
		
		
		str = str.toLowerCase();
		
	
		for (int i = 0; i < str.length(); i++) {
			
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
				
			}
			
			else if(str.charAt(i)>='a'||str.charAt(i)<= 'z')
			{
				cCount++;
			}
		}
		
		System.out.println("Total Numbers of vowel: "+vCount);
		System.out.println("Number of Consonants: "+cCount);
	}

}
