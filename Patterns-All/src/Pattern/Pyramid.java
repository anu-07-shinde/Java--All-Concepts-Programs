package Pattern;

public class Pyramid {

	public static void main(String[] args) {
		int row = 12;
		
		for(int i = 1; i <= row; i++)
		{
			
			// for the space logic is: row - i;
			
			for(int k = 1; k <= row - i; k++ )
			{
				System.out.print(" ");
			}
			
			//for the print * logic is: 2 * i -1;
			
			for(int j = 1; j <= 2 *i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i = row-1; i >= 1; i--)
//		{
//			for(int k = 1; k <= row - i; k++ )
//			{
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= 2 *i-1; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}



