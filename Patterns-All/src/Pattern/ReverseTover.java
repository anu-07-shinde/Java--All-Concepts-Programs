package Pattern;

public class ReverseTover {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = 1; j <= row; j++)
			{
				
				if((i == 1 && j == 3)||(i == 2 && j == 4)||(i == 3 && j == 3))
				{
					System.out.print("*");
				}
				
				System.out.print(" ");
				
			}
			System.out.println();
		}
	
		
		for(int i = 3; i >= 1; i--)
		{
			for(int j = 3; j <= i; j++)
			{	
				if((i == 4 && j==2) || (i == 5 && j==1))
				{
					System.out.print("*");
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
}
}



