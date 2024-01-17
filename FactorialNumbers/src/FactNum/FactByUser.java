package FactNum;

public class FactByUser {
	
	int fact = 1;
	
	public void factorial(int num)
	
	{
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		
		FactByUser f = new FactByUser();
		f.factorial(12);
		
	}

}
