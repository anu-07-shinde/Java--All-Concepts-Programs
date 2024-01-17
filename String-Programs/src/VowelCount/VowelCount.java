package VowelCount;

public class VowelCount {
	
	public static void main(String[] args) {
		
		int vCount = 1;
		
		String str = "India is my country";
		
		System.out.println("String: "+str);
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++;
			}
		}
		
		System.out.println("Vowel Count: "+vCount);
		
	}

}
