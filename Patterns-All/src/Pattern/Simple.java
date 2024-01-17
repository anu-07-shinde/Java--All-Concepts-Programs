package Pattern;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	
		for(int i = 185; i >= 126; i--)
		{
			
			System.out.println(i);
			
			
		}
		
		System.out.println("Even Numbers: ");
		for(int i = 185; i >= 126; i--)
		{
			
			
			if(i % 2 == 0)
			{
				System.out.println(i);	
			}
			
		
			
			
		}
		
		System.out.println("Number is divisible by 5");
		
		for(int i = 185; i >= 126; i--)
			
		{
			if( i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Addition of odd numbers: ");
			
		for(int i = 185; i >= 126; i--)
		{
			
			
			if(i % 2 != 0)
			{
				sum = sum + i;
				
			}
			
		}
		System.out.println(sum);

	}

}
