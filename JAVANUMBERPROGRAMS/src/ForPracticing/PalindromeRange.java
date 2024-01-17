package ForPracticing;

public class PalindromeRange {
	public static void main(String[] args) {
		
		
		int rem, sum=0;
		
	
		for( int num=0; num<100; num++)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
			System.out.println(num);
			
		}
		
		
	}

}
