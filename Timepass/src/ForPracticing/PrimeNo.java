package ForPracticing;

public class PrimeNo {
	
	public static void main(String[] args) {
		

		int i, j;
		System.out.println("Tne Prime Numbers are: ");
		
		for(i=2; i<=100; i++)
		{
			for(j=2; j<100; j++)
			{
				if(i%j == 0)
				{
					break;
				}
			}
			
			if(i == j)
			{
				System.out.println(i+" ");
			}
		}
		
	}
	}



