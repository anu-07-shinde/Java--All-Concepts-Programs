package CheckThePrimeNumbers;

public class Demo {

	public static void main(String[] args) {

		
		int num = 41;
		int temp = 0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i == 0)
			{
				temp ++;
			}
			
		}
			if(temp == 2)
			{
				System.out.println(num + " ïs prime number");
			}
			
			else
			{
				System.out.println(num + " is not prime number");
			}
		}
	
}
