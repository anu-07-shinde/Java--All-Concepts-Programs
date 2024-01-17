package Pattern;

public class PrintPattern5 {
	public static void main(String[] args) {
		
		int n =5;
		int i, j;
		
		for(i = 1; i <= n; i++)
		{
			for(j = 2*(n-i); j >= 1; j--)
			{
				System.out.print("");
			}
			
			for(j = 1; j <= i; j++)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
