package Pattern;

public class PrintPattern2 {

	public static void main(String[] args) {

		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= i; j++)
			{
//				System.out.print(j);
				
				System.out.print(i);
			}
			System.out.println();
			
		}
			
			for(int r = 1; r <= 4; r++)
			{
				for(int c = 4; c >= r; c--)
				{
					System.out.print(r);
				}
				System.out.println();
			}
		}

	}


