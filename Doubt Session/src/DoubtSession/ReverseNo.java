package DoubtSession;

public class ReverseNo {

	public static void main(String[] args) {
		
		int Rev = 0;
		int number = 7875335;
		int Rem;
		
		
		while(number > 0)
			
		{
			Rem = number % 10;
			
			Rev = Rev * 10 + Rem;
			
			number = number / 10;
			
		}
		
			System.out.println("Reverse number is: " +Rev);

	}

}
