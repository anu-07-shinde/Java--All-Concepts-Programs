package MinimumOccured;

public class MinimumOccured {
	
	public static void main(String[] args) {
		
		String s = "aaaaabbccc";
		int[] array = new int[127];
		
		for(int i=0; i<s.length(); i++)
		{
			array[s.charAt(i)] = array[s.charAt(i)]+1;
			
		}
		
		int min = 128;
		char c = ' ';
		
		for(int i=0; i<s.length();i++)
		{
			if(min>array[s.charAt(i)])
			{
				min = array[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		
		
		System.out.println("Minimum: "+c);
		
	}

}