package Pattern;

public class Square {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				if((i == 2 && j == 2)|| (i == 2 && j == 3) )
				{
					System.out.print("1");
				}
				if((i == 3 && j == 2) || (i == 3 && j == 3))
				{
					System.out.print("2");
				}else {
					
					System.out.print((char)(64 + i));
				}
				
				
				
			}
			System.out.println();
		}
		
	}

}
