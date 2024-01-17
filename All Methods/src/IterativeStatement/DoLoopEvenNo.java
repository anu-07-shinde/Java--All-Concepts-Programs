package IterativeStatement;

public class DoLoopEvenNo {

	public static void main(String[] args) {

		int i = 1;
		
		do {
			if( i % 2 == 0) {
				System.out.println(i);
			}
			
			i++;
			
			
		}while(i<=10);
		
		
		System.out.println("********************************** ");
		
		// Print even no in reverse format
		
		int j = 10;
		
		do {
			if( j % 2 == 0)
			{
				System.out.println(j);
			}
			j--;
		}while(j>=1);

	}

}
