package ForPracticing;

public class CheckPrimeNo {
	

	public static void main(String[] args)
	{
		int num=19;
		int temp=0;
		
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				temp = temp +1;
				
			}
		}
		
		if(temp == 2)
		{
			System.out.println(num + " Num is prime");
		}else {
			System.out.println(num + " Num is not prime");
		}
	}
		
	}
	
	

