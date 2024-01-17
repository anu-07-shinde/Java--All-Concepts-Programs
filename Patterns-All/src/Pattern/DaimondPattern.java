 package Pattern;

public class DaimondPattern {
	public static void main(String[] args) {
		
		int row =5;
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = row; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			
			for(int q = 2; q <= i; q++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
