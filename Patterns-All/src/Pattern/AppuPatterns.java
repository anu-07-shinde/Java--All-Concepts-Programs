package Pattern;

public class AppuPatterns {
	
	public static void main(String[] args) {
		
		int row = 6;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			for(int k=1; k<=2*(row-i); k++)
			{
				System.out.print("  ");
			}
			
			for(int m=1; m<=i; m++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			for(int k=1; k<=2*(row-i); k++)
			{
				System.out.print("  ");
			}
			
			for(int m=1; m<=i; m++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
